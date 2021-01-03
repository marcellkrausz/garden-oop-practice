public class Cactus extends Plant{

    private String name;
    private String ID;
    private int size;
    private int maxSize;
    boolean isAlive;

    public Cactus(String name, String ID, int size) {
        this.name = name;
        this.ID = ID;
        this.size = size;
        this.maxSize = 4;
        this.isAlive = true;
    }
    @Override
    public void oneDayOfPlant(Material material) {
        if (size <= 0) {
            isAlive = false;
            return;
        }
        if (size > maxSize) {
            isAlive = false;
            return;
        }
        if (material.getName().equals("Water")) {
            this.size -= 1;
        } else if (material.getName().equals("NutrientSolution")) {
            this.size += 1;
        } else if (material.getName().equals("Artificials")){
            this.size += 1;
        } else {
            this.size -= 1;
        }
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getSize() {
        return size;
    }
    public boolean getIsAlive() {
        return isAlive;
    }
}
