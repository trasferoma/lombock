package it.studio_java8.lombok.esempi.generale;

// https://projectlombok.org/features/Value

@lombok.Value
@lombok.Builder
@lombok.ToString(includeFieldNames = true)
public class Value {
    private int id;
    private String name;
    private String surname;


    public static void main(String[] args) {
        // @formatter:off
        Value oggetto = Value.builder()
                .id(1)
                .name("xxxx")
                .surname("yyyyy")
                .build();
        // @formatter:off
        

        System.out.println(oggetto);
    }
}
