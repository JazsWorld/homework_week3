package homework_week3;

/**
 * Wall Area
 */
public class Progamme15_WallArea1
{
    double width;
    double height;

    public Progamme15_WallArea1() {
        // No-arg constructor
    }

    public Progamme15_WallArea1(double width, double height) {
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Progamme15_WallArea1 wall = new Progamme15_WallArea1(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
