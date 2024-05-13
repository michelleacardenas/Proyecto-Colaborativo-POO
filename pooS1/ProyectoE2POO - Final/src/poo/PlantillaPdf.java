/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import cjb.ci.Mensajes;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Random;

/**
 *
 * @author Estrada
 */
public class PlantillaPdf
{

    String reporte;
    String fecha;
    Document documento;
    Paragraph titulo;
    FileOutputStream archivo;

    public PlantillaPdf(String reporte, String fecha)
    {
        this.reporte = reporte;
        this.fecha = fecha;

        documento = new Document(PageSize.LETTER.rotate());
        titulo = new Paragraph("Reportes de Información");
        titulo.setAlignment(1);
    }

    public void crearPlantilla(Datos[] d, int opc)
    {
        try
        {
            Random random = new Random();
            int folio = random.nextInt(1000);
            archivo = new FileOutputStream("Reporte_de_Información" + folio + ".pdf");
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, archivo);
            documento.open();

            documento.add(titulo);

            if (opc == 1)
            {
                documento.add(new Paragraph("Alumnos"));

                documento.add(Chunk.NEWLINE);

                PdfPTable tabla = new PdfPTable(13);
                tabla.setWidthPercentage(100);

                PdfPCell cvee = new PdfPCell(new Phrase("CVE"));
                cvee.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell nomb = new PdfPCell(new Phrase("Nombre"));
                nomb.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell prap = new PdfPCell(new Phrase("Primer Apellido"));
                prap.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell seap = new PdfPCell(new Phrase("Segundo Apellido"));
                seap.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell sex = new PdfPCell(new Phrase("Sexo"));
                sex.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell des = new PdfPCell(new Phrase("Desnutrición"));
                des.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell sob = new PdfPCell(new Phrase("Sobrepeso"));
                sob.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell ale = new PdfPCell(new Phrase("Alergias"));
                ale.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell obe = new PdfPCell(new Phrase("Obesidad"));
                obe.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell diab = new PdfPCell(new Phrase("Diabetes"));
                diab.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell otr = new PdfPCell(new Phrase("Otras"));
                otr.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell vive = new PdfPCell(new Phrase("Vive con"));
                vive.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell carre = new PdfPCell(new Phrase("Carrera"));
                carre.setBackgroundColor(BaseColor.YELLOW);

                tabla.addCell(cvee);
                tabla.addCell(nomb);
                tabla.addCell(prap);
                tabla.addCell(seap);
                tabla.addCell(sex);
                tabla.addCell(des);
                tabla.addCell(sob);
                tabla.addCell(ale);
                tabla.addCell(obe);
                tabla.addCell(diab);
                tabla.addCell(otr);
                tabla.addCell(vive);
                tabla.addCell(carre);

                for (int i = 0; i < d.length; i++)
                {
                    if (d[i] instanceof Alumnos)
                    {
                        tabla.addCell(d[i].getCve());
                        tabla.addCell(d[i].getNom());
                        tabla.addCell(d[i].getPrimerAp());
                        tabla.addCell(d[i].getSegundoAp());
                        tabla.addCell(String.valueOf(d[i].getSexo()));
                        tabla.addCell(String.valueOf(d[i].isDesnutricion()));
                        tabla.addCell(String.valueOf(d[i].isSobrepeso()));
                        tabla.addCell(String.valueOf(d[i].isAlergias()));
                        tabla.addCell(String.valueOf(d[i].isObesidad()));
                        tabla.addCell(String.valueOf(d[i].isDiabetes()));
                        tabla.addCell(d[i].getOtras());
                        String viv = String.valueOf(((Alumnos) d[i]).getViveCon());
                        tabla.addCell(viv);
                        String carr = String.valueOf(((Alumnos) d[i]).getCarrera());
                        tabla.addCell(carr);
                    }

                }

                documento.add(tabla);

                documento.add(new Paragraph("Fecha: " + fecha));

            } else
            {
                documento.add(new Paragraph("Personal"));

                documento.add(Chunk.NEWLINE);

                PdfPTable tabla = new PdfPTable(12);
                tabla.setWidthPercentage(100);

                PdfPCell cveee = new PdfPCell(new Phrase("CVE"));
                cveee.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell nombr = new PdfPCell(new Phrase("Nombre"));
                nombr.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell prapp = new PdfPCell(new Phrase("Primer Apellido"));
                prapp.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell seapp = new PdfPCell(new Phrase("Segundo Apellido"));
                seapp.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell sexx = new PdfPCell(new Phrase("Sexo"));
                sexx.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell desn = new PdfPCell(new Phrase("Desnutrición"));
                desn.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell sobr = new PdfPCell(new Phrase("Sobrepeso"));
                sobr.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell aler = new PdfPCell(new Phrase("Alergias"));
                aler.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell obes = new PdfPCell(new Phrase("Obesidad"));
                obes.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell diabe = new PdfPCell(new Phrase("Diabetes"));
                diabe.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell otra = new PdfPCell(new Phrase("Otras"));
                otra.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell esta = new PdfPCell(new Phrase("Estatus"));
                esta.setBackgroundColor(BaseColor.YELLOW);

                tabla.addCell(cveee);
                tabla.addCell(nombr);
                tabla.addCell(prapp);
                tabla.addCell(seapp);
                tabla.addCell(sexx);
                tabla.addCell(desn);
                tabla.addCell(sobr);
                tabla.addCell(aler);
                tabla.addCell(obes);
                tabla.addCell(diabe);
                tabla.addCell(otra);
                tabla.addCell(esta);

                for (int i = 0; i < d.length; i++)
                {
                    if (d[i] instanceof Personal)
                    {
                        tabla.addCell(d[i].getCve());
                        tabla.addCell(d[i].getNom());
                        tabla.addCell(d[i].getPrimerAp());
                        tabla.addCell(d[i].getSegundoAp());
                        tabla.addCell(String.valueOf(d[i].getSexo()));
                        tabla.addCell(String.valueOf(d[i].isDesnutricion()));
                        tabla.addCell(String.valueOf(d[i].isSobrepeso()));
                        tabla.addCell(String.valueOf(d[i].isAlergias()));
                        tabla.addCell(String.valueOf(d[i].isObesidad()));
                        tabla.addCell(String.valueOf(d[i].isDiabetes()));
                        tabla.addCell(d[i].getOtras());
                        String est = String.valueOf(((Personal) d[i]).getEstatus());
                        tabla.addCell(est);
                    }
                }

                documento.add(tabla);
                documento.add(new Paragraph("Fecha: " + fecha));
            }
            documento.close();
//            documento.add(new Paragraph("Alumnos"));

        } catch (Exception e)
        {
            Mensajes.error(null, "No existen datos registrados, ingresa primero datos");
            Mensajes.error(null, "Error: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
