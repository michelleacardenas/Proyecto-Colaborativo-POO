package poo;

/**
 *
 * @author medra
 */
public class Alumnos extends Datos implements Machote//Hereda de productos
{

    private int viveCon;
    private String carrera;

    public Alumnos()
    {
    }

    public Alumnos(String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes, String otras,int viveCon, String carrera)
    {
        super(cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
        this.viveCon = viveCon;
        this.carrera = carrera;
    }

    /**
     * @return the viveCon
     */
    public int getViveCon()
    {
        return viveCon;
    }

    /**
     * @param viveCon the viveCon to set
     */
    public void setViveCon(int viveCon)
    {
        this.viveCon = viveCon;
    }

    /**
     * @return the carrera
     */
   public String getCarrera()
    {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }

    @Override
    public String toString()//Uso de metodo heredado + viveCon(Propiedad de Alumnos)
    {
        return super.toString() + "\t\t" + viveCon + "\t\t" + carrera + '\n';
    }

    @Override
    public double calIva(int cant, double pre)
    {
        return 0;
    }

    @Override
    public void accion1()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int accion2(int x)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String accion3(int x, double y, Object z)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
