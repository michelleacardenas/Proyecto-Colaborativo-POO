package poo;

import cjb.ci.Mensajes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;

/**
 *
 * @author medra
 */
public class ManipulacionArchivos
{

//    public static void guarda(JFrame jf, Object obj, String s)
//    {
//        try
//        {
//            FileOutputStream fis = new FileOutputStream("Datos/" + s);
//            ObjectOutputStream arch = new ObjectOutputStream(fis);
//            arch.writeObject(obj);
//            arch.close();
//        } catch (FileNotFoundException ex)
//        {
//            Mensaje.error(jf, "No encontro el archivo");
//        } catch (Exception ex)
//        {
//            Mensaje.error(jf, "Error..." + ex.toString());
//        }
//    }

    public static void guardaA(JFrame jf, Object obj[], String s)
    {
        try
        {
            FileOutputStream fis = new FileOutputStream("Archivos/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fis);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
    }
    public static void guarda(JFrame jf, Object obj[][], String s)
    {
        try
        {
            FileOutputStream fis = new FileOutputStream("Archivos/" + s);
            ObjectOutputStream arch = new ObjectOutputStream(fis);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
    }

    public static Object carga(JFrame jf, String s)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("Archivos/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
        return obj;
    }

    public static Object[] cargaArr(JFrame jf, String s)
    {
        Object obj[] = null;
        try
        {
            FileInputStream fis = new FileInputStream("Archivos/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = (Object[]) arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
        return obj;
    }
    public static Object[][] cargaMat(JFrame jf, String s)
    {
        Object obj[][] = null;
        
        try
        {
            FileInputStream fis = new FileInputStream("Archivos/" + s);
            ObjectInputStream arch = new ObjectInputStream(fis);
            obj = (Object[][]) arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            Mensajes.error(jf, "No encontro el archivo");
        } catch (Exception ex)
        {
            Mensajes.error(jf, "Error..." + ex.toString());
        }
        return obj;
    }
}
