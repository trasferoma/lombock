package it.studio_java8.lombok.esempi.generale;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

// https://projectlombok.org/features/NonNull

@lombok.Builder
@Getter
@ToString
public class NotNull {
    private int id;
    @NonNull
    private String name;
    private String surname;

    public String formatta(@NonNull String separatore) {
        return name + separatore + surname;
    }

    public static void main(String[] args) {
        // @formatter:off
        NotNull oggetto = NotNull.builder()
                .id(1)
                .name("xx") // null
                .surname("yyyyy")
                .build();
        // @formatter:off
        
        System.out.println(oggetto);
        
        String buffer = oggetto.formatta(";");
        
        System.out.println(buffer);
    }
}
