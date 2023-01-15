package pl.edu.wszib.lab1.builder;

public class Application {

    public static void main(String[] args) {
        Person.Builder personBuilder = Person.builder()
                .firstName("Pawel")
                .lastName("Pustelnik")
                .age(28)
                .gender(Gender.MALE);
        Address address = personBuilder.addressBuilder()
                .city("Pawlowice")
                .number("1")
                .postalCode("43-250")
                .build();
        personBuilder.address(address);
    }
}

