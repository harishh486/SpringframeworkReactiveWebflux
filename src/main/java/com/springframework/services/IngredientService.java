package com.springframework.services;

import com.springframework.commands.IngredientCommand;
import reactor.core.publisher.Mono;

/**
 * Created by  Harish on 6/27/17.
 */
public interface IngredientService {

    Mono<IngredientCommand> findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    Mono<IngredientCommand> saveIngredientCommand(IngredientCommand command);

    Mono<Void> deleteById(String recipeId, String idToDelete);
}