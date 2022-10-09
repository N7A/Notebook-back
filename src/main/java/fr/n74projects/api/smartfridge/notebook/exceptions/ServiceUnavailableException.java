package fr.n74projects.api.smartfridge.notebook.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

/**
 * Exception pour un service non disponible.
 * Génère un retour HTTP 503.
 *
 * @since v1.0
 */
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class ServiceUnavailableException extends RuntimeException {

	/**
	 * clé de hachage
	 */
	@Serial
	private static final long serialVersionUID = 5540355385324810784L;

	public ServiceUnavailableException(String message) {
		super(message);
	}

}
