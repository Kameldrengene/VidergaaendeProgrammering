package Lektion2.opgave1;

import java.util.Scanner;

public class TUI implements IUI {
    Scanner scan = new Scanner(System.in);
    IData iData;

    public TUI(IData data){
        this.iData = data;
    }



    @Override
    public void showMenu() {
        System.out.println("========================================\n" +
                "1. Vis alle ingredienser \n" +
                "2. Vis en indredient \n" +
                "3. Skift en ingredient\n" +
                "4. Opret en ingredient \n" +
                "========================================");
        int menu = scan.nextInt();
        scan.nextLine();
        switch (menu){
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
    }

    @Override
    public void showIngredients() {
        for (int i = 0; i <iData.getAllIngredients().length ; i++) {
            System.out.println(iData.getAllIngredients()[i]);
        }
    }

    @Override
    public void showIngredient() {
        System.out.println("Hvilke ingrediens skal vises");
        int tempScan = scan.nextInt();
        System.out.println(iData.getIngredientName(tempScan)+iData.getIngredientAmount(tempScan));

    }

    @Override
    public void changeIngredient() {
        System.out.println("Hvilke ingrediens skal skiftes id");
        int tempScan = scan.nextInt();
        scan.nextLine();

        System.out.println("hvad skal skifter ?\n" +
                "1. navn \n" +
                "2. antal \n");



        int tempScan2 = scan.nextInt();

        scan.nextLine();

        System.out.println(tempScan2);
        if (tempScan2==1) {

            String tempNavn = scan.nextLine();
            iData.setIngredientName(tempScan, tempNavn);
        }

        else if (tempScan2==2) {
            iData.setIngredientAmount(tempScan, scan.nextInt());
        }

    }

    @Override
    public void createIngredient() {
        System.out.println("indtast ny ingrediens");
        int tempid = scan.nextInt();
        scan.nextLine();
        String tempname = scan.nextLine();
        int tempamaount = scan.nextInt();
        scan.nextLine();

        iData.createIngredient(tempid,tempname,tempamaount);
    }
}
