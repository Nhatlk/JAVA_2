package lab_test.model;

import lab_test.enumm.StudentType;

public class Regular extends Student{
    private double tuitionFee;

    public Regular(String id, String name, double salary, double tuitionFee) {
        
        super(id, name,salary, StudentType.REGULTI  ); 
        this.tuitionFee = tuitionFee;
    }

    public double getTuitionFee() { 
        return tuitionFee; 
    }

    @Override
    public void xuat() {
        throw new UnsupportedOperationException("Unimplemented method 'xuat'");
    }


}
