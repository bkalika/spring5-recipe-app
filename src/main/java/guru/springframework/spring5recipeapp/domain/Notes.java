package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;
import lombok.*;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 3/28/2024
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
