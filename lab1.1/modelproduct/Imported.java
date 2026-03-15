
package modelproduct;
public class Imported extends Product {
  private double importTaxRate;
    private double shippingFee;

    public Imported(String id, String name, double basePrice, double importTaxRate, double shippingFee) {
        super(id, name, basePrice);
        setImportTaxRate(importTaxRate);
        setShippingFee(shippingFee);
    }

    public double getImportTaxRate() {
        return importTaxRate;
    }

    public void setImportTaxRate(double importTaxRate) {
        if (importTaxRate < 0 || importTaxRate > 1) {
            throw new IllegalArgumentException("Lỗi: Thuế nhập khẩu phải từ 0.0 đến 1.0!");
        }
        this.importTaxRate = importTaxRate;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(double shippingFee) {
        if (shippingFee < 0) {
            throw new IllegalArgumentException("Lỗi: Phí vận chuyển phải >= 0!");
        }
        this.shippingFee = shippingFee;
    }

    @Override
    public double finalPrice() {
        return super.getBasePrice() + (super.getBasePrice() * this.importTaxRate) + this.shippingFee;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Tax: %.2f | Ship: %,.1f (Imported)", 
                importTaxRate, shippingFee);
    }
}
