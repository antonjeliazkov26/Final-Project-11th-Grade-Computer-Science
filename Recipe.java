import java.io.Serializable;
import java.util.List;

public class Recipe implements Serializable {
    private String name;
    private List<String> ingredients;
    private String steps;
    private int time;
    private String difficulty;
    private String category;

    public Recipe(String name, List<String> ingredients, String steps, int time, String difficulty, String category) {
        this.name = name;
        this.ingredients = ingredients;
        this.steps = steps;
        this.time = time;
        this.difficulty = difficulty;
        this.category = category;
    }

    public String getName() { return name; }
    public List<String> getIngredients() { return ingredients; }
    public String getSteps() { return steps; }
    public int getTime() { return time; }
    public String getDifficulty() { return difficulty; }
    public String getCategory() { return category; }

    public void setName(String name) { this.name = name; }
    public void setIngredients(List<String> ingredients) { this.ingredients = ingredients; }
    public void setSteps(String steps) { this.steps = steps; }
    public void setTime(int time) { this.time = time; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
    public void setCategory(String category) { this.category = category; }

    @Override
    public String toString() {
        return name + " (" + category + ", " + time + " mins)";
    }
}
