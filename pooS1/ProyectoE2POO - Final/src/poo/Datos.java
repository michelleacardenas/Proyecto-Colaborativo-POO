package poo;

import java.io.Serializable;

/**
 *
 * @author medra
 */
public abstract class Datos implements Serializable
{

    private static long serialVersionUID = 1L;
    private String cve;
    private String nom;
    private String primerAp;
    private String segundoAp;
    private char sexo;
    private boolean desnutricion;
    private boolean sobrepeso;
    private boolean alergias;
    private boolean obesidad;
    private boolean diabetes;
    private String otras;
    private static int folio;

    public Datos(String cve, String nom, String primerAp, String segundoAp,char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes, String otras)
    {

        for (int i = cve.length(); i < 7; i++)
        {
            cve = "0" + cve;
        }
        this.cve = cve;
        this.nom = nom;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.sexo= sexo;
        this.desnutricion = desnutricion;
        this.sobrepeso = sobrepeso;
        this.alergias = alergias;
        this.obesidad = obesidad;
        this.diabetes = diabetes;
        this.otras = otras;
    }

    public Datos()
    {
    }

    public abstract double calIva(int cant, double pre);

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID()
    {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID)
    {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the cve
     */
    public String getCve()
    {
        return cve;
    }

    /**
     * @param cve the cve to set
     */
    public void setCve(String cve)
    {
        this.cve = cve;
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * @return the primerAp
     */
    public String getPrimerAp()
    {
        return primerAp;
    }

    /**
     * @param primerAp the primerAp to set
     */
    public void setPrimerAp(String primerAp)
    {
        this.primerAp = primerAp;
    }

    /**
     * @return the segundoAp
     */
    public String getSegundoAp()
    {
        return segundoAp;
    }

    /**
     * @param segundoAp the segundoAp to set
     */
    public void setSegundoAp(String segundoAp)
    {
        this.segundoAp = segundoAp;
    }

    /**
     * @return the desnutricion
     */
    public boolean isDesnutricion()
    {
        return desnutricion;
    }

    /**
     * @param desnutricion the desnutricion to set
     */
    public void setDesnutricion(boolean desnutricion)
    {
        this.desnutricion = desnutricion;
    }

    /**
     * @return the sobrepeso
     */
    public boolean isSobrepeso()
    {
        return sobrepeso;
    }

    /**
     * @param sobrepeso the sobrepeso to set
     */
    public void setSobrepeso(boolean sobrepeso)
    {
        this.sobrepeso = sobrepeso;
    }

    /**
     * @return the alergias
     */
    public boolean isAlergias()
    {
        return alergias;
    }

    /**
     * @param alergias the alergias to set
     */
    public void setAlergias(boolean alergias)
    {
        this.alergias = alergias;
    }

    /**
     * @return the obecidad
     */
    public boolean isObesidad()
    {
        return obesidad;
    }

    /**
     * @param obesidad the obecidad to set
     */
    public void setObesidad(boolean obesidad)
    {
        this.obesidad = obesidad;
    }

    /**
     * @return the diabetes
     */
    public boolean isDiabetes()
    {
        return diabetes;
    }

    /**
     * @param diabetes the diabetes to set
     */
    public void setDiabetes(boolean diabetes)
    {
        this.diabetes = diabetes;
    }

    /**
     * @return the otras
     */
    public String getOtras()
    {
        return otras;
    }

    /**
     * @param otras the otras to set
     */
    public void setOtras(String otras)
    {
        this.otras = otras;
    }

    /**
     * @return the folio
     */
    public static int getFolio()
    {
        return folio;
    }

    /**
     * @param aFolio the folio to set
     */
    public static void setFolio(int aFolio)
    {
        folio = aFolio;
    }

    @Override
    public String toString()//Metodo heredable para presentar los datos en forma de tabla
    {
        return cve + "\t" + nom + "\t" + primerAp + "\t" + segundoAp + "\t" + sexo+"\t"+ desnutricion + "\t" + sobrepeso + "\t" + alergias + "\t" + obesidad + "\t" + diabetes + "\t" + otras;
    }

    /**
     * @return the sexo
     */
    public char getSexo()
    {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }
}
