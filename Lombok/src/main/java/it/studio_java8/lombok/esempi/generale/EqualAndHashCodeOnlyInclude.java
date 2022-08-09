package it.studio_java8.lombok.esempi.generale;

// https://projectlombok.org/features/Value

@lombok.Value
@lombok.Builder
@lombok.EqualsAndHashCode(onlyExplicitlyIncluded = true) // (callSuper=true)
public class EqualAndHashCodeOnlyInclude {
    @lombok.EqualsAndHashCode.Include
    private int id;
    private String name;
    private String surname;


    public static void main(String[] args) {
        // @formatter:off
        EqualAndHashCodeOnlyInclude oggetto = EqualAndHashCodeOnlyInclude.builder()
                .id(1)
                .name("xxxx")
                .surname("yyyyy")
                .build();
        // @formatter:off
        
        System.out.println(oggetto.hashCode());
    }
}
