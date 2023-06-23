package ra;

public class Product {
    private int id;
    private String productName;
    private float price;
    private Brand brand;
    private Color color;
    private Category category;

    public Product() {
    }

    public Product(int id, String productName, float price, Brand brand, Color color, Category category) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}