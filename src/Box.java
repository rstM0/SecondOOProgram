public class Box {
    private int width;          // ширина коробки
    public int height;        // висота коробки (змінено на int)
    protected double depth;     // глибина коробки
    String material;

    public Box(int width, int height, double depth, String material) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.material = material;
    }

    public double calculateVolume() {
        return width * height * depth; // Зверніть увагу, що результат залишається double
    }

    public void changeMaterial(String newMaterial) {
        this.material = newMaterial;
        System.out.println("Матеріал коробки змінено на: " + newMaterial);
    }

    public boolean isLarge() {
        return calculateVolume() > 100;
    }
}