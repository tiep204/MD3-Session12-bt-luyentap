import ra.Brand;
import ra.Category;
import ra.Color;
import ra.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static List<Category> list = new ArrayList<>();
    static List<Brand> brandList = new ArrayList<>();
    static List<Color> colors = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("**************************MENU**************************");
            System.out.println("1.Quản lý sản phẩm");
            System.out.println("2.Quản lý màu");
            System.out.println("3.Quản lý hảng(Brand)");
            System.out.println("4.Quản lý loại sản phẩm");
            System.out.println("5.Thoát");
            System.out.println("Sự lựa chọn của bạn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productManager(sc);
                    break;
                case 2:
                    colorManaget(sc);
                    break;
                case 3:
                    brandManager(sc);
                    break;
                case 4:
                    categoryManager(sc);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-5");
            }
        } while (true);
    }

    // TODO: 22/06/2023 Quản lý sản phẩm
    public static void productManager(Scanner sc){
        boolean flag = true;
        do {
            System.out.println("*******************Product******************");
            System.out.println("1.Thêm");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4.Hiển thị");
            System.out.println("5.Thoát");
            System.out.println("Sự lựa chọn của bạn ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.err.println("Vui lòng chọn tử 1-4");
            }
        } while (flag);
    }
    public static void addProduct(Scanner sc){
        System.out.println("Mời bạn thêm số lượng sản phẩm mà bạn muốn thêm mới :");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("Thêm mới id: "+(i+1));
            Product product = new Product();
            product.setId(i+1);
        }
    }
    // TODO: 22/06/2023 End Quản lý sản phẩm
    // TODO: 22/06/2023 Quản lý màu
    public static void colorManaget(Scanner sc) {
        boolean flag = true;
        do {
            System.out.println("*******************Color******************");
            System.out.println("1.Thêm");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4.Hiển thị");
            System.out.println("5.Thoát");
            System.out.println("Sự lựa chọn của bạn ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addColor(sc);
                    break;
                case 2:
                    updateColor(sc);
                    break;
                case 3:
                    deleteColor(sc);
                    break;
                case 4:
                    findAllColor();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.err.println("Vui lòng chọn tử 1-4");
            }
        } while (flag);
    }

    public static void addColor(Scanner sc) {
        System.out.println("Mời bạn thêm số lượng màu: ");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("Màu số " + (i + 1));
            Color color1 = new Color();
            color1.setId(i + 1);
            color1.inputData();
            colors.add(color1);
        }
        System.out.println("Bạn đã thêm thành công " + num + " màu");
    }

    public static void findAllColor() {
        System.out.printf("%-10s %-20s \n", "id", "colorName");
        for (Color c : colors) {
            c.displayData();
        }
    }

    public static void updateColor(Scanner sc) {
        System.out.println("Mời bạn nhập id bạn muốn update: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < colors.size(); i++) {
            Color color = colors.get(i);
            if (color.getId() == id) {
                color.inputData();
                System.out.println("Bạn đã cập nhật id " + id + " thành công");
                return;
            }
        }
        System.err.println("update không thành công");
    }

    public static void deleteColor(Scanner sc) {
        System.out.println("Mời bạn nhập id bạn muốn xóa ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < colors.size(); i++) {
            Color color = colors.get(i);
            if (color.getId() == id) {
                colors.remove(i);
                System.out.println("Xóa id " + id + " thành công");
                return;
            }
        }
        System.err.println("Xóa không thành công");
    }

    // TODO: 22/06/2023 End Quản lý màu
    // TODO: 22/06/2023 Quản lý hãng
    public static void brandManager(Scanner sc) {
        boolean flag = true;
        do {
            System.out.println("*******************Brand******************");
            System.out.println("1.Thêm");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4.Hiển thị");
            System.out.println("5.Thoát");
            System.out.println("Sự lựa chọn của bạn ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addBrand(sc);
                    break;
                case 2:
                    updateBrand(sc);
                    break;
                case 3:
                    deleteBrand(sc);
                    break;
                case 4:
                    findAllBrand();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.err.println("Vui lòng chọn tử 1-4");
            }
        } while (flag);
    }

    public static void addBrand(Scanner sc) {
        System.out.print("Mời bạn nhập số hãng mà bạn muốn thêm: ");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("Mời bạn nhập hãng số " + (i + 1));
            Brand brand = new Brand();
            brand.setId(i + 1);
            brand.inputData();
            brandList.add(brand);
        }
        System.out.println("Bạn đã thêm thành công " + number + " hãng");
    }

    public static void findAllBrand() {
        System.out.printf("%-10s %-20s \n", "id", "brandName");
        for (Brand b : brandList) {
            b.displayData();
        }
    }

    public static void updateBrand(Scanner sc) {
        System.out.print("Mời bạn nhập id hãng mà bạn muốn cập nhật: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < brandList.size(); i++) {
            Brand brand = brandList.get(i);
            if (brand.getId() == id) {
                brand.inputData();
                System.out.println("bạn đã cập nhật id " + id + " thành công");
                return;
            }
        }
        System.out.println("bạn cập nhật không thành công ");
    }

    public static void deleteBrand(Scanner sc) {
        System.out.print("Mời bạn nhập id hãng mà bạn muốn xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < brandList.size(); i++) {
            Brand brand = brandList.get(i);
            if (brand.getId() == id) {
                brandList.remove(i);
                System.out.println("bạn đã xóa id " + id + " thành công");
                return;
            }
        }
        System.out.println("bạn xóa không thành công ");
    }
    // TODO: 22/06/2023 End Quản lý hãng

    // TODO: 22/06/2023 Quản lý loại sản phẩm
    public static void categoryManager(Scanner sc) {
        boolean flag = true;
        do {
            System.out.println("*******************Category******************");
            System.out.println("1.Thêm");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4.Hiển thị");
            System.out.println("5.Thoát");
            System.out.println("Sự lựa chọn của bạn ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    add(sc);
                    break;
                case 2:
                    update(sc);
                    break;
                case 3:
                    delete(sc);
                    break;
                case 4:
                    findAll();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.err.println("Vui lòng chọn tử 1-4");
            }
        } while (flag);
    }

    public static void add(Scanner sc) {
        System.out.print("Mời bạn nhập số lượng danh mục bạn muốn them: ");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("Mời bạn nhập thông tin danh mục: " + (i + 1));
            Category category = new Category();
            category.setId(i + 1);
            category.inputData();
            list.add(category);
        }
        System.out.println("Bạn đã thêm " + num + " danh mục \n");
    }

    public static void findAll() {
        System.out.printf("%-10s %-20s \n", "id", "categoryName");
        for (Category c : list) {
            c.displayData();
        }
    }

    public static void delete(Scanner sc) {
        System.out.print("Mời bạn nhập id danh mục bạn muốn xóa:");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            Category category = list.get(i);
            if (category.getId() == id) {
                list.remove(i);
                System.out.println("xóa thành công");
                return;
            }
        }
        System.out.println("Xóa Không thành công");
    }

    public static void update(Scanner sc) {
        System.out.print("Mời bạn nhập id danh mục bạn muốn cap nhat:");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            Category category = list.get(i);
            if (category.getId() == id) {
                category.inputData();
                System.out.println("Cập nhật thành công");
                return;
            }
        }
        System.out.println("Update không thành công");
    }
    // TODO: 22/06/2023 End Quản lý sản phẩm
}