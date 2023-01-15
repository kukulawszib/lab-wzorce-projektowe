package pl.edu.wszib.lab1.builder.record;

import com.google.auto.value.AutoBuilder;

public record Person(
        String firstName,
        String lastName,
        Integer age,
        Gender gender,
        Address address
) {

    public static Builder builder() {
        return new AutoBuilder_Person_Builder();
    }

    @AutoBuilder
    interface Builder {
        Builder firstName(String firstName);

        Builder lastName(String lastName);

        Builder age(Integer age);

        Builder gender(Gender gender);

        Builder address(Address address);

        Person build();
    }
}
