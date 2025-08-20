public class Main {
    public static void main(String[] args) {
var dog = 8.0;
var cat=3.6;
var paper=763789;

System.out.println(dog);
System.out.println(cat);
System.out.println(paper);
System.out.println();
dog=dog+4;
cat=cat+4;
paper=paper+4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        var friends=19;
        System.out.println(friends);
        friends=friends+2;
        System.out.println(friends);
        friends=friends/7;
        System.out.println(friends);
        System.out.println();

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        System.out.println();

        var box1=78.2;
        var box2=82.7;
        var commonWeight=box1+box2;
        System.out.println("Общий вес бойцов "+ commonWeight);
var differenceWeight=box2-box1;
System.out.println("Разница веса бойцов "+differenceWeight);
        var remains = box2%box1;
        System.out.println("Остаток деления "+remains);
        System.out.println();

        var totalTime = 640;
        var workingHours=8;
        var numberOfEmployees=totalTime/workingHours;
        System.out.println("Всего работников в компании — "+numberOfEmployees+ " человек");
        numberOfEmployees=94;
        workingHours=numberOfEmployees*8;
        System.out.println("Если в компании работает "+numberOfEmployees+" человек, то всего "+workingHours+" часов работы может быть поделено между сотрудниками");

    }
}