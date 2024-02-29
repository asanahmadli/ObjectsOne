package object1;

public class Person {

    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    //height accepts only centimeters
    int height;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height=0;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30);

        /* Now you can use the Object `person1` */

    }
//    Person[] people = new Person[10]; // an array of 10 Person objects
//    Person person1 = new Person("Alice", 25);
//    Person person2 = new Person("Bob", 30);
//
////statements must be inside a method, constructor, or initializer block and assing values
//    {
//        people[0] = person1;
//        people[1] = person2;
//    }






}
