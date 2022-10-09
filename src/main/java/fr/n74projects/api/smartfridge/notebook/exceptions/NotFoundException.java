package fr.n74projects.api.smartfridge.notebook.exceptions;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

/**
 * Exception pour une ressource non trouvée.
 * Génère un retour HTTP 404.
 *
 * @since v1.0
 */
@NoArgsConstructor
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

	/**
	 * clé de hachage
	 */
	@Serial
	private static final long serialVersionUID = 128941395673289723L;

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}