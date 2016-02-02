
package figura;


public interface Figura {
    public double area(); 
    public static void main(String[] args) {
        Circulo c = new Circulo(3.5);
        Cuadrado sq=new Cuadrado(5.0);
        c.area();
        sq.area();
    }
    
}
