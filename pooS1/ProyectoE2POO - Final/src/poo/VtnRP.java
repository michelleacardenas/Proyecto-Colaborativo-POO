/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import cjb.ci.Validaciones;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import static poo.VtnPrincipal.d;
import static poo.VtnPrincipal.h;
import static poo.VtnRA.dt;

/**
 *
 * @author marip
 */
public class VtnRP extends javax.swing.JFrame
{

    public static int opc;
    DefaultTableModel model = new DefaultTableModel();

    private boolean desnutricion;
    private boolean sobrepeso;
    private boolean alergias;
    private boolean obesidad;
    private boolean diabetes;
    public static Datos dt[];//Arreglo de datos
    public static HistorialClinico[][] ht;//Matriz de datos
    private int folio;
    private GregorianCalendar c;

    /**
     * Creates new form VtnReportesInfo
     */
    public VtnRP()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Imagen1ORGlogo.png")));
        initComponents();
        this.setLocationRelativeTo(null);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(boton_MayFrec);
        buttonGroup.add(boton_MenFrec);
        VtnPrincipal.disablepaste(otras);

    }

    public void filtros()
    {
        if (d != null)
        {
            if (h != null)
            {
                if (boton_MayFrec.isSelected() == true)
                {
                    dt = Manipulacion.ordenarMayMen(d, h, this);
                }
                if (boton_MenFrec.isSelected() == true)
                {
                    dt = Manipulacion.ordenarMenMay(d, h, this);
                }
                if (boton_MenFrec.isSelected() == false && boton_MayFrec.isSelected() == false)
                {
                    dt = d.clone();
                }
                for (int i = 0; i < dt.length; i++)
                {
                    boolean fil = true; //verifica la categoria
                    if (check_Hom.isSelected() && dt[i].getSexo() != 'M')
                    {
                        fil = false;
                    }
                    if (check_Muj.isSelected() && dt[i].getSexo() != 'F')
                    {
                        fil = false;
                    }
                    if (check_Ale.isSelected() && dt[i].isAlergias() != true)
                    {
                        fil = false;
                    }
                    if (check_Sob.isSelected() && dt[i].isSobrepeso() != true)
                    {
                        fil = false;
                    }
                    if (check_diab.isSelected() && dt[i].isDiabetes() != true)
                    {
                        fil = false;
                    }
                    if (check_desn.isSelected() && dt[i].isDesnutricion() != true)
                    {
                        fil = false;
                    }
                    if (check_obes.isSelected() && dt[i].isObesidad() != true)
                    {
                        fil = false;
                    }
                    if (otrasboton.isSelected() && (dt[i].getOtras() == null ? otras.getText() != null : !dt[i].getOtras().equals(otras.getText())))
                    {
                        fil = false;
                    }
                    if (fil == false)
                    {

                    }
                }
            } else
            {
                Mensaje.error(this, "\"No existen consultas registradas, debes ingresar primero consultas\"");
            }

            if (dt != null) //todo lo que haya sido 'true' será visto en tabla
            {
                Manipulacion.consultasTab(dt, 2, jTable_reg);
            } else
            {
                Mensaje.error(this, "Error, ingresar primero datos");
            }
        } else
        {
            Mensaje.error(this, "No existen datos registrados, debes ingresar primero datos");
            this.setVisible(false);
        }
    }

    public void generaPDF(int opcpdf)
    {
        c = new GregorianCalendar();
        String d, m, a;
        d = Integer.toString(c.get(Calendar.DATE));
        m = Integer.toString(c.get(Calendar.MONTH));
        a = Integer.toString(c.get(Calendar.YEAR));
        int mm = Integer.parseInt(m);
        mm = mm + 1;
        String f = d + "/" + mm + "/" + a;

        if (VtnPrincipal.d != null)
        {

            if (boton_MayFrec.isSelected() == true)
            {
                dt = Manipulacion.ordenarMayMen(VtnPrincipal.d, VtnPrincipal.h, this);
            }
            if (boton_MenFrec.isSelected() == true)
            {
                dt = Manipulacion.ordenarMenMay(VtnPrincipal.d, VtnPrincipal.h, this);
            }
            if (boton_MenFrec.isSelected() == false && boton_MayFrec.isSelected() == false)
            {
                dt = VtnPrincipal.d.clone();
            }
            for (int i = 0; i < dt.length; i++)
            {
                boolean fil = true; //verifica la categoria
                if (check_Hom.isSelected() && dt[i].getSexo() != 'M')
                {
                    fil = false;
                }
                if (check_Muj.isSelected() && dt[i].getSexo() != 'F')
                {
                    fil = false;
                }
                if (check_Ale.isSelected() && dt[i].isAlergias() != true)
                {
                    fil = false;
                }
                if (check_Sob.isSelected() && dt[i].isSobrepeso() != true)
                {
                    fil = false;
                }
                if (check_diab.isSelected() && dt[i].isDiabetes() != true)
                {
                    fil = false;
                }
                if (check_desn.isSelected() && dt[i].isDesnutricion() != true)
                {
                    fil = false;
                }
                if (check_obes.isSelected() && dt[i].isObesidad() != true)
                {
                    fil = false;
                }
                if (otrasboton.isSelected() && (dt[i].getOtras() == null ? otras.getText() != null : !dt[i].getOtras().equals(otras.getText())))
                {
                    fil = false;
                }
                if (fil == false)
                {
                    dt[i] = null;
                }
                if (fil == true && dt[i] instanceof Personal)
                {
                    PlantillaPdf plantilla = new PlantillaPdf("Reportes de Información", f);
                    plantilla.crearPlantilla(dt, opcpdf);
                }
            }

            Mensaje.exito(this, "PDF creado con éxito");

        } else
        {
            Mensaje.error(this, "No existen datos registrados");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        imprimirBTN = new javax.swing.JButton();
        mostrarRbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        check_Muj = new javax.swing.JCheckBox();
        check_Ale = new javax.swing.JCheckBox();
        check_Hom = new javax.swing.JCheckBox();
        check_diab = new javax.swing.JCheckBox();
        check_desn = new javax.swing.JCheckBox();
        check_obes = new javax.swing.JCheckBox();
        check_Sob = new javax.swing.JCheckBox();
        otras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boton_MayFrec = new javax.swing.JRadioButton();
        boton_MenFrec = new javax.swing.JRadioButton();
        jButton_Regresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        otrasboton = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_reg = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        reiniciarbtn = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imprimirBTN.setBackground(new java.awt.Color(0, 102, 0));
        imprimirBTN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        imprimirBTN.setForeground(new java.awt.Color(255, 255, 255));
        imprimirBTN.setText("Imprimir");
        imprimirBTN.setToolTipText("Generar PDF");
        imprimirBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imprimirBTN.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                imprimirBTNActionPerformed(evt);
            }
        });
        getContentPane().add(imprimirBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 90, 20));

        mostrarRbtn.setBackground(new java.awt.Color(0, 102, 0));
        mostrarRbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarRbtn.setForeground(new java.awt.Color(255, 255, 255));
        mostrarRbtn.setText("Mostrar");
        mostrarRbtn.setToolTipText("Mostrar Tabla Filtrada");
        mostrarRbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarRbtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mostrarRbtnActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarRbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 90, 20));

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("Filtros:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, 20));

        check_Muj.setText("Mujeres");
        check_Muj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_Muj.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                check_MujActionPerformed(evt);
            }
        });
        getContentPane().add(check_Muj, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 20));

        check_Ale.setText("Alergias");
        check_Ale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_Ale.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                check_AleActionPerformed(evt);
            }
        });
        getContentPane().add(check_Ale, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        check_Hom.setText("Hombres");
        check_Hom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(check_Hom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        check_diab.setText("Diabetes");
        check_diab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(check_diab, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        check_desn.setText("Desnutrición");
        check_desn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(check_desn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        check_obes.setText("Obesidad");
        check_obes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(check_obes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));

        check_Sob.setText("Sobrepeso");
        check_Sob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(check_Sob, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));

        otras.setEnabled(false);
        otras.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                otrasActionPerformed(evt);
            }
        });
        otras.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                otrasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                otrasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                otrasKeyTyped(evt);
            }
        });
        getContentPane().add(otras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 60, 20));

        jLabel3.setText("Otros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, 20));

        boton_MayFrec.setText("Mayor frecuencia");
        boton_MayFrec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_MayFrec.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                boton_MayFrecActionPerformed(evt);
            }
        });
        getContentPane().add(boton_MayFrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 20));

        boton_MenFrec.setText("Menor frecuencia");
        boton_MenFrec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_MenFrec.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                boton_MenFrecActionPerformed(evt);
            }
        });
        getContentPane().add(boton_MenFrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 20));

        jButton_Regresar.setBackground(new java.awt.Color(153, 153, 0));
        jButton_Regresar.setFont(new java.awt.Font("Zilla Slab Medium", 1, 14)); // NOI18N
        jButton_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Regresar.setText("<");
        jButton_Regresar.setToolTipText("Regresar al Submenú de Personal");
        jButton_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        jLabel5.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Reportes de Información");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

        otrasboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        otrasboton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                otrasbotonActionPerformed(evt);
            }
        });
        getContentPane().add(otrasboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 20));

        jLabel7.setText(" en citas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 20));

        jLabel8.setText(" en citas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 20));

        jTable_reg.setAutoCreateRowSorter(true);
        jTable_reg.setBackground(new java.awt.Color(255, 255, 247));
        jTable_reg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable_reg.setFont(new java.awt.Font("Zilla Slab", 0, 12)); // NOI18N
        jTable_reg.setForeground(new java.awt.Color(102, 51, 0));
        jTable_reg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "CVE", "Nombre	", "Primer Apellido", "Segundo Apellido", "Sexo", "Desnutrición", "Sobrepeso", "Alergías", "Obesidad", "Diabetes", "Otras", "Estatus"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTable_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_reg.setSelectionBackground(new java.awt.Color(255, 255, 51));
        jTable_reg.setSelectionForeground(new java.awt.Color(51, 51, 255));
        jTable_reg.setShowHorizontalLines(true);
        jTable_reg.setShowVerticalLines(true);
        jTable_reg.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_reg);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 790, 380));

        jLabel6.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("de Personal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel28.setBackground(new java.awt.Color(0, 102, 51));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde2.png"))); // NOI18N
        jLabel28.setText("jLabel5");
        jLabel28.setMaximumSize(new java.awt.Dimension(540, 100));
        jLabel28.setMinimumSize(new java.awt.Dimension(420, 80));
        jLabel28.setPreferredSize(new java.awt.Dimension(540, 100));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 110));

        reiniciarbtn.setBackground(new java.awt.Color(153, 153, 0));
        reiniciarbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarbtn.setForeground(new java.awt.Color(255, 255, 255));
        reiniciarbtn.setText("Reiniciar");
        reiniciarbtn.setToolTipText("Reiniciar Filtros");
        reiniciarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reiniciarbtn.setEnabled(false);
        reiniciarbtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                reiniciarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 90, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirBTNActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_imprimirBTNActionPerformed
    {//GEN-HEADEREND:event_imprimirBTNActionPerformed
        generaPDF(2);
        CtrlInterfaz.habilita(true, reiniciarbtn);
    }//GEN-LAST:event_imprimirBTNActionPerformed

    private void mostrarRbtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mostrarRbtnActionPerformed
    {//GEN-HEADEREND:event_mostrarRbtnActionPerformed
        filtros();
        CtrlInterfaz.habilita(true, reiniciarbtn);
    }//GEN-LAST:event_mostrarRbtnActionPerformed

    private void check_MujActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_check_MujActionPerformed
    {//GEN-HEADEREND:event_check_MujActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_MujActionPerformed

    private void check_AleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_check_AleActionPerformed
    {//GEN-HEADEREND:event_check_AleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_AleActionPerformed

    private void otrasKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_otrasKeyReleased
    {//GEN-HEADEREND:event_otrasKeyReleased
        filtrar();
    }//GEN-LAST:event_otrasKeyReleased

    private void otrasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_otrasActionPerformed
    {//GEN-HEADEREND:event_otrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrasActionPerformed

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_RegresarActionPerformed
    {//GEN-HEADEREND:event_jButton_RegresarActionPerformed
        new VtnSubmenu().setVisible(true);
        VtnSubmenu.tsubmenu.setText("           Personal");
        dispose();
    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void otrasKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_otrasKeyTyped
    {//GEN-HEADEREND:event_otrasKeyTyped
        Validaciones.validaAlfabeticos(evt, 20, otras.getText());
    }//GEN-LAST:event_otrasKeyTyped

    private void otrasKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_otrasKeyPressed
    {//GEN-HEADEREND:event_otrasKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, otras, otras);
    }//GEN-LAST:event_otrasKeyPressed

    private void boton_MenFrecActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton_MenFrecActionPerformed
    {//GEN-HEADEREND:event_boton_MenFrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_MenFrecActionPerformed

    private void otrasbotonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_otrasbotonActionPerformed
    {//GEN-HEADEREND:event_otrasbotonActionPerformed
        if (otrasboton.isSelected())
        {
            CtrlInterfaz.habilita(true, otras);
            CtrlInterfaz.cambia(otras);
        } else
        {
            CtrlInterfaz.habilita(false, otras);
            CtrlInterfaz.cambia(mostrarRbtn);
        }
    }//GEN-LAST:event_otrasbotonActionPerformed

    private void boton_MayFrecActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_boton_MayFrecActionPerformed
    {//GEN-HEADEREND:event_boton_MayFrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_MayFrecActionPerformed

    private void reiniciarbtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_reiniciarbtnActionPerformed
    {//GEN-HEADEREND:event_reiniciarbtnActionPerformed
        Manipulacion.consultasTab(d, 1, jTable_reg);
        CtrlInterfaz.limpia(check_Ale, check_Hom, check_Muj, check_Sob, check_desn, check_diab, check_obes, boton_MayFrec, boton_MenFrec, otrasboton, otras);
        check_Hom.setSelected(false);
        check_Muj.setSelected(false);
        check_Ale.setSelected(false);
        check_Sob.setSelected(false);
        check_desn.setSelected(false);
        check_diab.setSelected(false);
        check_obes.setSelected(false);
        otrasboton.setSelected(false);
        boton_MayFrec.setSelected(false);
        boton_MenFrec.setSelected(false);
    }//GEN-LAST:event_reiniciarbtnActionPerformed

    private void filtrar()
    {
        try
        {
            Manipulacion.sorter.setRowFilter(RowFilter.regexFilter(otras.getText(), 10));

        } catch (Exception e)
        {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnRP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnRP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnRP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnRP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnRP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boton_MayFrec;
    private javax.swing.JRadioButton boton_MenFrec;
    private javax.swing.JCheckBox check_Ale;
    private javax.swing.JCheckBox check_Hom;
    private javax.swing.JCheckBox check_Muj;
    private javax.swing.JCheckBox check_Sob;
    private javax.swing.JCheckBox check_desn;
    private javax.swing.JCheckBox check_diab;
    private javax.swing.JCheckBox check_obes;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton imprimirBTN;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_reg;
    private javax.swing.JButton mostrarRbtn;
    private javax.swing.JTextField otras;
    private javax.swing.JCheckBox otrasboton;
    private javax.swing.JButton reiniciarbtn;
    // End of variables declaration//GEN-END:variables
}
