package it.studio_java8.lombok.esempi.generale;

import lombok.NonNull;

// https://projectlombok.org/features/constructor

@lombok.Data
@lombok.AllArgsConstructor(staticName = "of")
@lombok.NoArgsConstructor
@lombok.RequiredArgsConstructor
public class Costruttore {
    private int id;
    private String name;

    @NonNull
    private String surname;

    public static void main(String[] args) {
        new Costruttore(0, null, null); // tutti i parametri

        new Costruttore(); // nessun parametro

        new Costruttore("xxx"); // solo le properties NotNull

        Costruttore.of(0, null, null); // costruttore con metodo statico
    }
}
