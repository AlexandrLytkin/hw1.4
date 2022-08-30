import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task9() {
        System.out.println("Задание 3.3");
        int one = 55;
        int two = 20;
        int tree = 30;
        if (one > two) {
            System.out.println(one+" больше чем " +two+" число");
        } else if (two > one) {
            System.out.println(two+" больше чем " +one+" число");
        }if (one > tree) {
            System.out.println(one+" больше чем " +tree+" число");
        } else if (tree > one) {
            System.out.println(tree+" больше чем " +one+" число");
        } if (two > tree) {
            System.out.println(two+" больше чем " +tree+" число");
        } else if (tree > two) {
            System.out.println(tree+" больше чем " +two+" число");
        }
    }
    public static void task8() {
        System.out.println("Задание 3.2");
        int agePerson = 99;
        if (agePerson <5) {
            System.out.println("Если ребенку "+agePerson+" лет, то он не может кататься на аттракционе");
        } else if (agePerson >= 5 && agePerson < 14) {
            System.out.println("Если ребенку "+agePerson+" лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (agePerson >= 14) {
            System.out.println("Если ребенок "+agePerson+" лет, то он может кататься без сопровождения взрослого");
        }
    }
    public static void task7() {
        System.out.println("Задание 3.1");
        int agePerson = 25;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если человеку "+ agePerson + " то ему нужно ходить в детский сад");
        } else if (agePerson >= 7 && agePerson <= 18) {
            System.out.println("Если человеку "+ agePerson + " то ему нужно ходить в школу");
        } else if (agePerson > 18 && agePerson <= 24) {
            System.out.println("Если человеку "+ agePerson + " то ему нужно ходить в университет");
        } if (agePerson >24) {
            System.out.println("Если человеку "+ agePerson + " то ему нужно ходить на работу ");
        }
    }
    public static void task6() {
        System.out.println("Задание 2.3");
        int capacityWagonTrain = 101;
        if (capacityWagonTrain <= 59) {
            System.out.println("Вместимость вагона поезда составляет 102 человека, есть сидячее место в вагоне");
        } else if (capacityWagonTrain >=60 && capacityWagonTrain <=101) {
            System.out.println("Вместимость вагона поезда составляет 102 человека, есть стоячее место в вагоне");
        } if (capacityWagonTrain > 101) {
            System.out.println("Вместимость вагона поезда составляет 102 человека,вагон уже полностью забит");
        }
    }
    public static void task5() {
        System.out.println("Задание 2.2");
        int age = 23;
        if (age >= 7 && age <18) {
            System.out.println("ребенок ходит в школу");
        } else if (age >= 18 && age <= 23) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } if (age >= 24 ) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
    }
    public static void task4() {
        System.out.println("Задание 2.1");
        int age =17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }
    public static void task3() {
        System.out.println("Задание 1.3");
        int capacityWagonTrain = 101;
        if (capacityWagonTrain <= 59) {
            System.out.println("Вместимость вагона поезда составляет 102 человека, есть сидячее место в вагоне");
        }
        if (capacityWagonTrain > 60 && capacityWagonTrain <=101) {
            System.out.println("Вместимость вагона поезда составляет 102 человека, есть стоячее место в вагоне");
        }
        if (capacityWagonTrain >=102) {
            System.out.println("Вместимость вагона поезда составляет 102 человека,вагон уже полностью забит");
        }
    }
    public static void task2() {
        System.out.println("Задание 1.2");
        int age = 25;
        if (age >= 7 && age < 18) {
            System.out.println("ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
    }
    public static void task1() {
        System.out.println("Задание 1.1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        }
        if (age <18) {
            System.out.println("возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }



}
