// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ",то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temperature = 7;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }

        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ",то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ",то можно ездить спокойно");
        }

        System.out.println("Задача 4");
        int yearOld = 20;
        if (yearOld >= 2 && yearOld <= 6) {
            System.out.println("Если возраст человека равен " + yearOld + " ,то ему нужно ходить в садик");
        }
        if (yearOld >= 7 && yearOld <= 17) {
            System.out.println("Если возраст человека равен " + yearOld + " ,то ему нужно ходить в школу");

        }
        if (yearOld >= 18 && yearOld <= 24) {
            System.out.println("Если возраст человека равен " + yearOld + " ,то ему нужно ходить в универ");

        } else {
            System.out.println("Если возраст человека равен " + yearOld + " ,то ему нужно ходить на работу");
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