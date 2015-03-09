
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private static final int COMIENZO = 0;
    private static final int NOMBRE = 3;
    private static final int PRIMER_APELLIDO = 3;
    private static final int SEGUNDO_APELLIDO = 2;
    private static final int CIUDAD = 3;
    

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String generateStarWarsName(String nameOriginal, String primerApellido, String segundoApellido, String ciudadNacimiento)
    {
        String nombreStarWars;
        nombreStarWars = primerApellido.substring(COMIENZO,PRIMER_APELLIDO)+ nameOriginal.substring(COMIENZO,NOMBRE) + " " + segundoApellido.substring(COMIENZO,SEGUNDO_APELLIDO) + ciudadNacimiento.substring(COMIENZO,CIUDAD);;
        return nombreStarWars;
    }
}
