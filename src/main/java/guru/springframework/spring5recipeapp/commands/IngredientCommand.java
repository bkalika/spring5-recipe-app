package guru.springframework.spring5recipeapp.commands;

import guru.springframework.spring5recipeapp.domain.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 4/6/2024
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private String description;
    private BigDecimal amount;
    private Recipe recipe;
    private UnitOfMeasureCommand uom;
}
