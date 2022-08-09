package it.studio_java8.lombok.esempi.generale;

import lombok.Getter;
import lombok.Setter;

// https://projectlombok.org/features/GetterSetter

@Getter
@Setter // @Setter(AccessLevel.PROTECTED)
public class GetterSetter {
    private int id;
    private String name;
    private String surname;

    public static void main(String[] args) {
        GetterSetter oggetto = new GetterSetter();
        oggetto.setId(1);
        oggetto.setName("xxx");
        oggetto.setSurname("yyy");
    }
}
