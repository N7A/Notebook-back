package fr.n74projects.api.smartfridge.notebook.ports.out;

import fr.n74projects.api.smartfridge.notebook.models.entities.ArticleJPA;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "articles", path = "articles")
public interface ArticlesRepository extends PagingAndSortingRepository<ArticleJPA, Long> {
}