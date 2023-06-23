package ra;

import java.util.Scanner;

public class Color {
    private int id;
    private String colorName;

    public Color() {
    }

    public Color(int id, String colorName) {
        this.id = id;
        this.colorName = colorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên màu");
        colorName = sc.nextLine();
    }
    public void displayData(){
        System.out.printf("%-10d %-20s \n",id,colorName);
    }
}