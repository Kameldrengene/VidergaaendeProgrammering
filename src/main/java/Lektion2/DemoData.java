package Lektion2;

import java.util.ArrayList;
import java.util.List;

public class DemoData implements IData {
    @Override
    public String[] getAllIngredients() {
        String[] ingredientList = new String[ingredients.size()];
        for(int i = 0; i < ingredients.size();i++) ingredientList[i] = ingredients.get(i).toString();
        return ingredientList;
    }

    @Override
    public String getIngredientName(int id) {
        return ingredients.get(id).name;
    }

    @Override
    public int getIngredientAmount(int id) {
        return ingredients.get(id).amount;
    }

    @Override
    public void setIngredientName(int id, String name) {
        ingredients.set(id,new Ingredient(id,name,getIngredientAmount(id)));

    }

    @Override
    public void setIngredientAmount(int id, int amount) {
        ingredients.set(id,new Ingredient(id,getIngredientName(id),amount));
    }

    @Override
    public void createIngredient(int id, String name, int amount) {
        ingredients.add(new Ingredient(id,name,amount));

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
            return (this.id + ", " + this.name + ", " +this.amount);
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

