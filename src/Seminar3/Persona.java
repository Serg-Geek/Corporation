package Seminar3;

import java.util.Scanner;

public class Persona {

    String pFIO;
    String pGender;
    int pAge;

    public Persona(String PFIO, String PGender,int PAge){
        this.pFIO = PFIO;
        this.pAge = PAge;
        this.pGender = PGender;
    }

    public void setpFIO(String pFIO) {
        this.pFIO = pFIO;
    }

    public int getpAge() {
        return pAge;
    }

    public String getpFIO() {
        return pFIO;

    }

    public String getpGender() {
        return pGender;
    }


    public boolean agree(TDepartament dept) {
        System.out.println("Add to department: " + dept.deptName + " " + "?");
        Scanner in = new Scanner(System.in);
        System.out.println("0 -- no\n1 -- yes");
        int choice = in.nextInt();
        return  choice != 0;
    }
    @Override
    public String toString(){
        return "FIO: " + pFIO + "Age: "+ pAge;
    }
}
