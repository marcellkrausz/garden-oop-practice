import Material.Material;
import Material.Artificials;
import Material.NutrientSolution;
import Material.Water;
import java.util.ArrayList;
import java.util.List;

public class Garden {

    int day = 1;
    String name;
    List<Material> materials = new ArrayList<>();
    List<Plant> plants = new ArrayList<>();

    public Garden(String name) {
        this.name = name;

        materials.add(new Water());
        materials.add(new NutrientSolution());
        materials.add(new Material());
        materials.add(new Water());
        materials.add(new Artificials());

        plants.add(new Flower("Flower","V102",3));
        plants.add(new Bush("Bush","B223",4));
        plants.add(new Cactus("Cactus", "K15",2));
        plants.add(new Cactus("Cactus","K18",1));

    }

    public void oneDayInTheGarden(){
        for (int i = 0; i < materials.size(); i++) {
            System.out.println(day);
            for (int j = 0; j < plants.size(); j++) {
                plants.get(j).oneDayOfPlant(materials.get(i));

                System.out.println(plants.get(j).getName() + " " + plants.get(j).getID() + " " + plants.get(j).getSize() + " " + plants.get(j).getIsAlive());
            }

            day++;
        }
    }
}
