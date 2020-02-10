package Lektion2;

public class DemoData implements IData {
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

