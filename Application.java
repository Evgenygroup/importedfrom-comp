package de.telran.objects;

public class Application {

    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;
        char c = 'c';
        String str =  "Our very good string";
        String nullString = null;

        System.out.println(str);
        System.out.println(nullString);

        Employee employee1 = new Employee();

        employee1.setFirstName("Vasja");
        employee1.setLastName("Pupkin");
        employee1.setAge (25);
        employee1.setGender("Male");
        employee1.setPosition("worker");
        employee1.setId(234);



        System.out.println(employee1.toString());
        System.out.println("__________________________________________");


        Employee employee2 = new Employee("Kolya",
                                          "Palkin",
                                          30,
                                          "Male",
                                          "worker",
                                          123);

        System.out.println(employee2.toString());

        System.out.println ("Position =" + employee2.getPosition());





    }
}