package lab211.model;
import lab211.studenttype.StudentType;
public class Student {
        private String id;
        private String name;
        private double salary;
        private StudentType type;

        
        public Student(String id, String name, double salary, StudentType type) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.type = type;
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
        public StudentType getType() {
            return type;
        }
        public void setType(StudentType type) {
            this.type = type;
        }
        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }

       public void xuat() {
        // %-8s : Căn trái chuỗi (String), chiếm 8 khoảng trắng
        // %-20s: Căn trái chuỗi, chiếm 20 khoảng trắng
        // %,12.0f: In số thực (Float/Double) có dấu phẩy ngăn cách hàng ngàn, 0 lấy số thập phân
        
        System.out.printf("Mã SV: %-8s | Tên: %-20s | Lương: %,12.0f VNĐ | Loại: %-15s", 
            this.id, this.name, this.salary, this.type);
    }
}
