package poo;

/**
 *
 * @author medra
 */
public class Personal extends Datos implements Machote//Hereda de productos
{

    private char estatus;

    public Personal()
    {
    }

    public Personal(String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes, String otras,char estatus)
    {
        super(cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
        this.estatus = estatus;
    }

    /**
     * @return the estatus
     */
    public char getEstatus()
    {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(char estatus)
    {
        this.estatus = estatus;
    }

    @Override
    public String toString()//Uso de metodo heredado + viveCon(Propiedad de Alumnos)
    {
        return super.toString() + "\t\t" + estatus + '\n';
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
