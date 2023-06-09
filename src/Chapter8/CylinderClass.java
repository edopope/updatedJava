package Chapter8;

public class CylinderClass {
    private int radius = 1;;
    private int height = 1;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
   public int volumeOfCylinder(int radius, int height){
        int volume = (int) (Math.PI * (radius * radius) * height);

        return volume;
   }
}
