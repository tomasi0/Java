package Java0329;

public class Product {
    private  String name;
    private double price;
    private Category categoru;

    public Product(String name, double price, Category categoru) {
        this.name = name;
        this.price = price;
        this.categoru = categoru;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategoru() {
        return categoru;
    }

    public void setCategoru(Category categoru) {
        this.categoru = categoru;
    }
}

