package fr.n74projects.smartfridge.notebook.exceptions;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

/**
 * Exception pour une ressource non trouvée.
 * Génère un retour HTTP 404.
 * 
 * @author m-blondeau
 */
@NoArgsConstructor
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BusinessException extends RuntimeException {

	/**
	 * clé de hachage
	 */
	@Serial
	private static final long serialVersionUID = 128941395673289723L;

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

}