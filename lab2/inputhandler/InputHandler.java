package inputhandler;

 
    
import java.util.Scanner;

public final class InputHandler {
    // final đã dc update
     public static Scanner sc = new Scanner(System.in);

    public static Double inputDouble(String input) {
        double n;
        while (true) {
            try {
                System.out.println(input);
                String nhap = sc.nextLine().trim();
                if (nhap.isEmpty()) {
                    return null;
                }
                n = Double.parseDouble(nhap);
                if (n >= 0) {
                    return n;
                } else {
                    System.out.println("Vui lòng nhập số dương");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập số không hợp lệ, vui lòng nhập lại");
            }
        }
    }

    public static Double inputDoubleNotNull(String input) {
        // mọi Static được update
        while (true) {
            Double input2 = inputDouble(input);
            if (input2 != null) {
                return input2;
            }
            System.out.println("Không được để trống chỗ này");
        }

    }

    public static String inputString(String thongBao) {

        System.out.println(thongBao);
        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            return null;
        }

        return input;

    }

    public static String inputStringNotNull(String thongBao) {

        while (true) {
            String ketQua = inputString(thongBao);
            if (ketQua != null) {
                return ketQua;
            }
        }

    }

    public static  int inputInt(String thongBao) {
        while (true) {
            try {
                System.out.println(thongBao);
                int input = Integer.parseInt(sc.nextLine());
                if (input >= 0) {
                    return input;
                } else {
                    System.out.println("Vui long nhập số nguyên không âm: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi kiểu dữ liệu vui lòng nhập lại");
            }
        }
    }

    public static boolean confirmYN(String thongBao){
        System.out.println(thongBao);
        return (sc.nextLine().equalsIgnoreCase("Y"));
    }

    public static int inputMenu(String thongBao){
        while(true){
            try{
                System.out.printf(thongBao);
                int input = Integer.parseInt(sc.nextLine());
                if(input >= 1 && input <= 3){
                    return input;
                }else System.out.println("vui long nhập từ 1 -> 3");
            }catch(NumberFormatException e){
                System.out.println("Nhập số nguyên !, vui long nhập lại");
            }
        }
    }
}

