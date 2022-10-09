package fr.n74projects.api.smartfridge.notebook.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Unite {
    UNITE(""),
    LITRE("litre"),
    GRAMME("gramme");

    private final String value;
}
