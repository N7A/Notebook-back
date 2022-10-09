package fr.n74projects.api.smartfridge.notebook.ports.out;

import fr.n74projects.api.smartfridge.notebook.models.entities.ItemJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemJPA, Long> {
}