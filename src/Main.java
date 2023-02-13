public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1: " + dog);
        System.out.println("Задача 1: " + cat);
        System.out.println("Задача 1: " + paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2: " + dog);
        System.out.println("Задача 2: " + cat);
        System.out.println("Задача 2: " + paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3: " + dog);
        System.out.println("Задача 3: " + cat);
        System.out.println("Задача 3: " + paper);

    }

    public static void task2 () {
        var friend = 19;
        System.out.println("Задача 4: " + friend);
        friend = friend + 2;
        System.out.println("Задача 4: " + friend);
        friend = friend / 7;
        System.out.println("Задача 4: " + friend);
        var frog = 3.5;
        System.out.println("Задача 5: " + frog);
        frog = frog * 10;
        System.out.println("Задача 5: " + frog);
        frog = frog / 3.5;
        System.out.println("Задача 5: " + frog);
        frog = frog + 4;
        System.out.println("Задача 5: " + frog);
    }

    public static void task3() {
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Задача 6: Общий вес бойцов: " + totalWeight);
        var weightDifference = weightBoxer1 - weightBoxer2;
        System.out.println("Задача 6: Разницу между весами бойцов: " + weightDifference);
weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Задача 7: " + weightDifference);
        weightDifference = weightBoxer2 % weightBoxer1;
        System.out.println("Задача 7: " + weightDifference);

        var totalHours = 640;
        var workHours = 8;
        var people = totalHours / workHours;
        System.out.println("Всего работников в компании — " + people + " человек");
        people = people + 94;
        workHours = totalHours / people;
        System.out.println("Если в компании работает " + people + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками.");

    }
    }
