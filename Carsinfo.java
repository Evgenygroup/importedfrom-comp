package de.telran.objects;

public class Carsinfo {

    public static void main(String[] args) {

        Cars car1 = new Cars("Volvo",
                "S80",
                "Black",
                2015);
        Cars car2 = new Cars("Toyota",
                "Auris",
                "White",
                1990);
        Cars car3 = new Cars("Volvo",
                "S60",
                "White",
                2017);

        Cars []car = {car1,car2,car3};

        for (int i=0;i < car.length;i++){
            System.out.println(car[i].toString());
        System.out.println("_____________________________");}

    }
}