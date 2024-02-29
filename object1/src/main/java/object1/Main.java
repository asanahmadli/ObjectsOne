package object1;

import java.util.logging.Logger;

public class Main {


    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Car car = new Car("bmw","m8",2024,0,"Germany");
        car.setColor("dark blue");
        System.out.println(car.getColor());
        car.setCountry("Azerbaijan");
        System.out.println(car.getCountry());

        Person person = new Person("Asan",30);
        System.out.println(person.height);

        Chair chair = new Chair("wood","yellow",4);
        System.out.println(chair.getColor());

        Person[] people = new Person[10]; // an array of 10 Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

//statements must be inside a method, constructor, or initializer block and assing values

            people[0] = person1;
            people[1] = person2;

        System.out.println(people[0].toString());







//            for(int i=0;i<people.length;i++){
//                if(i==1)
//                System.out.println(people[i].person1);
//            }





    }




}
