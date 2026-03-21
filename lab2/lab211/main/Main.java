package lab211.main;

import java.util.ArrayList;
import lab211.model.Student;
import lab211.studenttype.StudentType;
import inputhandler.InputHandler;
public class  Main{
    public ArrayList <Student> list = new ArrayList<>();
    public InputHandler input = new InputHandler();
    public void listFixed(){
        
        list.add(new Student("SV01", "Nguyễn Văn An", 0, StudentType.REGULAR));
        list.add(new Student("SV02", "Trần Thị Bình", 0, StudentType.REGULAR));

        // --- 2. Hai Sinh viên Bán thời gian (PartTime) ---
        // Giả sử Constructor: (id, name, salary, type, workingHours)
        list.add(new Student("SV03", "Lê Hoàng Cường", 3500000, StudentType.PARTTIME));
        list.add(new Student("SV04", "Phạm Thu Dung", 4200000, StudentType.PARTTIME));

        // --- 3. Hai Sinh viên Quốc tế (International) ---
        // Giả sử Constructor: (id, name, salary, type, tuitionFee, country)
        list.add(new Student("SV05", "David Beckham", 0, StudentType.INTERNATIONAL));
        list.add(new Student("SV06", "Lisa Manoban", 0, StudentType.INTERNATIONAL));
    }

    public void xuat(){

        for (Student x : list) {
            x.xuat();
        }
    }

    public void displayToType(){

        System.out.println("\n=== THỐNG KÊ VÀ HIỂN THỊ THEO TỪNG LOẠI ===");

        for (StudentType loai : StudentType.values()) {
            
            System.out.println("\n--- Loại sinh viên: " + loai.name() + " ---");
            int dem = 0; 
            
            for (Student x : list) {
                
                if (x.getType() == loai) { 
                    x.xuat();  
                    dem++;     
                }
            }
            
            System.out.println("Tổng số lượng loại này là: " + dem);
            
            if (dem == 0) {
                System.out.println("(Không có sinh viên nào)");
            }
        }
            }







}