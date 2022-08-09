package it.studio_java8.lombok.esempi.generale;

import java.util.List;
import lombok.Getter;
import lombok.ToString;

// https://projectlombok.org/features/Builder

@lombok.Builder
@Getter
@ToString
public class BuilderPiuSingular {
    private int id;
    private String name;
    private String surname;

    @lombok.Singular("telefoni")
    private List<String> telefoni;

    @lombok.Singular(ignoreNullCollections = true, value = "indirizziDiPosta")
    private List<String> indirizziDiPosta;

    public static void main(String[] args) {

        List<String> indirizziDiPosta = null;
        // @formatter:off
        BuilderPiuSingular oggetto = BuilderPiuSingular.builder()
                .id(1)
                .name("xxxx")
                .surname("yyyyy")
                .telefoni("333")
                .telefoni("444")
                .indirizziDiPosta(indirizziDiPosta)
                .build();
        // @formatter:off
        
        oggetto.getId();
        oggetto.getName();
        oggetto.getSurname();
        
        System.out.println(oggetto);
    }
}
