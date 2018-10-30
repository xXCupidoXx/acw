/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.josefelixrestrepo.acw.interfaz;

import colegio.josefelixrestrepo.acw.basededatos.Administrador;
import colegio.josefelixrestrepo.acw.basededatos.Usuario;

/**
 *
 * @author JULIAN RUEDA
 */
public class MenuFrame extends javax.swing.JFrame {

    private Administrador administrador;

    private Usuario usuario;

    private AnimalAdministradorPanel animalAdministradorPanel;

    private AnimalesParaAdoptarPanel animalesParaAdoptarPanel;

    private MisAnimalesPanel misAnimalesPanel;

    public MenuFrame(Administrador administrador){

        this.administrador = administrador;
        animalAdministradorPanel = new AnimalAdministradorPanel(administrador);
        animalAdministradorPanel.setVisible(Boolean.FALSE);
        this.getContentPane().add(animalAdministradorPanel);
        this.animalAdministradorPanel.setBounds(0, 0, animalAdministradorPanel.getWidth(), animalAdministradorPanel.getHeight());
        initComponents();
        initMenuFrame();
    }

    public MenuFrame(Usuario usuario){

        this.usuario = usuario;
        animalesParaAdoptarPanel = new AnimalesParaAdoptarPanel(usuario);
        animalesParaAdoptarPanel.setVisible(Boolean.FALSE);
        this.getContentPane().add(animalesParaAdoptarPanel);
        this.animalesParaAdoptarPanel.setBounds(0, 0, animalesParaAdoptarPanel.getWidth(), animalesParaAdoptarPanel.getHeight());
        misAnimalesPanel = new MisAnimalesPanel(usuario);
        misAnimalesPanel.setVisible(Boolean.FALSE);
        this.getContentPane().add(misAnimalesPanel);
        this.misAnimalesPanel.setBounds(0, 0, misAnimalesPanel.getWidth(), misAnimalesPanel.getHeight());
        initComponents();
        initMenuFrame();
    }

    private void initMenuFrame(){

        if(administrador != null){

            verMascotasMenuItem.setVisible(Boolean.FALSE);
            misMascotasMenuItem.setVisible(Boolean.FALSE);
        }
        else
        {
            administrarMascotasMenuItem.setVisible(Boolean.FALSE);
        }
        setSize(534, 547);
        this.setResizable(Boolean.FALSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * Creates new form MenuFrame
     */
    
        public MenuFrame() {
        initComponents();


        setSize(534, 547);
    }

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMascotas = new javax.swing.JMenu();
        administrarMascotasMenuItem = new javax.swing.JMenuItem();
        verMascotasMenuItem = new javax.swing.JMenuItem();
        misMascotasMenuItem = new javax.swing.JMenuItem();
        cerrarSesionMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        jMenu1.setText("jMenu1");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 50, 0, 2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/logo.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 0, 480, 480);

        menuMascotas.setText("Mascotas");

        administrarMascotasMenuItem.setText("Administrar Mascotas");
        administrarMascotasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administrarMascotasMenuItemActionPerformed(evt);
            }
        });
        menuMascotas.add(administrarMascotasMenuItem);

        verMascotasMenuItem.setText("Ver Mascotas");
        verMascotasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMascotasMenuItemActionPerformed(evt);
            }
        });
        menuMascotas.add(verMascotasMenuItem);

        misMascotasMenuItem.setText("Mis Mascotas");
        misMascotasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misMascotasMenuItemActionPerformed(evt);
            }
        });
        menuMascotas.add(misMascotasMenuItem);

        cerrarSesionMenuItem.setText("Cerrar Sesion");
        cerrarSesionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionMenuItemActionPerformed(evt);
            }
        });
        menuMascotas.add(cerrarSesionMenuItem);
        menuMascotas.add(jSeparator2);

        jMenuBar1.add(menuMascotas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void administrarMascotasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administrarMascotasMenuItemActionPerformed
        this.animalAdministradorPanel.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_administrarMascotasMenuItemActionPerformed

    private void verMascotasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMascotasMenuItemActionPerformed
        misAnimalesPanel.setVisible(Boolean.FALSE);
        animalesParaAdoptarPanel.actualizarListadoAnimales();
        animalesParaAdoptarPanel.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_verMascotasMenuItemActionPerformed

    private void misMascotasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misMascotasMenuItemActionPerformed
        animalesParaAdoptarPanel.setVisible(Boolean.FALSE);
        misAnimalesPanel.actualizarListadoAnimales();
        misAnimalesPanel.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_misMascotasMenuItemActionPerformed

    private void cerrarSesionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionMenuItemActionPerformed
        this.setVisible(Boolean.FALSE);
        VentanaInicialFrame ventanaInicialFrame = new VentanaInicialFrame();
        ventanaInicialFrame.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_cerrarSesionMenuItemActionPerformed

        public static void main(String... args){
        
        MenuFrame menuFrame = new MenuFrame();
        menuFrame.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem administrarMascotasMenuItem;
    private javax.swing.JMenuItem cerrarSesionMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuMascotas;
    private javax.swing.JMenuItem misMascotasMenuItem;
    private javax.swing.JMenuItem verMascotasMenuItem;
    // End of variables declaration//GEN-END:variables
}
