package arrayListDemos;

import java.util.Objects;

public class Person {
    String name;

    Person(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person){
            Person p = (Person) o;
            boolean isEqual = p.name.equals(this.name);
            return isEqual;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
