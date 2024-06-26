package poo;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author medra
 */
public class VtnBA extends javax.swing.JFrame
{

    private boolean vf;
    private int vne;
    private static int validaIndex;
    public static Datos d[];//Arreglo de datos
    public static int opc = 1;
    public static HistorialClinico[][] h;

    /**
     * Creates new form VtnAA
     */
    public VtnBA()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Imagen1ORGlogo.png")));
        initComponents();
        this.setLocationRelativeTo(null);

        VtnPrincipal.disablepaste(ver);
    }

    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Imagenc.png"));
        return retValue;
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

        jLabel1 = new javax.swing.JLabel();
        ver = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jButton_Regresar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_BAlum = new javax.swing.JTable();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosed(java.awt.event.WindowEvent evt)
            {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("CVE del Alumno:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, 20));

        ver.setForeground(new java.awt.Color(102, 51, 0));
        ver.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                verActionPerformed(evt);
            }
        });
        ver.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                verKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                verKeyTyped(evt);
            }
        });
        getContentPane().add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 90, -1));

        jLabel2.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Baja de Alumno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        aceptar.setBackground(new java.awt.Color(0, 102, 0));
        aceptar.setFont(new java.awt.Font("Zilla Slab Medium", 1, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("Aceptar");
        aceptar.setToolTipText("Guardar Registro");
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aceptar.setEnabled(false);
        aceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aceptarActionPerformed(evt);
            }
        });
        aceptar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                aceptarKeyPressed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 80, 30));

        cancelar.setBackground(new java.awt.Color(153, 153, 0));
        cancelar.setFont(new java.awt.Font("Zilla Slab Medium", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setToolTipText("Cancelación de Registro");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, 30));

        jButton_Regresar.setBackground(new java.awt.Color(153, 153, 0));
        jButton_Regresar.setFont(new java.awt.Font("Zilla Slab Medium", 1, 14)); // NOI18N
        jButton_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Regresar.setText("<");
        jButton_Regresar.setToolTipText("Regresar a Submenú de Alumnos");
        jButton_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen2.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel20.setBackground(new java.awt.Color(0, 102, 51));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde.png"))); // NOI18N
        jLabel20.setText("jLabel5");
        jLabel20.setMaximumSize(new java.awt.Dimension(540, 100));
        jLabel20.setMinimumSize(new java.awt.Dimension(420, 80));
        jLabel20.setPreferredSize(new java.awt.Dimension(540, 100));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 730, 110));

        jTable_BAlum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_BAlum);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 540, 190));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_verActionPerformed
    {//GEN-HEADEREND:event_verActionPerformed

        vne = Manipulacion.verificador(this, VtnPrincipal.d, 1, ver.getText());
        if (vne == -1)
        {
            Mensajes.error(this, "CVE incorrecto, Ingresa un CVE valido");
            CtrlInterfaz.limpia(ver);
            CtrlInterfaz.habilita(false, ver);
            CtrlInterfaz.cambia(ver);

        } else
        {
            Manipulacion.consultasTabB(VtnPrincipal.d, 1, vne, jTable_BAlum, ver, ver.getText());
            CtrlInterfaz.habilita(true, aceptar);

        }


    }//GEN-LAST:event_verActionPerformed

    private void verKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_verKeyPressed
    {//GEN-HEADEREND:event_verKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, ver, null);
    }//GEN-LAST:event_verKeyPressed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aceptarActionPerformed
    {//GEN-HEADEREND:event_aceptarActionPerformed
        try
        {
            vne = Manipulacion.verificador(this, VtnPrincipal.d, 1, ver.getText());

            
            // Imprime datos antes de la eliminación
//            System.out.println("Datos antes de la eliminación:");
//            for (Datos dato : VtnPrincipal.d)
//            {
//                System.out.println(dato); // con el tostring
//            }
            
            
            VtnPrincipal.d = Manipulacion.bajaArr(VtnPrincipal.d, 1, vne, this);
//            VtnPrincipal.h[vne] = Manipulacion.bajaCols(VtnPrincipal.h[vne], vne, this);
//            VtnPrincipal.h = Manipulacion.bajaMatFil(h, 1, vne, this);
//            VtnPrincipal.h = Manipulacion.bajas(VtnPrincipal.h, vne, this);

            
            
            // Imprime datos después de la eliminación
//            System.out.println("Datos después de la eliminación:");
//            for (Datos dato : VtnPrincipal.d)
//            {
//                System.out.println(dato);
//            }
            
            
            
            ManipulacionArchivos.guardaA(this, VtnPrincipal.d, "Datos.dat");
            ManipulacionArchivos.guarda(this, VtnPrincipal.h, "Historial.dat");

            Mensajes.exito(this, "Baja realizada con éxito");
            CtrlInterfaz.limpia(ver);
            CtrlInterfaz.habilita(false, ver, aceptar);
            CtrlInterfaz.cambia(ver);

        } catch (Exception e)
        {
            Mensajes.error(this, "Error: " + e.toString());
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarActionPerformed
    {//GEN-HEADEREND:event_cancelarActionPerformed

        CtrlInterfaz.limpia(ver);
        CtrlInterfaz.habilita(false, ver, aceptar);
        CtrlInterfaz.cambia(ver);
//        CtrlInterfaz.habilita(false, aceptar);
//        CtrlInterfaz.cambia(cve);
    }//GEN-LAST:event_cancelarActionPerformed

    private void verKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_verKeyTyped
    {//GEN-HEADEREND:event_verKeyTyped
        Validaciones.validaEntero(evt, 7, ver.getText());
    }//GEN-LAST:event_verKeyTyped

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_RegresarActionPerformed
    {//GEN-HEADEREND:event_jButton_RegresarActionPerformed
        new VtnSubmenu().setVisible(true);
        VtnSubmenu.tsubmenu.setText("           de Alumnos");
        dispose();
    }//GEN-LAST:event_jButton_RegresarActionPerformed
///////////////
    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosed
    {//GEN-HEADEREND:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        ManipulacionArchivos.guardaA(this, d, "Datos.dat");
        ManipulacionArchivos.guarda(this, h, "Historial.dat");
    }//GEN-LAST:event_formWindowClosing

    private void aceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_aceptarKeyPressed
    {//GEN-HEADEREND:event_aceptarKeyPressed
        try
        {
            vne = Manipulacion.verificador(this, VtnPrincipal.d, 1, ver.getText());

            
            // Imprime datos antes de la eliminación
//            System.out.println("Datos antes de la eliminación:");
//            for (Datos dato : VtnPrincipal.d)
//            {
//                System.out.println(dato); // con el tostring
//            }
            
            
            VtnPrincipal.d = Manipulacion.bajaArr(VtnPrincipal.d, 1, vne, this);
//            VtnPrincipal.h[vne] = Manipulacion.bajaCols(VtnPrincipal.h[vne], vne, this);
//            VtnPrincipal.h = Manipulacion.bajaMatFil(h, 1, vne, this);
//            VtnPrincipal.h = Manipulacion.bajas(VtnPrincipal.h, vne, this);

            
            
            // Imprime datos después de la eliminación
//            System.out.println("Datos después de la eliminación:");
//            for (Datos dato : VtnPrincipal.d)
//            {
//                System.out.println(dato);
//            }
            
            
            
            ManipulacionArchivos.guardaA(this, VtnPrincipal.d, "Datos.dat");
            ManipulacionArchivos.guarda(this, VtnPrincipal.h, "Historial.dat");

            Mensajes.exito(this, "Baja realizada con éxito");
            CtrlInterfaz.limpia(ver);
            CtrlInterfaz.habilita(false, ver, aceptar);
            CtrlInterfaz.cambia(ver);

        } catch (Exception e)
        {
            Mensajes.error(this, "Error: " + e.toString());
        }
    }//GEN-LAST:event_aceptarKeyPressed

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
            java.util.logging.Logger.getLogger(VtnBA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnBA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnBA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnBA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnBA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_BAlum;
    private javax.swing.JTextField ver;
    // End of variables declaration//GEN-END:variables
}
