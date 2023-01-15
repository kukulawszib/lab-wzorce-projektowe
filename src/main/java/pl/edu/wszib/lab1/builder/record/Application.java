package pl.edu.wszib.lab1.builder.record;

public class Application {

    public static void main(String[] args) {
        Person.male("Paweł", "Pustelnik", 27, new Address("", "", "", ""));
        Person.female("Jagoda", "Pustelnik", 27, new Address("", "", "", ""));
    }
}
