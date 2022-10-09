package fr.n74projects.api.smartfridge.notebook.ports.out;

import fr.n74projects.api.smartfridge.notebook.models.entities.ShoppingListJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "shopping-lists", path = "shopping-lists")
public interface ShoppingListsRepository extends JpaRepository<ShoppingListJPA, Long> {
}