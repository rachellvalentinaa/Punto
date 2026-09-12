public class Punto {
    private int x , y;
    /*public Punto() {        //METODO 1. siempre es public y el nombre de la clase
        this.setX(0);       
        this.setY(0);       
    }*/
    public double modulo(){     /* método genérico */
        return (double) (Math.sqrt(this.x * this.x + this.y * this.y)); //el (double) es para obligar a que el resultado sea double, ya que Math.sqrt puede devolver un double
    }                                           
    public int getX(){                     /* método de acceso (get) */
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX (int x){              /* método para modificar el atributo (set) */
        this.x=x;
    }
    public void setY (int y){              /* método para modificar el atributo (set) */
        this.y=y;
    }
    public Punto(int x, int y){        /* MÉTODO CONSTRUCTOR 2. siempre es public y el nombre de la clase */        
        this.setX(x);       
        this.setY(y);       
    }
    public Punto(int a){
        this.setX(a);
        this.setY(a);
    }
    public Punto() {
        this(0 , 0);
    }

    // ""POLIMORFISMO"" COSAS QUE LLEVAN EL MISMO NOMBRE ME RESPONDEN DE MANERA DIFERENTE. EJEMPLO: EL MÉTODO CONSTRUCTOR PUEDE TENER EL MISMO NOMBRE PERO RESPONDER DE MANERA DIFERENTE SEGÚN LOS PARÁMETROS QUE LE PASAMOS.
      //"POLIMORFISMO ESTATICO" SABRE CARGA DE METODOS, LOS METODOS TIENE EL MISMO NOMBRE PERO SE DIFERENCIAN POR LA CANTIDAD Y TIPO DE PARAMATROS

    
}


