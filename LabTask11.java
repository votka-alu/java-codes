
package labtask11;


public class LabTask11 {


    public static void main(String[] args) {
        Plant[] plants = new Plant[10];
        int plantCount = 0;

        add(plants, new Herb("Rose", "Red", true, "All"));
        add(plants, new Flower("Beli", "White", true, false));
        add(plants, new Herb("Lavender", "Purple", true, "Spring"));

        display(plants);

        Plant result = search(plants, "Rose");
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Plant not found.");
        }

        remove(plants, "Rose");
        display(plants);
    }

    static void add(Plant[] plants, Plant p) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] == null) {
                plants[i] = p;
                break;
            }
        }
    }

    static void remove(Plant[] plants, String n) {
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] != null && plants[i].getName().equals(n)) {
                plants[i] = null;
                break;
            }
        }
    }

    static Plant search(Plant[] plants, String n) {
        for (Plant plant : plants) {
            if (plant != null && plant.getName().equals(n)) {
                return plant;
            }
        }
        return null;
    }

    static void display(Plant[] plants) {
        for (Plant plant : plants) {
            if (plant != null) {
                System.out.println(plant);
            }
        }
    }
}