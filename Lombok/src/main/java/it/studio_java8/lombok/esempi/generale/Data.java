package it.studio_java8.lombok.esempi.generale;

// https://projectlombok.org/features/Data

@lombok.Data
public class Data {
    private int id;
    private String name;
    private String surname;

    public static void main(String[] args) {
        Data oggetto = new Data();
        oggetto.setId(1);
        oggetto.setName("xxx");
        oggetto.setSurname("yyy");

        String buffer = oggetto.toString();
        System.out.println(buffer);
    }
}
