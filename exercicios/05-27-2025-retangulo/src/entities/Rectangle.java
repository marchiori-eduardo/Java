package entities;

public class Rectangle {
    public double width;
    public double height;
    public double perimeter;
    public double area;
    public double diagonal;

    public double calcularArea () {
        this.area = this.height * this.width;
        return this.area;
    }

    public double calcularPerimeter () {
         this.perimeter = 2 * (this.height + this.width);
         return this.perimeter;
    }

    public double calcularDiagonal () {
        this.diagonal = (Math.sqrt((this.height * this.height) + (this.width * this.width)));
        return this.diagonal;
    }

    public String toString() {
        return "ÁREA = "
                + String.format("%.2f%n", calcularArea())
                + "PERÍMETRO = "
                + String.format("%.2f%n", calcularPerimeter())
                + "DIAGONAL = "
                + String.format("%.2f", calcularDiagonal());
    }
}
