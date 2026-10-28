public class Main {
    public static void main(String[] args) {
        PuntoTiempo pt1 = new PuntoTiempo();
        System.out.println(pt1.getX());
        System.out.println(pt1.getY());
        System.out.println(pt1.getT());
        System.out.println(pt1.modulo());
        System.out.println(pt1.velocidad()); // -> NaN

        PuntoTiempo pt2 = new PuntoTiempo(1, 2, 3);
        System.out.println(pt2.getX());
        System.out.println(pt2.getY());
        System.out.println(pt2.getT());
        System.out.println(pt2.modulo());
        System.out.println(pt2.velocidad());
    }
}