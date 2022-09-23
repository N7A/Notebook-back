package fr.n74projects.smartfridge.notebook.models.persistents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "item_itm")
public class ItemJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "itm_id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "itm_fk_art")
    private ArticleJPA article;

    @Basic
    @Column(name = "itm_quantite")
    private Integer quantite;

    @Basic
    @Column(name = "itm_active", nullable = false)
    private Boolean active;

}