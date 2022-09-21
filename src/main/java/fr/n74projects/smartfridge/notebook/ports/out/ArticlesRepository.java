package fr.n74projects.smartfridge.notebook.ports.out;

import fr.n74projects.smartfridge.notebook.models.persistents.ArticleJPA;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "articles", path = "articles")
public interface ArticlesRepository extends PagingAndSortingRepository<ArticleJPA, Long> {
}