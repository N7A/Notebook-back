package fr.n74projects.smartfridge.notebook.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception pour un service non disponible.
 * Génère un retour HTTP 503.
 *
 */
@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class ServiceUnavailableException extends RuntimeException {

	/**
	 * clé de hachage
	 */
	private static final long serialVersionUID = 5540355385324810784L;

	public ServiceUnavailableException(String message) {
		super(message);
	}

}
