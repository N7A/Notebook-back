package fr.n74projects.smartfridge.notebook.models.persistents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "shopping_list_sli")
public class ShoppingListJPA implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sli_id", nullable = false)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sli_date_creation", nullable = false)
    private Date dateCreation;

    @Basic
    @Column(name = "sli_active", nullable = false)
    private Boolean active;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sli_date_archivage")
    private Date dateArchivage;

    @OneToMany
    @JoinColumn(name = "itm_fk_sli", referencedColumnName = "sli_id")
    private List<ItemJPA> items;

}