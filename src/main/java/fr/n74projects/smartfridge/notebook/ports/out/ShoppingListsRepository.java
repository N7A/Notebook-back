package fr.n74projects.smartfridge.notebook.ports.out;

import fr.n74projects.smartfridge.notebook.models.persistents.ShoppingListJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "shopping-lists", path = "shopping-lists")
public interface ShoppingListsRepository extends JpaRepository<ShoppingListJPA, Long> {
}