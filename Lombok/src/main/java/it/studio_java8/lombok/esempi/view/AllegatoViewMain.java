package it.studio_java8.lombok.esempi.view;

public class AllegatoViewMain {
    public static void main(String[] args) {
        AllegatoView view = AllegatoView.builder()
                .id(1L)
                .nomeFile("xxx")
                .valido(true)
                .build();

        System.out.println(view);
    }
}
