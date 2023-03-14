public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }


    public static void task1() {
        System.out.println("Задача 1");
        int ageHuman = 15;
        if (ageHuman >= 18) {
            System.out.println("Если возвраст человека равен " + ageHuman + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature >= 5) {
            System.out.println("На улице тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        int age = 1;
        if (age < 2) {
            System.out.println("Ты слишком маленький");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если твой возраст " + age + " тебе нужно ходить в сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если твой возраст " + age + " тебе нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если твой возраст " + age + " нужно ходить в университет");
        } else {
            System.out.println("Если твой возраст " + age + " пора идти работать");
        }
    }

    public static void task5() {
        System.out.println("Task5");
        int age = 20;
        if (age < 5) {
            System.out.println("Если возраст ребёнка " + age + " ,то ему нельяза кататься на атракционах");
        } else if (age <= 14) {
            System.out.println("Если возраст ребёнка " + age + " ,то ему можно кататься на атракционе в сопровождении взрослого, без взрослого нельзя");
        } else {
            System.out.println("Если возраст равен " + age + " ,то можно кататься на атракционе самостоятельно");
        }
    }

    public static void task6() {
        System.out.println("Task6");
        int people = 107;
        int capacityTrain = 102;
        int capacityTrainSeat = 60;
        if (people <= capacityTrainSeat) {
            System.out.println("В вагоне есть сидячее место");
        } else if ((people > capacityTrainSeat) && (people < capacityTrain)) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }

    public static void task7() {
        System.out.println("Taks7");
        int one = 8;
        int two = 8;
        int three = 80;
        if (one >= two && one > three) {
            System.out.println("Большее число: " + one);
        } else if (two >= one && two > three) {
            System.out.println("Большее число: " + two);
        } else if (one == two && two == three) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Большее число: " + three);
        }
    }
}

