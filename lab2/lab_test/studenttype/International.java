package lab_test.studenttype;
import lab_test.model.Student;
import lab_test.enumm.StudentType;
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
