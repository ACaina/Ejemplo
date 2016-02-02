
package figura;

public class Circulo implements Figura{
    private double radio;
    //Hola
    public Circulo(double radio)
    {
        this.radio=radio;
    }
    public double area()
    {
        return Math.PI*radio*radio;
    }
}
