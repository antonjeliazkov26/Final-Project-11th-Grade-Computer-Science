import java.util.*;
import java.io.*;

    public class RecipeManager {
        private List<Recipe> recipes;

        public RecipeManager() {
            recipes = new ArrayList<>();
        }

        public void addRecipe(Recipe recipe) {
            recipes.add(recipe);
        }

        public void removeRecipe(Recipe recipe) {
            recipes.remove(recipe);
        }

        public List<Recipe> getRecipes() {
            return recipes;
        }

        public void updateRecipe(int index, Recipe updatedRecipe) {
            recipes.set(index, updatedRecipe);
        }

        public void loadRecipes(String filename) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
                recipes = (List<Recipe>) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                recipes = new ArrayList<>();
            }
        }

        public void saveRecipes(String filename) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
                out.writeObject(recipes);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

