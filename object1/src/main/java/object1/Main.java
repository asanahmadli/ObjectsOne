package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person = new Person("Asan",30);
        System.out.println(person.height);

        Chair chair = new Chair("wood","yellow",4);
        System.out.println(chair.getColor());



    }




}
