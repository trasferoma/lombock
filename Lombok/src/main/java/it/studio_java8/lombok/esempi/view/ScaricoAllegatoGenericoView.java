package it.studio_java8.lombok.esempi.view;

@lombok.Value
@lombok.AllArgsConstructor(staticName = "crea")
@lombok.Builder
public class ScaricoAllegatoGenericoView {
    private final Long idAllegato;
    private final String nomeAllegato;
    private final byte[] contenutoFile;
    private final String mimeType;
}
