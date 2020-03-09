package Lektion3.Tolags;

public interface IView {
    void showMenu(); //viser menu med valgmuligheder
    void showIngredients(); //viser alle ingredienser
    void showIngredient() throws IData.IngredientNotFoundException; //lader brugeren vælge ingrediens ud fra id og viser denne
    void changeIngredient() throws IData.IngredientNotFoundException; //lader brugeren vælge ingrediens ud fra id, dernæst vælge et felt og så indtaste en ny værdi for denne
    void createIngredient(); //lader brugeren indtaste værdier til en ny ingrediens
    
    public class IDNotFound extends Exception{
    
    }
    
    
}

