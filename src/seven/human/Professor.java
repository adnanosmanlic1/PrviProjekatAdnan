package seven.human;

import seven.Gender;
import seven.animal.Dog;

public class Professor extends Employe {
    private String academicTitle;


    public String getAcademicTitle() {
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    @Override
    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount=salaryAmount+500;
    }


}

