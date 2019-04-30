package de.telran.objects;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String position;
    private int id;

    public Employee () {

    }

    public Employee(String firstName,
                    String lastName,
                     int age,
                    String gender,
                    String position,
                    int id) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.age =age;
        this.gender=gender;
        this.position=position;
        this.id=id;


    }


    public  void setFirstName(String firstName) {
        if (firstName != null && !firstName.equals(""))
       this.firstName = firstName;
    }

    public  void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    public  void setGender(String gender) {
        this.gender = gender;
    }

    public  void setPosition(String position) {
        this.position = position;
    }

    public String getPosition (){return this.position;}

    public  void setId(int id) {
        this.id = id;
    }

    public String toString()  {
        return "First name: " + firstName  + "\n" +
                "Last name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Position: " + position + "\n" +
                "ID:" + id;


    }
}