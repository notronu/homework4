// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        }
        int age1 = 16;
        if (age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + ",то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temperature = 7;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        int temperature1 = 2;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градуса, нужно надеть шапку");
        }

        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ",то придется заплатить штраф");
        }
        int speed1 = 55;
        if (speed1 < 60) {
            System.out.println("Если скорость " + speed1 + ",то можно ездить спокойно");
        }

        System.out.println("Задача 4");
        int yearOld = 4;
        if (yearOld >= 2 && yearOld <= 6) {
            System.out.println("Если возраст человека равен " + yearOld + " ,то ему нужно ходить в садик");
        } else {
            System.out.println("Если возраст человека равен " + yearOld + " ,то ему не нужно ходить в садик");
        }
        int sasha = 17;
        if (sasha >= 7 && sasha <= 17) {
            System.out.println("Если возраст человека равен " + sasha + " ,то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека равен " + sasha + " ,то ему не нужно ходить в школу");
        }
        int vasya = 18;
        if (vasya >= 18 && vasya <= 24) {
            System.out.println("Если возраст человека равен " + vasya + " ,то ему нужно ходить в универ");
        } else {
            System.out.println("Если возраст человека равен " + vasya + " ,то ему не нужно ходить в универ");
        }
        int anna = 26;
        if (anna > 24 ) {
            System.out.println("Если возраст человека равен " + anna + " ,то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + anna + " ,то ему не нужно ходить на работу");
        }

        System.out.println("Задача 5");
        int kid = 7;
        if (kid < 5) {
            System.out.println("Если возраст ребенка равен " + kid + " ,то он не может кататься на аттракционе"  );
        }
        if (kid > 5 && kid <14) {
            System.out.println("Если возраст ребенка равен " + kid + " ,то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
          else {
            System.out.println("Если возраст ребенка равен " + kid + " ,то он может кататься без сопровождения взрослого.");
        }

        System.out.println("Задача 6");
        int van = 102;
        int seating = 60;
        int people = 50;
        if (people >= 60 && people < 102) {
            System.out.println("Если в вагоне " + people + " человек, то в вагоне есть стоячие места" );
        }
        if (people < 60) {
            System.out.println("Если в вагоне " + people + " человек, то в вагоне есть стоячие и сидячие места" );
        } else {
            System.out.println("Если в вагоне " + people + " человека, то в вагоне мест нет " );
        }

        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two ) {
            System.out.println("Наибольшее число one");
        }
        if (two > three ) {
            System.out.println("Наибольшее число two");
        } else {
            System.out.println("Наибольшее число three");
        }

















    }
}