package it.studio_java8.lombok.esempi.generale;

import lombok.Getter;

// https://projectlombok.org/features/Builder

@lombok.Builder
@Getter
public class Builder {
    private int id;
    private String name;
    private String surname;

    public static void main(String[] args) {
        // @formatter:off
        Builder oggetto = Builder.builder()
                .id(1)
                .name("xxxx")
                .surname("yyyyy")
                .build();
        // @formatter:off
        
        oggetto.getId();
        oggetto.getName();
        oggetto.getSurname();
    }
}
