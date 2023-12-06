public class PersonTest {

    public static void main(String[] args) {

        MathTeacher teacher = new MathTeacher("Tom", 28, "UMK");

        //teacher.name = "Tom";
        //teacher.age = 28;
        //teacher.school = "UMK";
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();
        System.out.println(teacher.school);

        Footballer footballer = new Footballer("John", 12, "Legia");

        //footballer.name = "John";
        //footballer.age = 12;
        //footballer.footballClub = "Legia";
        footballer.playFootball();
        footballer.eat();
        footballer.walk();
        System.out.println(footballer.footballClub);

    }


}
