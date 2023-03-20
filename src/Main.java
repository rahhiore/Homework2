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
    }
    public static void task1() {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2() {
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat += 4;
        System.out.println(cat);
        var paper = 763789;
        paper += 4;
        System.out.println(paper);
    }
    public static void task3() {
        var dog = 8.0;
        dog = dog + 4;
        dog -= 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat += 4;
        cat -= 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper += 4;
        paper -= 7639;
        System.out.println(paper);
    }
    public static void task4() {
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }
    public static void task5() {
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }
    public static void task6() {
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println("Вес двух бойцов " + (weightBoxer1 + weightBoxer2) + " кг");
        System.out.println("Разница в весе двух бойцов " + (weightBoxer1 - weightBoxer2) + " кг");
    }
    public static void task7() {
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println("Разница в весе двух бойцов " + (weightBoxer2 - weightBoxer1) + " кг");
        System.out.println("Разница в весе двух бойцов " + (weightBoxer2 % weightBoxer1) + " кг");
    }
    public static void task8() {
        var hoursAll = 640;
        var workers = hoursAll / 8;
        System.out.println("Всего работников в компании - " + workers + " человек");
        var workersAll = workers + 94;
        hoursAll = workersAll * 8;
        System.out.println("Если в компании работает " + workersAll + " человек, то всего " + hoursAll + " часов работы может быть поделено между сотрудниками");
    }

}