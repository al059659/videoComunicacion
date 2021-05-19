package videocomunicacion;

//@author reyap

public class VideoComunicacion {
    
    public static void main(String[] args) {
        
    String nombre = "meet";
    int cantUsuarios = 50;
    int tiempo = 2000;
    String nivel = "Libre";
    int estrellas = 3;
    int calidad = estrellas * cantUsuarios * tiempo;
    System.out.println(calidad);
        
    }
}