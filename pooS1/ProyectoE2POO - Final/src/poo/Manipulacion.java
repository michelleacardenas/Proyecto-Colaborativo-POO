package poo;

import cjb.ci.Mensajes;
import java.time.LocalDate;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author medra
 */
public class Manipulacion
{

    private static int v;
    private static boolean vf;

    static TableRowSorter<DefaultTableModel> sorter;
    private static HistorialClinico[][] ht;
    private static Datos[] dt;
    private static String st;

    public static Datos[] inserta(Datos[] d, Datos obj)//Inserción de datos
    {
        if (d == null)
        {
            d = new Datos[1];
        } else
        {
            Datos nvo[] = new Datos[d.length + 1];
            System.arraycopy(d, 0, nvo, 0, d.length);
            d = nvo;
        }
        d[d.length - 1] = obj;
        return d;
    }

    public static HistorialClinico[] insCon(HistorialClinico[] h, int numeroFila, HistorialClinico obj, JFrame jf)
    {
        if (h != null)
        {
            HistorialClinico[] ht = new HistorialClinico[h.length + 1];// Crear una nueva matriz con una columna adicional
            for (int i = 0; i < h.length; i++)// Copiar los elementos del renglon originales a la nueva matriz
            {
                ht[i] = h[i];
            }
            ht[h.length] = obj;// Agregar el nuevo dato en la columna específica de la fila
            return ht;
        } else
        {
            HistorialClinico[] ht = new HistorialClinico[1];
            ht[0] = obj;
            return ht;
        }
    }

    public static HistorialClinico[][] insf(HistorialClinico[][] h, JFrame jf)
    {
        if (h != null)
        {
            HistorialClinico[][] ht = new HistorialClinico[h.length + 1][1];// Crear una nueva matriz con una fila adicional
            for (int i = 0; i < h.length; i++)// Copiar la matriz original a la nueva matriz (apuntando a las mismas referencias)
            {
                ht[i] = h[i];
            }
            return ht;
        } else
        {
            HistorialClinico[][] ht = new HistorialClinico[1][1];
            return ht;
        }
    }

    public static void consultasTab(Datos[] d, int opc, JTable jTable)
    {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setRowCount(0);// Limpia el modelo de la tabla
        String[] columnas = null;
        if (opc == 1)
        {
            columnas = new String[]
            {
                "CVE", "Nombre", "Primer Apellido", "Segundo Apellido", "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obesidad", "Diabetes", "Otras", "Vive con", "Carrera"
            };
        }
        if (opc == 2)
        {
            columnas = new String[]
            {
                "CVE", "Nombre", "Primer Apellido", "Segundo Apellido", "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obecidad", "Diabetes", "Otras", "Estatus"
            };
        }
        modelo.setColumnIdentifiers(columnas);
        for (int i = 0; i < d.length; i++)
        {
            if ((opc == 1 && d[i] instanceof Alumnos) || (opc == 2 && d[i] instanceof Personal))
            {
                String[] fila = d[i].toString().split("\t");
                modelo.addRow(fila);
            }
        }
    }

    public static String texto(Datos[] d, HistorialClinico[][] h, int i, int j, JFrame jf)//Metodo heredable para presentar los datos en forma de tabla
    {
        st = d[i].getCve() + "\t" + h[i][j].getFecha() + "\t" + h[i][j].getPadecimientoAct() + "\t" + h[i][j].getAntecedentesPer() + "\t" + h[i][j].getMedicamento() + "\t" + h[i][j].getPlanTratamiento() + "\t";
        return st;
    }

    public static void consultasTabA(Datos[] d, HistorialClinico[][] h, JTable jTable, JFrame jf)
    {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setRowCount(0);// Limpia el modelo de la tabla
        String[] columnas;
        columnas = new String[]
        {
            "\tCVE\t", "\tFecha\t", "\tPadecimiento Actual\t", "\tAntecedentes Personales\t", "\tMedicamento\t", "\tPlan de Tratamiento\t"
        };
        modelo.setColumnIdentifiers(columnas);
        for (int i = 0; i < h.length; i++)
        {
            if (d[i] instanceof Alumnos)
            {
                if (h[i] != null)
                {
                    for (int j = 1; j < h[i].length; j++)
                    {
                        String[] fila = texto(d, h, i, j, jf).split("\t");
                        modelo.addRow(fila);
                    }
                }
            }
        }
    }

    public static void consultasTabP(Datos[] d, HistorialClinico[][] h, JTable jTable, JFrame jf)
    {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setRowCount(0);// Limpia el modelo de la tabla
        String[] columnas;
        columnas = new String[]
        {
            "\tCVE\t", "\tFecha\t", "\tPadecimiento Actual\t", "\tAntecedentes Personales\t", "\tMedicamento\t", "\tPlan de Tratamiento\t"
        };
        modelo.setColumnIdentifiers(columnas);
        for (int i = 0; i < h.length; i++)
        {
            if (d[i] instanceof Personal)
            {
                if (h[i] != null)
                {
                    for (int j = 1; j < h[i].length; j++)
                    {
                        String[] fila = texto(d, h, i, j, jf).split("\t");
                        modelo.addRow(fila);
                    }
                }
            }
        }
    }

    public static int verificador(JFrame jf, Datos[] d, int opc, String ver)
    {
        v = -1;
        if (d != null)
        {
            for (int i = ver.length(); i < 7; i++)
            {
                ver = "0" + ver;
            }
            for (int i = 0; i < d.length; i++)
            {
                if (opc == 1 && d[i] instanceof Alumnos && d[i].getCve().equals(ver))
                {
                    v = i;
                }
                if (opc == 2 && d[i] instanceof Personal && d[i].getCve().equals(ver))
                {
                    v = i;
                }
            }
        } else
        {
            v = -2;
        }
        return v;
    }

    public static boolean verifNR(Datos[] d, int opc, String ver)
    {
        vf = false;
        if (d != null)
        {
            for (int i = ver.length(); i < 7; i++)
            {
                ver = "0" + ver;
            }
            for (int i = 0; i < d.length; i++)
            {
                if (opc == 1 && d[i] instanceof Alumnos && d[i].getCve().equals(ver))
                {
                    vf = true;
                }
                if (opc == 2 && d[i] instanceof Personal && d[i].getCve().equals(ver))
                {
                    vf = true;
                }
            }
        } else
        {
            vf = false;
        }
        return vf;
    }

    public static Datos[] ordenarMayMen(Datos[] d, HistorialClinico[][] h, JFrame jf)
    {
        int lg = d.length;
        dt = d.clone(); // Copiar el arreglo original a dt
        ht = h.clone();// Copiar matriz original a ht
        if (dt != null && ht != null)
        {
            for (int i = 0; i < lg - 1; i++)
            {
                for (int j = 0; j < lg - 1 - i; j++)
                {
                    if (ht[j] != null && ht[j + 1] != null && ht[j].length < ht[j + 1].length) // Cambiar la condición para ordenar de menor a mayor
                    {
                        Datos temp = dt[j];// Intercambiar elementos en el arreglo dt
                        dt[j] = dt[j + 1];
                        dt[j + 1] = temp;
                        HistorialClinico[] tempHistorial = ht[j];
                        ht[j] = ht[j + 1];
                        ht[j + 1] = tempHistorial;
                    }
                    if (ht[j] == null) // Cambiar la condición para ordenar de menor a mayor
                    {
                        dt[j] = null;
                        ht[j] = null;
                    }
                }
            }
        }
        return dt;
    }

    public static Datos[] ordenarMenMay(Datos[] d, HistorialClinico[][] h, JFrame jf)
    {
        int lg = d.length;
        dt = d.clone(); // Copiar el arreglo original a dt
        ht = h.clone();// Copiar matriz original a ht
        if (dt != null && ht != null)
        {
            for (int i = 0; i < lg - 1; i++)
            {
                for (int j = 0; j < lg - 1 - i; j++)
                {
                    if (ht[j] != null && ht[j + 1] != null && ht[j].length > ht[j + 1].length) // Cambiar la condición para ordenar de menor a mayor
                    {
                        Datos temp = dt[j]; // Intercambiar elementos en el arreglo dt
                        dt[j] = dt[j + 1];
                        dt[j + 1] = temp;
                        HistorialClinico[] tempHistorial = ht[j];
                        ht[j] = ht[j + 1];
                        ht[j + 1] = tempHistorial;
                    }
                    if (ht[j] == null) // Cambiar la condición para ordenar de menor a mayor
                    {
                        dt[j] = null;
                        ht[j] = null;
                    }
                }
            }
        }
        return dt;
    }

    public static Datos[] bajas(Datos[] d, int opc, int pos)
    {
//        System.out.println("== BAJAS ==");
//        boolean valor = false;
//        System.out.println("Dame el id del producto");
//        String s = Lecturas.leerString();
//        int pos = busca(s, p);
        if (d != null) //si el arreglo no es nulo
        {
            if (pos >= 0 && pos < d.length) //Si la posicion a eliminar esta dentro del parametro del arreglo
            {
                if (pos == 0 && d.length == 1) //si p es 0 y el arreglo solo tiene 1 posicion -> BORRANDO EL ULTIMO DATO QUE EXISTIA
                {
                    if (opc == 1 && d[0] instanceof Alumnos)
                    {
                        d = null; // el arreglo se vuelve nulo
//                        System.out.println("BAJA REALIZADA CON ÉXITO");
                    }
                    if (opc == 2 && d[0] instanceof Personal)
                    {
                        d = null; // el arreglo se vuelve nulo
//                        System.out.println("BAJA REALIZADA CON ÉXITO");
                    }
                } else // si el arreglo tiene mas posiciones
                {

                    Datos nuevo[] = new Datos[d.length - 1]; //el nuevo arreglo menos 1 que es la posicion que desaparece
                    for (int j = 0, i = 0; i < d.length; i++)
                    {
                        if (i != pos) //si la posicion i es diferente de la que se eliminara
                        {
                            nuevo[j++] = d[i]; //el valor en i se agrega al nuevo arreglo
                        }
                    }
                    d = nuevo;
//                        System.out.println("BAJA REALIZADA CON ÉXITO");
                    return d;

                }
            } else
            {
                System.out.println(" Id no encontrado "); //Cuando la posicion esta  fuera del tamaño del arreglo
            }
        } else
        {
            System.out.println("No hay datos "); //si es arreglo nulo
        }
        return d;
    }

    public static void consultasTabB(Datos[] d, int opc, int vne, JTable jTable, JTextField txt, String ver)
    {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        modelo.setRowCount(0);// Limpia el modelo de la tabla
        String[] columnas = null;
        if (opc == 1)
        {
            columnas = new String[]
            {
                "CVE", "Nombre", "Primer Apellido", "Segundo Apellido", "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obesidad", "Diabetes", "Otras", "Vive con", "Carrera"
            };
        }
        if (opc == 2)
        {
            columnas = new String[]
            {
                "CVE", "Nombre", "Primer Apellido", "Segundo Apellido", "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obecidad", "Diabetes", "Otras", "Estatus"
            };
        }
        modelo.setColumnIdentifiers(columnas);
        for (int i = 0; i < d.length; i++)
        {
            if (txt.getText().equals(d[i].getCve()))
            {
                String[] fila = d[vne].toString().split("\t");
                modelo.addRow(fila);

            }
        }
    }

    public static Datos[] bajaArr(Datos[] d, int opc, int pos, JFrame jf)
    {
        if (d != null) //si el arreglo no es nulo
        {
            if (pos >= 0 && pos < d.length) //Si la posicion a eliminar esta dentro del parametro del arreglo
            {
                if (pos == 0 && d.length == 1) //si p es 0 y el arreglo solo tiene 1 posicion -> BORRANDO EL ULTIMO DATO QUE EXISTIA
                {

                    d = null; // el arreglo se vuelve nulo

                } else // si el arreglo tiene mas posiciones
                {

                    Datos nuevo[] = new Datos[d.length - 1]; //el nuevo arreglo menos 1 que es la posicion que desaparece
                    for (int j = 0, i = 0; i < d.length; i++)
                    {
                        if (i != pos) //si la posicion i es diferente de la que se eliminara
                        {
                            nuevo[j++] = d[i]; //el valor en i se agrega al nuevo arreglo
                        }
                    }
                    d = nuevo;
//                        System.out.println("BAJA REALIZADA CON ÉXITO");
                    return d;
                }
            } else
            {
                System.out.println(" Id no encontrado "); //Cuando la posicion esta  fuera del tamaño del arreglo
            }
        } else
        {
            System.out.println("No hay datos "); //si es arreglo nulo
        }
        return d;
    }

    public static int citasPersonal1(Datos[] d, HistorialClinico[][] h)
    {
        int contadorb = 0;
        int contadort = 0;
        if (d != null)
        {
            for (int i = 0; i < d.length; i++)
            {
                for (int j = 0; j < h[i].length; j++)
                {
                    if (d[i] instanceof Personal && h[i].length >= 1)
                    {
                        char esta = ((Personal) d[i]).getEstatus();

                        if (esta == 'B')
                        {
                            System.out.println("Base");
                            contadorb++;

                        } else
                        {

                            if (esta == 'T')
                            {
                                System.out.println("Temporal");
                                contadort++;
                            }
                        }
                    }
                }
            }
            System.out.println("Empleados base con citas");
            System.out.println(contadorb);
            
            System.out.println("Empleados temporal con citas");
            System.out.println(contadort);;
        }
        return 0;
    }

    public static Datos[] personasDia3(Datos[] d, HistorialClinico[][] h, LocalDate fecha)
    {
        if (d != null)
        {

            for (int i = 0; i < d.length; i++)
            {
                for (int j = 0; j < h[i].length; j++)
                {
                    if (d[i] instanceof Alumnos && h[i][j].getFecha().equals(h[i][j++].getFecha()))
                    {
                        System.out.println("Alumnos atendidos el dia" + h[i][j].getFecha());
                        return d;
                    }
                    if (d[i] instanceof Personal && h[i][j].getFecha().equals(h[i][j++].getFecha()))
                    {
                        System.out.println("Personal atendido el dia" + h[i][j].getFecha());
                        return d;

                    }
                }

            }
        } else
        {
            System.out.println("No hay datos");
        }
        return d;
    }

}
