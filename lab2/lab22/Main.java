package lab22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
       

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Map<TypeProduct, Integer> mapDemSoLuong = new HashMap<>();
        Map<TypeProduct, Double> tinhTongTien = new HashMap<>();

        list.add(new Product("SP01", "Bánh Mì", 15000, TypeProduct.FOOD));
        list.add(new Product("SP02", "Cơm xưởng", 35000, TypeProduct.FOOD));

        list.add(new Product("SP03", "Bàn ủi", 200000, TypeProduct.electronic));
        list.add(new Product("SP04", "Đèn Học", 700000, TypeProduct.electronic));
        list.add(new Product("SP05", "Quạt", 150000, TypeProduct.electronic));

        list.add(new Product("SP06", "Áo", 100000, TypeProduct.CLOTHING));
        list.add(new Product("SP07", "Quần", 500000, TypeProduct.CLOTHING));
        list.add(new Product("SP08", "Nón", 200000, TypeProduct.CLOTHING));

        for (Product sp :  list ) {
            
            TypeProduct type = sp.getType();
            double gia = sp.getPrice();

            int soLuong = mapDemSoLuong.getOrDefault(type, 0);
            mapDemSoLuong.put(type, soLuong+1);

            double tongTien = tinhTongTien.getOrDefault(type, 0.0);
            tinhTongTien.put(type, tongTien + gia);


        }


        for (Map.Entry<TypeProduct, Integer> entry : mapDemSoLuong.entrySet()) {
            TypeProduct type = entry.getKey();
            int soLuong = entry.getValue();
            double tongTien = tinhTongTien.get(type);
            System.out.println("Loại: " + type + " | Số lượng: " + soLuong + " | Tổng tiền: " + tongTien);
        }



    }

}
