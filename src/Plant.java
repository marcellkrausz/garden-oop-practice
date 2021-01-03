import Material.Material;

public abstract class Plant {

    private String name;
    private String ID;
    private int size;
    private int maxSize;
    boolean isAlive;

    public abstract void oneDayOfPlant(Material material);

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
