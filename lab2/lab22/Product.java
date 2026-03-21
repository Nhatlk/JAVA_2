package lab22;

public class Product {
    private String id;
    private String name;
    private double price;
    TypeProduct Type;





    
    public Product(String id, String name, double price, TypeProduct type) {
        this.id = id;
        this.name = name;
        this.price = price;
        Type = type;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public TypeProduct getType() {
        return Type;
    }
    public void setType(TypeProduct type) {
        Type = type;
    }
    
}
