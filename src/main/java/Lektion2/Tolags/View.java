package Lektion2.Tolags;

import java.util.Scanner;

public class View implements IView {

    IData data;
    Scanner scan = new Scanner(System.in);
    
    public View(IData data){
        this.data = data;
    }
    
    @Override
    public void showMenu() {
    
        int choice = showCustomMenu("Choose item: ", new String[]{"showIngredients", "showIngredient", "changeIngredient", "createIngredient"});
        
        switch (choice){
            case 0:
                showIngredients();
                break;
            case 1:
                showIngredient();
                break;
            case 2:
                changeIngredient();
                break;
            case 3:
                createIngredient();
                break;
                
        }
        System.out.println();
    }
    
    @Override
    public void showIngredients() {
        
        String[] ingredients = data.getAllIngredients();
    
        System.out.println("");
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
        
    }
    
    @Override
    public void showIngredient() {
        
        int id = pickId();
    
        System.out.println();
        String out = data.getIngredientName(id) + ", " + data.getIngredientAmount(id);
        System.out.println(out);
        
    }
    
    @Override
    public void changeIngredient() {
        
        //lader brugeren vælge ingrediens ud fra id, dernæst vælge et felt og så indtaste en ny værdi for denne
        int id = pickId();
        
        int choice = showCustomMenu("\nPick what to edit: ", new String[]{"name", "amount"});
        
        switch (choice){
            case 0:
                System.out.println("\nType name: ");
                data.setIngredientName(id, scan.nextLine());
                break;
            case 1:
                System.out.println("\nType Amount: ");
                data.setIngredientAmount(id, scan.nextInt());
                scan.nextLine();
                break;
        }
    }
    
    @Override
    public void createIngredient() {
    
        System.out.println("\nType ID: ");
        int id = scan.nextInt();
        scan.nextLine();
    
        System.out.println("\nType name: ");
        String name = scan.nextLine();
    
        System.out.println("\nType amount: ");
        int amount = scan.nextInt();
        scan.nextLine();
        
        data.createIngredient(id, name, amount);
        
    }
    
    private int showCustomMenu(String Message, String[] menuItems){
    
        System.out.println(Message);
        
        int choice;
    
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(i + ". " + menuItems[i]);
        }
    
        choice = Integer.parseInt(scan.nextLine());
        
        return choice;
    }
    
    private int pickId(){
        
        String[] ingredients = data.getAllIngredients();
        String[] menuItems = new String[ingredients.length];
    
        for (int i = 0; i < ingredients.length; i++) {
            String id = ingredients[i].split(",")[0];
            menuItems[i] = id;
        }
    
        System.out.println("");
        int choice = showCustomMenu("Choose ID: ", menuItems);
        
        return Integer.parseInt(menuItems[choice]);
    }
    
}
