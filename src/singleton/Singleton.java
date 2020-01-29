package singleton;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Singleton {

    public static void main(String[] args) {
    Persona miPersona;
    miPersona = Persona.getInstancePar("Pepito","Grillo",15);
    System.out.println(miPersona.toString());
    Persona tuPersona = Persona.getInstance();
        System.out.println(tuPersona.toString());
        System.out.println(miPersona.toString());

    }
    
}
