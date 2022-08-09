package it.studio_java8.lombok.esempi.view;

public class ScaricoAllegatoGenericoViewMain {
    public static void main(String[] args) {
        ScaricoAllegatoGenericoView view = ScaricoAllegatoGenericoView.crea(null, null, null, null);

        ScaricoAllegatoGenericoView view2 = ScaricoAllegatoGenericoView.builder()
                .idAllegato(null)
                .nomeAllegato(null)
                .contenutoFile(null)
                .mimeType(null)
                .build();


    }
}
