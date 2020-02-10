package Lektion2.toLags;

import java.util.Scanner;

public class TUI implements IUI {

    IData data;

    public TUI(IData data) {
        this.data = data;
    }

    @Override
    public void showMenu() {
        System.out.println("1 for show ingredients");
        System.out.println("2 for show ingredient");
        System.out.println("3 for change ingredient");
        System.out.println("4 for create ingredient");
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1:
                showIngredients();
                break;
            case 2:
                showIngredient();
                break;
            case 3:
                changeIngredient();
                break;
            case 4:
                createIngredient();
                break;
            default:
                break;
        }
        System.out.println();
        System.out.println();
    }

    @Override
    public void showIngredients() {
        String[] ingredients = data.getAllIngredients();
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println(ingredients[i].toString());
        }

    }

    @Override
    public void showIngredient() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type ID to show ingredient");
        int id = input.nextInt();
        System.out.println(data.getIngredientName(id) + " " + data.getIngredientAmount(id) + " gram");
    }

    @Override
    public void changeIngredient() {
        Scanner input = new Scanner(System.in);
        System.out.println("ID then Amount");
        int id = input.nextInt();
        int amount = input.nextInt();
        data.setIngredientAmount(id, amount);
        System.out.println("Enter new name");
        input.nextLine();
        String name = input.nextLine();
        data.setIngredientName(id, name);
    }

    @Override
    public void createIngredient() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ID");
        int id, amount;
        id = input.nextInt();
        System.out.println("Input: Amount");
        amount = input.nextInt();
        input.nextLine();
        System.out.println("Input: Name");
        String name = input.nextLine();
        data.createIngredient(id, name, amount);
    }
}
