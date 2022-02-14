public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Пупкин", "Иван", "Василиевич");

        System.out.println(human1.getFullName());
        System.out.println(human1.getShortName());

        System.out.println();

        Human human2 = new Human("Иванов", "Иван");

        System.out.println(human2.getFullName());
        System.out.println(human2.getShortName());

    }

}
