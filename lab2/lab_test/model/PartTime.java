package lab_test.model;
import lab_test.enumm.StudentType;
public class PartTime extends Student {

    private double tuitionFee;
    
    public PartTime(String id, String name, double salary, StudentType type, double tuitionFee) {
        super(id, name, salary, StudentType.PARTTIME);
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void xuat() {
        throw new UnsupportedOperationException("Unimplemented method 'xuat'");
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

}
