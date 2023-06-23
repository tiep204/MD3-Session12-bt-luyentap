package ra;

import java.util.Scanner;

public class Category {
    private int id;
    private String categoryName;

    public Category() {
    }

    public Category(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập Tên danh mục");
        categoryName = sc.nextLine();
    }
    public void displayData(){
        System.out.printf("%-10d %-20s \n",id,categoryName);
    }
}