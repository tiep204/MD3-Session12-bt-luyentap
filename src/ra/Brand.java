package ra;

import java.util.Scanner;

public class Brand {
    private int id;
    private String brandName;

    public Brand() {
    }

    public Brand(int id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hãng");
        brandName = sc.nextLine();
    }
    public void displayData(){
        System.out.printf("%-10d %-20s \n",id,brandName);
    }
}