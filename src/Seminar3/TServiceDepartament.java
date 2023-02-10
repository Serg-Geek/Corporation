package Seminar3;

public class TServiceDepartament extends TDepartament {

    public TServiceDepartament(String GropName, int office) {
        this.officeNumber = office;
        setDeptName(GropName);
    }
    public int officeNumber;


}
