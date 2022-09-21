package fr.n74projects.smartfridge.notebook.models.persistents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "article_art")
public class ArticleJPA implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "art_id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "art_libelle")
    private String libelle;

}