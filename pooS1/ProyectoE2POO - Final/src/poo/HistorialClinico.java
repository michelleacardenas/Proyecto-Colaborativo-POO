package poo;

import java.util.Date;
import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author medra
 */
public class HistorialClinico implements Serializable
{

    private String padecimientoAct;
    private String antecedentesPer;
    private String medicamento;
    private String planTratamiento;
    private  LocalDate fecha;

    public HistorialClinico(String padecimientoAct, String antecedentesPer, String medicamento, String planTratamiento, LocalDate fecha)
    {
        this.padecimientoAct = padecimientoAct;
        this.antecedentesPer = antecedentesPer;
        this.medicamento = medicamento;
        this.planTratamiento = planTratamiento;
        this.fecha = fecha;
    }

    public HistorialClinico()
    {
    }


    /**
     * @return the padecimientoAct
     */
    public String getPadecimientoAct()
    {
        return padecimientoAct;
    }

    /**
     * @param padecimientoAct the padecimientoAct to set
     */
    public void setPadecimientoAct(String padecimientoAct)
    {
        this.padecimientoAct = padecimientoAct;
    }

    /**
     * @return the antecedentesPer
     */
    public String getAntecedentesPer()
    {
        return antecedentesPer;
    }

    /**
     * @param antecedentesPer the antecedentesPer to set
     */
    public void setAntecedentesPer(String antecedentesPer)
    {
        this.antecedentesPer = antecedentesPer;
    }

    /**
     * @return the medicamento
     */
    public String getMedicamento()
    {
        return medicamento;
    }

    /**
     * @param medicamento the medicamento to set
     */
    public void setMedicamento(String medicamento)
    {
        this.medicamento = medicamento;
    }

    /**
     * @return the planTratamiento
     */
    public String getPlanTratamiento()
    {
        return planTratamiento;
    }

    /**
     * @param planTratamiento the planTratamiento to set
     */
    public void setPlanTratamiento(String planTratamiento)
    {
        this.planTratamiento = planTratamiento;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha)
    {
        this.fecha = fecha;
    }
}
