
public class Main {
    public static void main(String[] args) {

        System.out.println("Привет мир!");
        System.out.println("Задача № 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача № 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } if  (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("Задача № 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Прийдется заплатить штраф");
                   }
        if (speed <= 60)  {
            System.out.println("Можно ездить спокойно");
        }
        System.out.println("Задача № 4");
        int age1 = 65;
        if (age1 < 2) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора спать");
        } if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        } if (age1 >= 7 && age1 <= 18) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        } if (age1 > 18 && age1 < 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в университет");
        } if (age1 > 24 && age1 < 60) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора ходить на работу");
        } if (age1 > 60) {
            System.out.println("Если возраст человека равен " + age1 + " , то он может отдохнуть");
        }
        System.out.println("Задача № 5");
        int age2 = 7;
        if (age2 < 5) {
            System.out.println("Если возрест ребенка равен " + age2 + " то ему нельзя кататься на атракционе");
        } if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возрест ребенка равен " + age2 + " то ему можно кататься на атракционе в сопровождении");
        } if (age2 > 14) {
            System.out.println("Если возрест ребенка равен " + age2 + " то ему можно кататься на атракционе без сопровождения взрослого");
                    }
        System.out.println("Задача № 6");
        int trainCapacity = 102;
        int seating = 60;
        int standingPlaces = trainCapacity - seating;
                System.out.println("Колличество сидячих мест: " + standingPlaces);
                int seating1 = 59;
                int standingPlaces1 = 42;
        if  (seating1 >= seating && standingPlaces1 >= standingPlaces) {
            System.out.println("Вагон уже полностью забит");
        } else if (seating1 <= seating) {
            System.out.println("Есть сидячие места");
        } else if (standingPlaces1 <= standingPlaces) {
            System.out.println("Есть стоячие места");
        }
            System.out.println("Задача № 7");
            int one = 1;
            int two = 2;
            int three = 3;
            if (one > two) {
                System.out.println("Наибольшее  число one");
            }
            else if (two > three) {
                System.out.println("Наибольшее число two");
            } else
                System.out.println("Наибольшее число three");
        }


    }

