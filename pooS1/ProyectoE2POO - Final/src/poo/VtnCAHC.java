package poo;

import cjb.ci.Mensajes;
import java.awt.Toolkit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pcpru
 */
public class VtnCAHC extends javax.swing.JFrame
{

    

    /**
     * Creates new form VTNC
     */
    public VtnCAHC()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Imagen1ORGlogo.png")));
        initComponents();
        this.setLocationRelativeTo(null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Alum = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_Regresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Datos de Alumnos");
        setBackground(new java.awt.Color(255, 255, 204));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 0));

        jTable_Alum.setAutoCreateRowSorter(true);
        jTable_Alum.setBackground(new java.awt.Color(253, 253, 242));
        jTable_Alum.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable_Alum.setFont(new java.awt.Font("Zilla Slab", 0, 12)); // NOI18N
        jTable_Alum.setForeground(new java.awt.Color(102, 51, 0));
        jTable_Alum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null}
            },
            new String []
            {
                "CVE", "Fecha", "Padecimiento Actual", "Antecedentes Personales", "Medicamento", "Plan de Tratamiento"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTable_Alum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_Alum.setGridColor(new java.awt.Color(102, 102, 0));
        jTable_Alum.setSelectionBackground(new java.awt.Color(255, 255, 0));
        jTable_Alum.setSelectionForeground(new java.awt.Color(0, 102, 0));
        jTable_Alum.setShowGrid(false);
        jTable_Alum.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable_Alum);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 780, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("de Alumnos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jButton_Regresar.setBackground(new java.awt.Color(153, 153, 0));
        jButton_Regresar.setFont(new java.awt.Font("Zilla Slab Medium", 1, 14)); // NOI18N
        jButton_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Regresar.setText("<");
        jButton_Regresar.setToolTipText("Regresar Regresar a Submenú de Alumnos");
        jButton_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 30));

        jLabel5.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Consulta de Historial Clinico");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jLabel20.setBackground(new java.awt.Color(0, 102, 51));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde.png"))); // NOI18N
        jLabel20.setText("jLabel5");
        jLabel20.setMaximumSize(new java.awt.Dimension(540, 100));
        jLabel20.setMinimumSize(new java.awt.Dimension(420, 80));
        jLabel20.setPreferredSize(new java.awt.Dimension(540, 100));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 780, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        if (VtnPrincipal.d != null)
        {
            Manipulacion.consultasTabA(VtnPrincipal.d, VtnPrincipal.h, jTable_Alum,this);
            
        } else
        {
            Mensajes.error(this, "No existen datos registrados, ingresa primero datos");
            this.setVisible(false);
            new VtnSubmenu().setVisible(true);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_RegresarActionPerformed
    {//GEN-HEADEREND:event_jButton_RegresarActionPerformed
        new VtnSubmenu().setVisible(true);
        VtnSubmenu.tsubmenu.setText("           Alumnos");
        dispose();
    }//GEN-LAST:event_jButton_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VtnCAHC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnCAHC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnCAHC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnCAHC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new VtnCAHC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Alum;
    // End of variables declaration//GEN-END:variables
}
