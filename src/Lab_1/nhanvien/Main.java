 


package nhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Employee> employees = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);
    public InputHandler input = new InputHandler();

    public void nhap1(){
        System.out.printf("nhap tên nhân viên: ");
        String name = sc.nextLine();
        System.out.printf("Nhập mã nhân viên: ");
        String manv = sc.nextLine();
        System.out.printf("Nhập basic Salary: ");
        double salary = input.inputDoubleNotNull("Nhập Salary: ");
         
        double bonus = input.inputDoubleNotNull("Nhập bonus");

        double penalty = input.inputDoubleNotNull("Nhập penalty: ");

        employees.add(new FullTimeEmployee(manv, name, salary, bonus, penalty));

    }




        public void nhap2(){
        System.out.printf("nhap tên nhân viên: ");
        String name = sc.nextLine();
        System.out.printf("Nhập mã nhân viên: ");
        String manv = sc.nextLine();
        System.out.printf("Nhập basic Salary: ");
        double salary = input.inputDoubleNotNull("Nhập Salary: ");
         
        double workingHours = input.inputInt("Nhập giờ làm việc: ");

        double hourlyRate = input.inputInt("Nhập mức lương theo giờ: ");

        employees.add(new FullTimeEmployee(manv, name, salary, workingHours, hourlyRate));

    }
    public void nhap(){
        System.out.println("Chương trình nhập nhân viên");
        for (int i = 0; i < 1; i++) {
          
        }
    }





}
