package it.studio_java8.lombok.esempi.generale;

// https://projectlombok.org/features/Value

@lombok.Value
@lombok.Builder
@lombok.EqualsAndHashCode // (callSuper=true)
public class EqualAndHashCode {
    private int id;

    @lombok.EqualsAndHashCode.Exclude
    private String name;

    @lombok.EqualsAndHashCode.Exclude
    private String surname;


    public static void main(String[] args) {
        // @formatter:off
        EqualAndHashCode oggetto = EqualAndHashCode.builder()
                .id(1)
                .name("xxxx")
                .surname("yyyyy")
                .build();
        // @formatter:off
        
        System.out.println(oggetto.hashCode());
    }
}
