package guru.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 3/28/2024
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}
