package entities;

public class Product implements Comparable<Product> {

    private int code;
    private String description;
    private int price;
    private int stock;
    private Category category;

    public Product() {
    }

    public Product(int code, String description, int price, int stock, Category category) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" + "code=" + code + ", description=" + description + ", price=" + price + ", stock=" + stock + ", category=" + category + '}';
    }

    @Override
    public int compareTo(Product o) {
        int aux;
        if (this.code == o.code) {
            aux = 0;
        } else if (this.code > o.code) {
            aux = 1;
        } else {
            aux = -1;
        }
        return aux;
    }

}
