package Lektion2.toLags;

import java.util.ArrayList;
import java.util.List;

public class DemoData implements IData {
    @Override
    public String[] getAllIngredients() {
        String[] ingredientList = new String[ingredients.size()];
        for (int i = 0; i < ingredients.size(); i++) ingredientList[i] = ingredients.get(i).toString();
        return ingredientList;
    }

    @Override
    public String getIngredientName(int id) {
        for (Ingredient i : ingredients) {
            if (i.id == id) {
                return i.name;
            }
        }
        return null;
    }

    @Override
    public int getIngredientAmount(int id) {
        for (Ingredient i : ingredients) {
            if (i.id == id) {
                return i.amount;
            }
        }
        return 0;
    }

    @Override
    public void setIngredientName(int id, String name) {
        for (Ingredient i : ingredients) {
            if (i.id == id) {
                i.name = name;
            }
        }

    }

    @Override
    public void setIngredientAmount(int id, int amount) {
        for (Ingredient i : ingredients) {
            if (i.id == id) {
                i.amount = amount;
            }
        }
    }

    @Override
    public void createIngredient(int id, String name, int amount) {
        ingredients.add(new Ingredient(id, name, amount));

    }

    private class Ingredient {
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return ("ID: " + this.id + ", " + this.name + ", " + this.amount + " gram");
        }
    }

    private List<Ingredient> ingredients;

    public DemoData() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(1, "flormelis", 60));
        ingredients.add(new Ingredient(2, "mel", 240));
        ingredients.add(new Ingredient(3, "smør", 185));
    }
    //TODO: implementer metoder
}

