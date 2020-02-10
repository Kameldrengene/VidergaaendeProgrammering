package Lektion2;

import java.util.ArrayList;
import java.util.List;

public class DemoData implements IData {


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
            return id + " " + name + " " + amount;
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
    @Override
    public String[] getAllIngredients() {
        String[] allIngredients = new String[ingredients.size()];
        for (int i = 0; i <allIngredients.length ; i++) {
            allIngredients[i] = ingredients.get(i).toString();
        }


        return allIngredients;
    }

    @Override
    public String getIngredientName(int id) {

        String ingredientName = ingredients.get(id).name;
        return ingredientName;
    }

    @Override
    public int getIngredientAmount(int id) {
        return ingredients.get(id).amount;
    }

    @Override
    public void setIngredientName(int id, String name) {
        int tempamount= ingredients.get(id).amount;
        ingredients.set(id-1,new Ingredient(id,name,tempamount));

    }

    @Override
    public void setIngredientAmount(int id, int amount) {
        String tempName = ingredients.get(id).name;
        ingredients.set(id,new Ingredient(id,tempName,amount));
    }

    @Override
    public void createIngredient(int id,String name, int amount) {
        ingredients.add(new Ingredient(id,name,amount));
    }

}
