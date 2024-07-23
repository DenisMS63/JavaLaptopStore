public class Laptop {
    private int randomAccessMemory;
    private int hardDiscCapacity;
    private String operationSystem;
    private String color;

    public Laptop (int randomAccessMemory, int hardDiscCapacity, String operationSystem, String color) {
        this.randomAccessMemory = randomAccessMemory;
        this.hardDiscCapacity = hardDiscCapacity;
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public int getRandomAccessMemory(){return randomAccessMemory;}
    public int getHardDiscCapacity(){return hardDiscCapacity;}
    public String getOperationSystem(){return operationSystem;}
    public String getColor(){return color;}

    public void setRandomAccessMemory(int randomAccessMemory) {this.randomAccessMemory = randomAccessMemory;}
    public void setHardDiscCapacity(int hardDiscCapacity) {this.hardDiscCapacity = hardDiscCapacity;}
    public void setOperationSystem(String operationSystem) {this.operationSystem = operationSystem;}
    public void setColor(String color) {this.color = color;}

    @Override
    public String toString() {
        String res = "Оперативная память: " + randomAccessMemory + " ГБ / Объем жесткого диска: " + hardDiscCapacity + " ГБ / Операционная система: " + operationSystem + " / Цвет: " + color;
        return res;
    }


}
