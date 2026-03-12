/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_1.Product;

/**
 *
 * @author User
 */
public class ImportedProduct extends Product {

    private double importTaxRate;
    private double shippingFee;
    
    
    @Override
    public double finalPrice() {
        return super.getBasePrice() + (super.getBasePrice() * this.importTaxRate + this.shippingFee);
        
    }
    
    
    
}
