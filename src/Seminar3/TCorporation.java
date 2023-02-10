package Seminar3;

import java.util.ArrayList;
import java.util.Scanner;

public class TCorporation {

       ArrayList<TDepartament> listDepartament = new ArrayList<>();

    public void AddDepartament(TDepartament dept) {
        listDepartament.add(dept);
    }

    public void Hire(Persona worker) {
        int choice= ChoiceDept();

        if (worker.agree(listDepartament.get(choice))) {
            listDepartament.get(choice).addPeople(worker);
            System.out.println("Congratulation, you are hired!!!");
            return;
        }
        System.out.println("Goodbye " + worker.pFIO);
    }

    public void lstPersons() {

        for (TDepartament dept : listDepartament) {
            System.out.println(dept.deptName);
            dept.lst();
            System.out.println("==============================================================");

        }
    }

    public void lst(){
        for (int i = 0;  i <  listDepartament.size(); i++){
            System.out.println(i + "  " + listDepartament.get(i).deptName);

        }
    }

    public void RelocateFromDept(TDepartament departament) {
        System.out.println("-".repeat(25));
        System.out.println(" Выберите сотрудника  для перевода из отдела "+departament.deptName);
        System.out.println("---->>>>");
        departament.lst();
        Scanner in = new Scanner(System.in);
        int personIndex;

        personIndex = in.nextInt();
        Persona persona =  departament.personaInDept.get(personIndex);
        System.out.println("В какой отдел переводим сотрудника" + " " + persona.pFIO);
        this.lst();

        int deptIndex;
        System.out.println("-".repeat(25));
        System.out.println(" Выберите отдел  куда переводим   ");
        System.out.println("---->>>>");
        deptIndex = in.nextInt();
        departament.fire(personIndex);
        this.listDepartament.get(deptIndex).addPeople(persona);


    }

    public int ChoiceDept() {

        Scanner in = new Scanner(System.in);
        int Dept;
        System.out.println("-".repeat(25));
        System.out.println(" В какой отдел нанять сотрудника?  " +
                "\n нажмите 1 - IT" +
                "\n нвжмите 2 - Бухгалтерия " +
                "\n нажмите 3 - Охрана ");
        System.out.println("---->>>>");
        Dept = in.nextInt();
        return Dept - 1;
    }

}