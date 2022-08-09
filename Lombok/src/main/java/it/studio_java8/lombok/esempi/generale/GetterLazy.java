package it.studio_java8.lombok.esempi.generale;

// https://projectlombok.org/features/GetterLazy

@lombok.Value
@lombok.ToString(includeFieldNames = true)
public class GetterLazy {
    private int id;
    private String name;
    private String surname;

    @lombok.Getter(lazy = true)
    private final double[] cached = expensive();

    // costruttore che ignora una propertiy ma costruisce comunque l'interfaccia fluente.

    @lombok.Builder
    public GetterLazy(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return result;
    }


    public static void main(String[] args) {
        // @formatter:off
        GetterLazy oggetto = GetterLazy.builder()
                .id(1)
                .name("xxxx")
                .surname("yyyyy")
                .build();
        // @formatter:off

        System.out.println(oggetto.getCached());
        System.out.println(oggetto.getCached());
    }
}
