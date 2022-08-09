package it.studio_java8.lombok.esempi.generale;

// https://projectlombok.org/features/Value

@lombok.Value
@lombok.Builder
@lombok.ToString(callSuper = true, includeFieldNames = true)
public class ToString {
    private int id;
    private String name;
    private String surname;

    @lombok.ToString.Exclude
    private String tempo;


    public static void main(String[] args) {
        // @formatter:off
        ToString oggetto = ToString.builder()
                .id(1)
                .name("xxxx")
                .surname("yyyyy")
                .tempo("vvvvv")
                .build();
        // @formatter:off
        

        System.out.println(oggetto);
    }
}
