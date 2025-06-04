import java.util.*;
import java.io.*;

public class RecipeManager {
    private LinkedList<Recipe> recipes;
    private Map<String, List<Recipe>> categorizedRecipes;

    public RecipeManager() {
        recipes = new LinkedList<>();
        categorizedRecipes = new HashMap<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
        categorizedRecipes.computeIfAbsent(recipe.getCategory(), k -> new ArrayList<>()).add(recipe);
    }

    public void removeRecipe(Recipe recipe) {
        recipes.remove(recipe);
        categorizedRecipes.getOrDefault(recipe.getCategory(), new ArrayList<>()).remove(recipe);
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void updateRecipe(int index, Recipe updatedRecipe) {
        Recipe old = recipes.get(index);
        removeRecipe(old);
        recipes.set(index, updatedRecipe);
        addRecipe(updatedRecipe);
    }

    public void loadRecipes(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            recipes = (LinkedList<Recipe>) in.readObject();
            rebuildCategoryMap();
        } catch (IOException | ClassNotFoundException e) {
            recipes = new LinkedList<>();
            categorizedRecipes = new HashMap<>();
        }
    }

    public void saveRecipes(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(recipes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void rebuildCategoryMap() {
        categorizedRecipes = new HashMap<>();
        for (Recipe r : recipes) {
            categorizedRecipes.computeIfAbsent(r.getCategory(), k -> new ArrayList<>()).add(r);
        }
    }
}
        }
    }

