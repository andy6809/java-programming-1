
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof Person)) {
            return false;
        }

        // let's cast the object to SimpleDate
        Person otherDate = (Person) compared;

        // if the object's values are the same, the objects are the same
        if (this.height == otherDate.height
                && this.birthday.equals(otherDate.birthday)
                && this.weight == otherDate.weight
                && this.name.equals(otherDate.name)) {
            return true;
        }

        // other wise, the objects are not the same
        return false;
    }
}
