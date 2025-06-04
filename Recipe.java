import java.util.List;

public class Recipe extends RecipeItem {
    private List<String> ingredients;
    private String steps;
    private int time;
    private String difficulty;
    private String description;

    public Recipe(String name, List<String> ingredients, String steps, int time, String difficulty, String category, String description) {
        super(name, category);
        this.ingredients = ingredients;
        this.steps = steps;
        this.time = time;
        this.difficulty = difficulty;
        this.description = description;
    }

    public List<String> getIngredients() { return ingredients; }
    public String getSteps() { return steps; }
    public int getTime() { return time; }
    public String getDifficulty() { return difficulty; }
    public String getDescription() { return description; }

    public void setIngredients(List<String> ingredients) { this.ingredients = ingredients; }
    public void setSteps(String steps) { this.steps = steps; }
    public void setTime(int time) { this.time = time; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String getSummary() {
        return getName() + " - " + getCategory() + " (" + time + " mins)";
    }

    @Override
    public String toString() {
        return getSummary();
    }
}
