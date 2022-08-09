package it.studio_java8.lombok.esempi.view;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AllegatoView {
    private Long id;
    private String nomeFile;
    private boolean valido;
}
