import java.util.ArrayList;

import modelproduct.Product;
import modelproduct.Imported;
public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();

        // 1. Tạo tối thiểu 5 sản phẩm (Ít nhất 2 imported)
        // Cố tình truyền dữ liệu chuẩn để không bị văng lỗi Validate
        list.add(new Product("SP01", "Bút bi Thiên Long", 5000));
        list.add(new Product("SP02", "Tập 100 trang", 12000));
        list.add(new Product("SP03", "Thước kẻ", 3000));
        
        // Thuế 10% (0.1), Ship 20k
        list.add(new ImportedProduct("IMP01", "Bàn phím Logitech", 500000, 0.1, 20000)); 
        // Thuế 20% (0.2), Ship 50k
        list.add(new ImportedProduct("IMP02", "Chuột Razer", 800000, 0.2, 50000));     

        // 2. In danh sách + giá cuối cùng (Hàm toString đã gánh việc này)
        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        for (Product p : list) {
            System.out.println(p.toString());
        }

        // 3. Tìm sản phẩm có finalPrice() cao nhất
        if (!list.isEmpty()) {
            Product maxProduct = list.get(0);
            for (Product p : list) {
                if (p.finalPrice() > maxProduct.finalPrice()) {
                    maxProduct = p;
                }
            }

            System.out.println("\n=== SẢN PHẨM CÓ GIÁ CUỐI CÙNG CAO NHẤT ===");
            System.out.println(maxProduct.toString());
        }
    }
}