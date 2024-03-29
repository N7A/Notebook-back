package fr.n74projects.api.smartfridge.notebook.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

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

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sli_date_creation", nullable = false)
    private Date dateCreation;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sli_date_archivage")
    private Date dateArchivage;

    @OneToMany(cascade = CascadeType.ALL)
    @OrderColumn(name="itm_ordre")
    @JoinColumn(name = "itm_fk_sli", referencedColumnName = "sli_id")
    private List<ItemJPA> items;

}