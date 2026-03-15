package modelproduct;

public   class Product {
    
private String id;
    private String name;
    private double basePrice;

    // Constructor đầy đủ
    public Product(String id, String name, double basePrice) {
        // Gọi thẳng hàm set để xài luôn cái Validate ở bên dưới
        setId(id);
        setName(name);
        setBasePrice(basePrice);
    }

    // --- GETTER & SETTER CÓ VALIDATE ---
    public String getId() {
        return id;
    }

    public void setId(String id) {
        // id không rỗng
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Lỗi: ID không được để trống!");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        // basePrice >= 0
        if (basePrice < 0) {
            throw new IllegalArgumentException("Lỗi: Giá cơ bản phải >= 0!");
        }
        this.basePrice = basePrice;
    }

    // --- METHODS ---
    public double finalPrice() {
        return this.basePrice; // Mặc định là basePrice
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Base Price: %,.1f | Final Price: %,.1f", 
                id, name, basePrice, finalPrice());
    }
}
    

