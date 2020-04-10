/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgsi;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Efe
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Reporte reporte = new Reporte();
        reporte.setVisible(true);
        //this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupos = new javax.swing.ButtonGroup();
        Inferior = new javax.swing.JPanel();
        d6 = new javax.swing.JLabel();
        d24 = new javax.swing.JLabel();
        Principal = new javax.swing.JPanel();
        g1 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        g4 = new javax.swing.JRadioButton();
        g5 = new javax.swing.JRadioButton();
        g6 = new javax.swing.JRadioButton();
        g7 = new javax.swing.JRadioButton();
        g8 = new javax.swing.JRadioButton();
        g9 = new javax.swing.JRadioButton();
        g10 = new javax.swing.JRadioButton();
        aquí1 = new javax.swing.JButton();
        aquí2 = new javax.swing.JButton();
        aquí3 = new javax.swing.JButton();
        aquí4 = new javax.swing.JButton();
        aquí5 = new javax.swing.JButton();
        aquí6 = new javax.swing.JButton();
        aquí7 = new javax.swing.JButton();
        aquí8 = new javax.swing.JButton();
        aquí9 = new javax.swing.JButton();
        aquí10 = new javax.swing.JButton();
        Superio = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        verificarGrupos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        verificarGrupos1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusCycleRoot(false);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        Inferior.setBackground(new java.awt.Color(173, 15, 55));

        d6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        d6.setForeground(new java.awt.Color(255, 255, 255));
        d6.setText("Desarrollado por: Luis Fernando Díaz Muñoz - Juan Sebastián Erazo Chamorro");

        d24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        d24.setForeground(new java.awt.Color(255, 255, 255));
        d24.setText("Ingeniería de sistemas");

        javax.swing.GroupLayout InferiorLayout = new javax.swing.GroupLayout(Inferior);
        Inferior.setLayout(InferiorLayout);
        InferiorLayout.setHorizontalGroup(
            InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InferiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InferiorLayout.createSequentialGroup()
                        .addComponent(d24)
                        .addGap(162, 162, 162)))
                .addGap(218, 218, 218))
        );
        InferiorLayout.setVerticalGroup(
            InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(d24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Grupos.add(g1);
        g1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g1.setText("Activos esenciales");

        Grupos.add(g2);
        g2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g2.setText("Arquitectura del sistema");

        Grupos.add(g3);
        g3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g3.setText("Datos / Información");

        Grupos.add(g4);
        g4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g4.setText("Servicios");

        Grupos.add(g5);
        g5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g5.setText("Aplicaciones / Software");

        Grupos.add(g6);
        g6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g6.setText("Equipos informáticos (hardware)");

        Grupos.add(g7);
        g7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g7.setText("Redes de comunicaciones");

        Grupos.add(g8);
        g8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g8.setText("Soportes de información");

        Grupos.add(g9);
        g9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g9.setText("Equipamiento auxiliar");
        g9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g9ActionPerformed(evt);
            }
        });

        Grupos.add(g10);
        g10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        g10.setText("Personal");

        aquí1.setText("Información");
        aquí1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí1MouseClicked(evt);
            }
        });
        aquí1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquí1ActionPerformed(evt);
            }
        });

        aquí2.setText("Información");
        aquí2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí2MouseClicked(evt);
            }
        });

        aquí3.setText("Información");
        aquí3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí3MouseClicked(evt);
            }
        });

        aquí4.setText("Información");
        aquí4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí4MouseClicked(evt);
            }
        });

        aquí5.setText("Información");
        aquí5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí5MouseClicked(evt);
            }
        });

        aquí6.setText("Información");
        aquí6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí6MouseClicked(evt);
            }
        });

        aquí7.setText("Información");
        aquí7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí7MouseClicked(evt);
            }
        });

        aquí8.setText("Informacion");
        aquí8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí8MouseClicked(evt);
            }
        });

        aquí9.setText("Información");
        aquí9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí9MouseClicked(evt);
            }
        });

        aquí10.setText("Información");
        aquí10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aquí10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(g10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aquí10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(g9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aquí9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(g8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aquí8))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(g7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aquí7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addComponent(g6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aquí6))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(g5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aquí5))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(g4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aquí4))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(g3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aquí3))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g1)
                            .addComponent(g2))
                        .addGap(95, 95, 95)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aquí2)
                            .addComponent(aquí1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g1)
                    .addComponent(aquí1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g2)
                    .addComponent(aquí2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g3)
                    .addComponent(aquí3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g4)
                    .addComponent(aquí4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g5)
                    .addComponent(aquí5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g6)
                    .addComponent(aquí6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g7)
                    .addComponent(aquí7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g8)
                    .addComponent(aquí8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g9)
                    .addComponent(aquí9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g10)
                    .addComponent(aquí10))
                .addContainerGap())
        );

        Superio.setBackground(new java.awt.Color(53, 96, 183));

        a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Evaluación de activos en su organización");

        b.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setText("A continuación se presentan los módulos pertenecientes a la evaluación de riesgos y/o amenazas existentes sobre los activos de su organización.");

        d.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setText("Recuerde por favor contar con tiempo suficiente para realizar la evaluación puesto que si el sistema se cierra usted no podría continuar, perdería ");

        b1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Nota: Por favor no olvide seleccionar cada grupo");

        d1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        d1.setForeground(new java.awt.Color(255, 255, 255));
        d1.setText("el progreso y tendría que comenzar nuevamente");

        javax.swing.GroupLayout SuperioLayout = new javax.swing.GroupLayout(Superio);
        Superio.setLayout(SuperioLayout);
        SuperioLayout.setHorizontalGroup(
            SuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a)
                    .addComponent(b)
                    .addComponent(d)
                    .addComponent(b1)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        SuperioLayout.setVerticalGroup(
            SuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b)
                .addGap(2, 2, 2)
                .addComponent(d)
                .addGap(1, 1, 1)
                .addComponent(d1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        verificarGrupos.setText("Siguiente");
        verificarGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarGruposActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        verificarGrupos1.setText("Generar Reporte");
        verificarGrupos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarGrupos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Superio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(verificarGrupos)
                        .addGap(18, 18, 18)
                        .addComponent(verificarGrupos1)
                        .addGap(27, 27, 27)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Superio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verificarGrupos)
                    .addComponent(jButton2)
                    .addComponent(verificarGrupos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void validarGrupos() {
        if (g1.isSelected()) {
            Activos activos = new Activos();
            activos.setVisible(true);
            this.dispose();
            
        } else if (g2.isSelected()) {
            Arquitectura arquitectura = new Arquitectura();
            arquitectura.setVisible(true);
            this.dispose();
        } else if (g3.isSelected()) {
            Datos datos = new Datos();
            datos.setVisible(true);
            this.dispose();
        } else if (g3.isSelected()) {
            Datos datos = new Datos();
            datos.setVisible(true);
            this.dispose();
        } else if (g4.isSelected()) {
            Servicios servicios = new Servicios();
            servicios.setVisible(true);
            this.dispose();
        } else if (g5.isSelected()) {
            Software software = new Software();
            software.setVisible(true);
            this.dispose();
        } else if (g6.isSelected()) {
            Hardware hardware = new Hardware();
            hardware.setVisible(true);
            this.dispose();
        } else if (g7.isSelected()) {
            Redes redes = new Redes();
            redes.setVisible(true);
            this.dispose();
        } else if (g8.isSelected()) {
            Soportes soportes = new Soportes();
            soportes.setVisible(true);
            this.dispose();
        } else if (g9.isSelected()) {
            Equipamiento equipamiento = new Equipamiento();
            equipamiento.setVisible(true);
            this.dispose();
        } else if (g10.isSelected()) {
            Personal personal = new Personal();
            personal.setVisible(true);
            this.dispose();
        }

    }

    private void verificarGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarGruposActionPerformed

        if (g1.isSelected() || g2.isSelected() || g3.isSelected() || g4.isSelected() || g5.isSelected() || g6.isSelected()
                || g7.isSelected() || g8.isSelected() || g9.isSelected() || g10.isSelected()) {
            validarGrupos();                       
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor elija un grupo para evaluar");
        }

    }//GEN-LAST:event_verificarGruposActionPerformed

    private void g9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g9ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro qué desea salir?", "¡Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (JOptionPane.YES_OPTION == resp) {
            JOptionPane.showMessageDialog(null, "Hasta pronto...", "Sistema de evaluación", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor continue con la evaluación", "Sistema de evaluación SGSI", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void verificarGrupos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarGrupos1ActionPerformed
        // TODO add your handling code here:

        Reporte reporte = new Reporte();
        reporte.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_verificarGrupos1ActionPerformed

    private void aquí1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí1MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(rootPane, "" + sl + "En un sistema de información hay dos cosas esenciales:" + sl + ""
                + "La información que se maneja y los servicios que prestan." + sl + ""
                + "" + sl + "Estos activos esenciales marcan los requisitos de seguridad para todos los demás componentes del sistema. " + sl
                + "Dentro de la información que se maneja, puede ser interesante considerar algunas características formales " + sl
                + "tales como si son de carácter personal, con requisitos legales, o si están sometidos a alguna clasificación " + sl
                + "de seguridad, con requisitos normativos", "[essential] activos esenciales", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aquí1MouseClicked

    private void aquí1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquí1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aquí1ActionPerformed

    private void aquí2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí2MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(null, "Se trata de elementos que permiten estructurar el sistema," + sl + "definiendo su arquitectura interna y sus relaciones con el exterior.", "[arch] Arquitectura del sistema", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_aquí2MouseClicked

    private void aquí3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí3MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(null, "Los datos son el corazón que permite a una organización prestar sus servicios. La información es" + sl + ""
                + "un activo abstracto que será almacenado en equipos o soportes de información (normalmente " + sl
                + "agrupado como ficheros o bases de datos) o será transferido de un lugar a otro por los medios" + sl + "de"
                + " transmisión de datos.", "[D] Datos/Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aquí3MouseClicked

    private void aquí4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí4MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(rootPane, "Función que satisface una necesidad de los usuarios (del servicio). Esta sección contempla servicios prestados por el sistema.", "[S] Servicios", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aquí4MouseClicked

    private void aquí5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí5MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(rootPane, "" + sl + "Con múltiples denominaciones (programas, aplicativos, desarrollos, etc.)este epígrafe se refiere a " + sl + "tareas que han sido automatizadas para su desempeño por un equipo informático."
                + " Las aplicaciones" + sl + "gestionan, analizan y transforman los datos permitiendo la explotación de la información para la" + sl + "prestación de los servicios" + sl + "" + sl
                + "No preocupa en este apartado el denominado “código fuente” o programas que serán datos de " + sl + ""
                + "interés comercial, a valorar y proteger como tales. Dicho código aparecería como datos.", "[SW] Aplicaciones (Software)", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aquí5MouseClicked

    private void aquí6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí6MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(rootPane, "" + sl + "Dícese de los medios materiales, físicos, destinados a soportar directa o indirectamente los servicios que" + sl + "presta la organización, siendo pues depositarios temporales o permanentes de los datos soporte de" + sl + " ejecución de las aplicaciones informáticas o responsables del procesado o la transmisión de datos.", "[HW] Equipos informáticos (hardware)", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_aquí6MouseClicked

    private void aquí7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí7MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(rootPane, "" + sl + "Incluyendo tanto instalaciones dedicadas como servicios de comunicaciones contratados a terceros" + sl + ""
                + "pero siempre centrándose en que son medios de transporte que llevan datos de un sitio a otro.", "[COM] Redes de comunicaciones", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aquí7MouseClicked

    private void aquí8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí8MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(rootPane, "En este epígrafe se consideran dispositivos físicos que permiten almacenar" + sl
                + "información de forma permanente o, al menos, durante largos periodos de" + sl + " tiempo.", "[Media] Soportes de información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aquí8MouseClicked

    private void aquí9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí9MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(rootPane, "En este epígrafe se consideran otros equipos que sirven de soporte a los" + sl
                + "sistemas de información, sin estar directamente relacionados con datos.", "[AUX] Equipamiento auxiliar", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aquí9MouseClicked

    private void aquí10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquí10MouseClicked
        // TODO add your handling code here:
        String sl = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(rootPane, "En este epígrafe aparecen las personas relacionadas con los sistemas de información.", "[P] Personal", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aquí10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupos;
    private javax.swing.JPanel Inferior;
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel Superio;
    private javax.swing.JLabel a;
    private javax.swing.JButton aquí1;
    private javax.swing.JButton aquí10;
    private javax.swing.JButton aquí2;
    private javax.swing.JButton aquí3;
    private javax.swing.JButton aquí4;
    private javax.swing.JButton aquí5;
    private javax.swing.JButton aquí6;
    private javax.swing.JButton aquí7;
    private javax.swing.JButton aquí8;
    private javax.swing.JButton aquí9;
    private javax.swing.JLabel b;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel d;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d24;
    private javax.swing.JLabel d6;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g10;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JRadioButton g4;
    private javax.swing.JRadioButton g5;
    private javax.swing.JRadioButton g6;
    private javax.swing.JRadioButton g7;
    private javax.swing.JRadioButton g8;
    private javax.swing.JRadioButton g9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton verificarGrupos;
    private javax.swing.JButton verificarGrupos1;
    // End of variables declaration//GEN-END:variables
}
