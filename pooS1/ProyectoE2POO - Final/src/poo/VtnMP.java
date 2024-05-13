/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import java.awt.Toolkit;

/**
 *
 * @author chemy
 */
public class VtnMP extends javax.swing.JFrame
{

    private boolean desnutricion;
    private boolean sobrepeso;
    private boolean alergias;
    private boolean obesidad;
    private boolean diabetes;
    private boolean carrera;
    private char sexo;
    private int vne;
    private int validaIndex;

    /**
     * Creates new form VTNM
     */
    public VtnMP()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Imagen1ORGlogo.png")));
        initComponents();
        this.setLocationRelativeTo(null);
        VtnPrincipal.disablepaste(ver);
        VtnPrincipal.disablepaste(otras);

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

        jLabel3 = new javax.swing.JLabel();
        ver = new javax.swing.JTextField();
        nomtf = new javax.swing.JTextField();
        segundoAPtf = new javax.swing.JTextField();
        primerAPtf = new javax.swing.JTextField();
        sexocb = new javax.swing.JComboBox();
        otras = new javax.swing.JTextField();
        desnutricionbot = new javax.swing.JCheckBox();
        sobrepesobot = new javax.swing.JCheckBox();
        obesidadbot = new javax.swing.JCheckBox();
        diabetesbot = new javax.swing.JCheckBox();
        alergiabot = new javax.swing.JCheckBox();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jButton_Regresar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        otrasboton = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        estatuscb = new javax.swing.JComboBox();
        fondo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 125, -1));

        nomtf.setEditable(false);
        nomtf.setDisabledTextColor(new java.awt.Color(102, 51, 0));
        nomtf.setEnabled(false);
        nomtf.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nomtfActionPerformed(evt);
            }
        });
        getContentPane().add(nomtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, -1));

        segundoAPtf.setEditable(false);
        segundoAPtf.setDisabledTextColor(new java.awt.Color(102, 51, 0));
        segundoAPtf.setEnabled(false);
        getContentPane().add(segundoAPtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 120, -1));

        primerAPtf.setEditable(false);
        primerAPtf.setDisabledTextColor(new java.awt.Color(102, 51, 0));
        primerAPtf.setEnabled(false);
        primerAPtf.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                primerAPtfActionPerformed(evt);
            }
        });
        getContentPane().add(primerAPtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 120, -1));

        sexocb.setBackground(new java.awt.Color(102, 102, 0));
        sexocb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1) Masculino", "2) Femenino" }));
        sexocb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sexocb.setEnabled(false);
        sexocb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sexocbActionPerformed(evt);
            }
        });
        sexocb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                sexocbKeyPressed(evt);
            }
        });
        getContentPane().add(sexocb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        otras.setForeground(new java.awt.Color(102, 51, 0));
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
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                otrasKeyTyped(evt);
            }
        });
        getContentPane().add(otras, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 70, -1));

        desnutricionbot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desnutricionbot.setEnabled(false);
        desnutricionbot.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                desnutricionbotActionPerformed(evt);
            }
        });
        desnutricionbot.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                desnutricionbotKeyPressed(evt);
            }
        });
        getContentPane().add(desnutricionbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        sobrepesobot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sobrepesobot.setEnabled(false);
        sobrepesobot.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sobrepesobotActionPerformed(evt);
            }
        });
        getContentPane().add(sobrepesobot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 20));

        obesidadbot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        obesidadbot.setEnabled(false);
        obesidadbot.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                obesidadbotActionPerformed(evt);
            }
        });
        getContentPane().add(obesidadbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        diabetesbot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diabetesbot.setEnabled(false);
        diabetesbot.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                diabetesbotActionPerformed(evt);
            }
        });
        getContentPane().add(diabetesbot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        alergiabot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alergiabot.setEnabled(false);
        alergiabot.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                alergiabotActionPerformed(evt);
            }
        });
        getContentPane().add(alergiabot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        aceptar.setBackground(new java.awt.Color(0, 102, 0));
        aceptar.setFont(new java.awt.Font("Zilla Slab Medium", 1, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("Aceptar");
        aceptar.setToolTipText("Guardar Cambios");
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, 90, 30));

        cancelar.setBackground(new java.awt.Color(153, 153, 0));
        cancelar.setFont(new java.awt.Font("Zilla Slab Medium", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setToolTipText("Cancelar Cambios");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 90, 30));

        jButton_Regresar.setBackground(new java.awt.Color(153, 153, 0));
        jButton_Regresar.setFont(new java.awt.Font("Zilla Slab Medium", 1, 14)); // NOI18N
        jButton_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Regresar.setText("<");
        jButton_Regresar.setToolTipText("Regresar a Regresar a Submenú de Personal");
        jButton_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        jLabel17.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 51, 0));
        jLabel17.setText("Ingresa la CVE:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, 20));

        jLabel21.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 51, 0));
        jLabel21.setText("Alergias");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, 20));

        jLabel18.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 51, 0));
        jLabel18.setText("Nombre(s)");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 70, 20));

        jLabel19.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 51, 0));
        jLabel19.setText("Primer Apellido");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, 20));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 0));
        jLabel4.setText("Segundo Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel20.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 51, 0));
        jLabel20.setText("Sobrepeso");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, 20));

        jLabel22.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 51, 0));
        jLabel22.setText("Desnutrición");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel23.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 51, 0));
        jLabel23.setText("Obesidad");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, 20));

        jLabel24.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 51, 0));
        jLabel24.setText("Diabetes");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, 40));

        jLabel25.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 51, 0));
        jLabel25.setText("Otras");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, -1, 20));

        jLabel26.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 51, 0));
        jLabel26.setText("Sexo");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clinic.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Modificación de Datos Clínicos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("del Personal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        otrasboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        otrasboton.setEnabled(false);
        otrasboton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                otrasbotonActionPerformed(evt);
            }
        });
        getContentPane().add(otrasboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Zilla Slab SemiBold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Modificación de Datos ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel27.setBackground(new java.awt.Color(0, 102, 51));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde.png"))); // NOI18N
        jLabel27.setText("jLabel5");
        jLabel27.setMaximumSize(new java.awt.Dimension(540, 100));
        jLabel27.setMinimumSize(new java.awt.Dimension(420, 80));
        jLabel27.setPreferredSize(new java.awt.Dimension(540, 100));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 590, 110));

        jLabel30.setBackground(new java.awt.Color(0, 102, 51));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verde.png"))); // NOI18N
        jLabel30.setText("jLabel5");
        jLabel30.setMaximumSize(new java.awt.Dimension(540, 100));
        jLabel30.setMinimumSize(new java.awt.Dimension(420, 80));
        jLabel30.setPreferredSize(new java.awt.Dimension(540, 100));
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 340, 650, 40));

        jLabel31.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 51, 0));
        jLabel31.setText("Estatus");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        estatuscb.setBackground(new java.awt.Color(102, 102, 0));
        estatuscb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1) Base", "2) Temporal" }));
        estatuscb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estatuscb.setEnabled(false);
        estatuscb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                estatuscbActionPerformed(evt);
            }
        });
        estatuscb.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                estatuscbKeyPressed(evt);
            }
        });
        getContentPane().add(estatuscb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.jpg"))); // NOI18N
        fondo.setToolTipText("Regresar a Regresar a Submenú de Personal");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomtfActionPerformed

    }//GEN-LAST:event_nomtfActionPerformed

    private void primerAPtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerAPtfActionPerformed


    }//GEN-LAST:event_primerAPtfActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed

        validaIndex = Manipulacion.verificador(this, VtnPrincipal.d, 2, ver.getText());
//        System.out.println(validaIndex);
        if (validaIndex == -1)
        {
            Mensajes.error(this, "CVE incorrecto, Ingresa un CVE valido");
            CtrlInterfaz.limpia(ver, nomtf);
            CtrlInterfaz.habilita(false, ver);
            CtrlInterfaz.cambia(ver);

        } else
        {
            nomtf.setText(VtnPrincipal.d[validaIndex].getNom());
            primerAPtf.setText(VtnPrincipal.d[validaIndex].getPrimerAp());
            segundoAPtf.setText(VtnPrincipal.d[validaIndex].getSegundoAp());
            char sexv = VtnPrincipal.d[validaIndex-1].getSexo();
            if (sexv == 'M')
            {
                sexocb.setSelectedIndex(0);
            } else
            {
                sexocb.setSelectedIndex(1);
            }
            char estv = ((Personal) VtnPrincipal.d[validaIndex]).getEstatus();
            if (estv == 'B')
            {
                sexocb.setSelectedIndex(0);
            } else
            {
                sexocb.setSelectedIndex(1);
            }
        }

    }//GEN-LAST:event_verActionPerformed

    private void verKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verKeyPressed

        Validaciones.enterCadenaNoVacia(this, evt, ver, sexocb);
    }//GEN-LAST:event_verKeyPressed

    private void verKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verKeyTyped
        Validaciones.validaEntero(evt, 7, ver.getText());
    }//GEN-LAST:event_verKeyTyped

    private void sexocbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexocbActionPerformed
        if (sexocb.getSelectedIndex() == 0)
        {
            char sexo = 'M';
            CtrlInterfaz.cambia(sexo);
        } else
        {
            char sexo = 'F';
            CtrlInterfaz.cambia(sexo);
        }
        CtrlInterfaz.habilita(true, estatuscb);
    }//GEN-LAST:event_sexocbActionPerformed

    private void sexocbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sexocbKeyPressed
        Validaciones.enter(this, evt, estatuscb);
    }//GEN-LAST:event_sexocbKeyPressed

    private void otrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otrasActionPerformed

    private void otrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otrasKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, otras, aceptar);
    }//GEN-LAST:event_otrasKeyPressed

    private void otrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otrasKeyTyped
        Validaciones.validaAlfabeticos(evt, 20, otras.getText());
    }//GEN-LAST:event_otrasKeyTyped

    private void desnutricionbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desnutricionbotActionPerformed
        if (desnutricionbot.isSelected())
        {
            desnutricion = true;
            CtrlInterfaz.habilita(false, sobrepesobot, obesidadbot);
        }
    }//GEN-LAST:event_desnutricionbotActionPerformed

    private void desnutricionbotKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desnutricionbotKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_desnutricionbotKeyPressed

    private void sobrepesobotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrepesobotActionPerformed
        if (sobrepesobot.isSelected())
        {
            sobrepeso = true;
            CtrlInterfaz.habilita(false, desnutricionbot, obesidadbot);
        }
    }//GEN-LAST:event_sobrepesobotActionPerformed

    private void obesidadbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obesidadbotActionPerformed
        if (obesidadbot.isSelected())
        {
            obesidad = true;
            CtrlInterfaz.habilita(false, sobrepesobot, desnutricionbot);
        }
    }//GEN-LAST:event_obesidadbotActionPerformed

    private void diabetesbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diabetesbotActionPerformed
        if (diabetesbot.isSelected())
        {
            diabetes = true;
        }
    }//GEN-LAST:event_diabetesbotActionPerformed

    private void alergiabotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergiabotActionPerformed
        if (alergiabot.isSelected())
        {
            alergias = true;
        }
    }//GEN-LAST:event_alergiabotActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        try
        {
            /*int validasexo= Manipulacion.verificador(this, VtnP.d, 1, ver );*/
            VtnPrincipal.d[validaIndex].setSexo(sexocb.getSelectedIndex() == 0 ? 'M' : 'F');
            VtnPrincipal.d[validaIndex].setObesidad(obesidadbot.isSelected());
            VtnPrincipal.d[validaIndex].setAlergias(alergiabot.isSelected());
            VtnPrincipal.d[validaIndex].setDesnutricion(desnutricionbot.isSelected());
            VtnPrincipal.d[validaIndex].setDiabetes(diabetesbot.isSelected());
            VtnPrincipal.d[validaIndex].setOtras(otras.getText());
            VtnPrincipal.d[validaIndex].setSobrepeso(sobrepesobot.isSelected());
            ((Personal) VtnPrincipal.d[validaIndex]).setEstatus(estatuscb.getSelectedIndex() == 0 ? 'B' : 'T');
            ManipulacionArchivos.guardaA(this, VtnPrincipal.d, "Datos.dat");
            ManipulacionArchivos.guarda(this, VtnPrincipal.h, "Historial.dat");
            Mensajes.exito(this, "Datos guardados con éxito");
            CtrlInterfaz.limpia(ver, nomtf, primerAPtf, segundoAPtf, sexocb, estatuscb, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
            sexocb.setSelectedIndex(0);
            estatuscb.setSelectedIndex(0);
            CtrlInterfaz.habilita(false, ver, nomtf, primerAPtf, segundoAPtf, sexocb, estatuscb, otras, desnutricionbot, sobrepesobot, alergiabot, obesidadbot, diabetesbot, otrasboton, aceptar);
            CtrlInterfaz.cambia(ver);
            otrasboton.setSelected(false);
            desnutricionbot.setSelected(false);
            sobrepesobot.setSelected(false);
            alergiabot.setSelected(false);
            obesidadbot.setSelected(false);
            diabetesbot.setSelected(false);

        } catch (Exception e)
        {
            Mensajes.error(this, "Error: " + e.toString());
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

        CtrlInterfaz.limpia(ver, nomtf, primerAPtf, segundoAPtf, sexocb, estatuscb, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
        sexocb.setSelectedIndex(0);
        estatuscb.setSelectedIndex(0);
        CtrlInterfaz.habilita(false, ver, nomtf, primerAPtf, segundoAPtf, sexocb, estatuscb, otras, desnutricionbot, sobrepesobot, alergiabot, obesidadbot, diabetesbot, otrasboton, aceptar);
        otrasboton.setSelected(false);
        desnutricionbot.setSelected(false);
        sobrepesobot.setSelected(false);
        alergiabot.setSelected(false);
        obesidadbot.setSelected(false);
        diabetesbot.setSelected(false);
        CtrlInterfaz.habilita(false, aceptar);
        CtrlInterfaz.cambia(ver);
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_RegresarActionPerformed
    {//GEN-HEADEREND:event_jButton_RegresarActionPerformed
        new VtnSubmenu().setVisible(true);
        VtnSubmenu.tsubmenu.setText("           Personal");
        dispose();
    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        CtrlInterfaz.cambia(ver);
    }//GEN-LAST:event_formWindowOpened

    private void otrasbotonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_otrasbotonActionPerformed
    {//GEN-HEADEREND:event_otrasbotonActionPerformed
        if (otrasboton.isSelected())
        {
            CtrlInterfaz.habilita(true, otras);
            CtrlInterfaz.cambia(otras);
        } else
        {
            CtrlInterfaz.habilita(false, otras);
            CtrlInterfaz.cambia(carrera);
        }
    }//GEN-LAST:event_otrasbotonActionPerformed

    private void estatuscbActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_estatuscbActionPerformed
    {//GEN-HEADEREND:event_estatuscbActionPerformed
        if (estatuscb.getSelectedIndex() == 0)
        {
            char estatus = 'B';
        } else
        {
            char estatus = 'T';
        }
        CtrlInterfaz.habilita(true, aceptar, desnutricionbot, sobrepesobot, alergiabot, obesidadbot, diabetesbot, otrasboton);
    }//GEN-LAST:event_estatuscbActionPerformed

    private void estatuscbKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_estatuscbKeyPressed
    {//GEN-HEADEREND:event_estatuscbKeyPressed
        Validaciones.enter(this, evt, aceptar);
        CtrlInterfaz.habilita(true, aceptar, desnutricionbot, sobrepesobot, alergiabot, obesidadbot, diabetesbot, otrasboton);
    }//GEN-LAST:event_estatuscbKeyPressed

    private void aceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_aceptarKeyPressed
    {//GEN-HEADEREND:event_aceptarKeyPressed
        try
        {
            /*int validasexo= Manipulacion.verificador(this, VtnP.d, 1, ver );*/
            VtnPrincipal.d[validaIndex].setSexo(sexocb.getSelectedIndex() == 0 ? 'M' : 'F');
            VtnPrincipal.d[validaIndex].setObesidad(obesidadbot.isSelected());
            VtnPrincipal.d[validaIndex].setAlergias(alergiabot.isSelected());
            VtnPrincipal.d[validaIndex].setDesnutricion(desnutricionbot.isSelected());
            VtnPrincipal.d[validaIndex].setDiabetes(diabetesbot.isSelected());
            VtnPrincipal.d[validaIndex].setOtras(otras.getText());
            VtnPrincipal.d[validaIndex].setSobrepeso(sobrepesobot.isSelected());
            ((Personal) VtnPrincipal.d[validaIndex]).setEstatus(estatuscb.getSelectedIndex() == 0 ? 'B' : 'T');
            ManipulacionArchivos.guardaA(this, VtnPrincipal.d, "Datos.dat");
            ManipulacionArchivos.guarda(this, VtnPrincipal.h, "Historial.dat");
            Mensajes.exito(this, "Datos guardados con éxito");
            CtrlInterfaz.limpia(ver, nomtf, primerAPtf, segundoAPtf, sexocb, estatuscb, desnutricion, sobrepeso, alergias, obesidad, diabetes, otras);
            sexocb.setSelectedIndex(0);
            estatuscb.setSelectedIndex(0);
            CtrlInterfaz.habilita(false, ver, nomtf, primerAPtf, segundoAPtf, sexocb, estatuscb, otras, desnutricionbot, sobrepesobot, alergiabot, obesidadbot, diabetesbot, otrasboton, aceptar);
            CtrlInterfaz.cambia(ver);
            otrasboton.setSelected(false);
            desnutricionbot.setSelected(false);
            sobrepesobot.setSelected(false);
            alergiabot.setSelected(false);
            obesidadbot.setSelected(false);
            diabetesbot.setSelected(false);

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
            java.util.logging.Logger.getLogger(VtnMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnMP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VtnMP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JCheckBox alergiabot;
    private javax.swing.JButton cancelar;
    private javax.swing.JCheckBox desnutricionbot;
    private javax.swing.JCheckBox diabetesbot;
    private javax.swing.JComboBox estatuscb;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nomtf;
    private javax.swing.JCheckBox obesidadbot;
    private javax.swing.JTextField otras;
    private javax.swing.JCheckBox otrasboton;
    private javax.swing.JTextField primerAPtf;
    private javax.swing.JTextField segundoAPtf;
    private javax.swing.JComboBox sexocb;
    private javax.swing.JCheckBox sobrepesobot;
    private javax.swing.JTextField ver;
    // End of variables declaration//GEN-END:variables
}