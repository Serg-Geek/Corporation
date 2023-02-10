package Seminar3;

import java.util.ArrayList;

public abstract class TDepartament  {

    String deptName;

    ArrayList<Persona> personaInDept = new ArrayList<>();


    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void addPeople(Persona persona) {
        personaInDept.add(persona);
    }


    public void lst() {

        for (int i = 0;  i <  personaInDept.size(); i++){
            System.out.println(i + "  " + personaInDept.get(i));

        }

    }

    public void fire(int personIndex) {
        personaInDept.remove(personIndex);

    }
}
