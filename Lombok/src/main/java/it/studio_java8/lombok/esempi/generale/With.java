package it.studio_java8.lombok.esempi.generale;

// https://projectlombok.org/features/With

@lombok.Builder
@lombok.ToString(includeFieldNames = true)
public class With {
    private int id;
    @lombok.With
    private String name;
    private String surname;

    public static void main(String[] args) {
        // @formatter:off
        With oggetto = With.builder()
                .id(1)
                .name("xxxx")
                .surname("yyyyy")
                .build();
        // @formatter:off
        
        With oggetto2 = oggetto.withName("jester");
        
        System.out.println(oggetto);
        System.out.println(oggetto2);
    }
}
