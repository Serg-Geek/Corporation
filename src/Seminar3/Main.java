package Seminar3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TCorporation MyCorp = new TCorporation();

        MyCorp.AddDepartament(new TMainDepartment("IT"));
        MyCorp.AddDepartament(new TServiceDepartament("Accounting",38));
        MyCorp.AddDepartament(new TServiceDepartament("Security",2));
        while (true){
            Persona worker = getPersona();
            if (worker == null){
                break;
            }
            System.out.println(worker);
            MyCorp.Hire(worker);
        }
        MyCorp.lstPersons();
        MyCorp.RelocateFromDept(MyCorp.listDepartament.get(0));
        MyCorp.lstPersons();
    }

    public  static Persona getPersona(){

        Scanner in = new Scanner(System.in);
        String FIO;
        String Gender;
        int Age;
        System.out.println("-".repeat(25));
        System.out.println("Введите данные соискателя: " +
                "\n если закончили оставте ФИО пустым и нажмите ENTER");
        System.out.println("FIO : ");
        FIO= in.nextLine();
        if (FIO.length()==0){
            return null;
        }
        System.out.println("Gender: ");
        Gender = in.nextLine();
        System.out.println("Age: ");
        Age= in.nextInt();

        return  new Persona(FIO,Gender, Age);

    }

}