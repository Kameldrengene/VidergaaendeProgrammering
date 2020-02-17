package Lektion3.Tolags;

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
            return id + ", " + name + ", " + amount;
        }
        
        public String getName(){
            return name;
        }
        
        public void setName(String name){
            this.name = name;
        }
        
        public int getId(){
            return id;
        }
        
        public int getAmount(){
            return amount;
        }
        
        public void setAmount(int Amount){
            this.amount = amount;
        }
        
    }
    
    private List<Ingredient> ingredients;
    private int size;
    
    public DemoData() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(1, "flormelis", 60));
        ingredients.add(new Ingredient(2, "mel", 240));
        ingredients.add(new Ingredient(3, "smør", 185));
        size = ingredients.size();
        
    }
    
    @Override
    public String[] getAllIngredients() {
        
        String[] out = new String[size];
    
        for (int i = 0; i < size; i++) {
            out[i] = ingredients.get(i).toString();
        }
        
        return out;
    }
    
    @Override
    public String getIngredientName(int id) {
        
        int index  = findIndex(id);
        return ingredients.get(index).getName();
    
    }
    
    @Override
    public int getIngredientAmount(int id) {
    
        int index  = findIndex(id);
        return ingredients.get(index).getAmount();
        
    }
    
    @Override
    public void setIngredientName(int id, String name) {
    
        int index  = findIndex(id);
        ingredients.get(index).setName(name);
        
    }
    
    @Override
    public void setIngredientAmount(int id, int amount) {
    
        int index  = findIndex(id);
        ingredients.get(index).setAmount(amount);
        
    }
    
    @Override
    public void createIngredient(int id, String name, int amount) {
        
        ingredients.add(new Ingredient(id, name, amount));
        size++;
    
    }
    
    private int findIndex(int id){
        
        int out = -1;
        
        for (int i = 0; i < size; i++) {
            if(id == ingredients.get(i).getId()){
                out = i;
                break;
            }
        }
        
        return out;
    }
    
}

