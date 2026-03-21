package lab_test.model;
import lab_test.enumm.StudentType;
//import lab_test.modelstudent.Student;
public class International extends Student{
     private double tuitionFee;
     private String counTry;

    

     

    


     public International(String id, String name, double salary, StudentType type, double tuitionFee, String counTry) {
        super(id, name, salary, StudentType.INTERNATIONAL);
        this.tuitionFee = tuitionFee;
        this.counTry = counTry;
    }
     public double getTuitionFee() {
         return tuitionFee;
     }
     public void setTuitionFee(double tuitionFee) {
         this.tuitionFee = tuitionFee;
     }
     public String getCounTry() {
         return counTry;
     }
     public void setCounTry(String counTry) {
         this.counTry = counTry;
     }
     @Override
     public void xuat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'xuat'");
     }

     



}
