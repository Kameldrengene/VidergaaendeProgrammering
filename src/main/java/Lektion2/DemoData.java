package Lektion2;

import java.util.ArrayList;
import java.util.List;

public class DemoData implements IData {
    @Override
    public String[] getAllIngredients() {
        return new String[0];
    }

    @Override
    public String getIngredientName(int id) {
        return null;
    }

    @Override
    public int getIngredientAmount(int id) {
        return 0;
    }

    @Override
    public void setIngredientName(int id, String name) {

    }

    @Override
    public void setIngredientAmount(int id, int amount) {

    }

    @Override
    public void createIngredient(int id, String name, int amount) {

    }

    private class Ingredient {
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount) {
            //TODO: lav konstruktør
        }

        @Override
        public String toString() {
            //TODO: lav toString metode
            return null;
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

