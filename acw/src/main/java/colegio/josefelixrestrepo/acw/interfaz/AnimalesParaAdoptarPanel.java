/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.josefelixrestrepo.acw.interfaz;

import colegio.josefelixrestrepo.acw.basededatos.Animal;
import colegio.josefelixrestrepo.acw.basededatos.Usuario;
import colegio.josefelixrestrepo.acw.logica.AnimalLogica;
import colegio.josefelixrestrepo.acw.logica.UsuarioLogica;

import javax.swing.*;
import java.util.List;

/**
 *
 * @author nancho313
 */
public class AnimalesParaAdoptarPanel extends javax.swing.JPanel {

    private Usuario usuario;
    private AnimalLogica animalLogica;
    private UsuarioLogica usuarioLogica;

    /**
     * Creates new form AnimalesParaAdoptarPanel
     */

    public AnimalesParaAdoptarPanel(Usuario usuario){

        this.usuario = usuario;
        animalLogica = new AnimalLogica();
        usuarioLogica = new UsuarioLogica();
        initComponents();
        listaAnimales.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        actualizarListadoAnimales();
        setSize(534, 311);
    }

    public AnimalesParaAdoptarPanel() {
        initComponents();
    }

    public void actualizarListadoAnimales(){

        List<Animal> animales = animalLogica.obtenerTodosLosAnimalesSinAdoptar();
        Animal[] animalData = null;
        if(animales != null){

            animalData = new Animal[animales.size()];
            this.listaAnimales.setListData(animales.toArray(animalData));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAnimales = new javax.swing.JList<>();
        botonAdoptar = new javax.swing.JButton();
        resultadoLabel = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setText("Animales para Adoptar");
        add(jLabel1);
        jLabel1.setBounds(180, 20, 200, 15);

        jScrollPane1.setViewportView(listaAnimales);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 490, 140);

        botonAdoptar.setText("Adoptar Animal");
        botonAdoptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdoptarActionPerformed(evt);
            }
        });
        add(botonAdoptar);
        botonAdoptar.setBounds(20, 240, 210, 25);
        add(resultadoLabel);
        resultadoLabel.setBounds(20, 210, 490, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAdoptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdoptarActionPerformed

        Animal animalSeleccionado = listaAnimales.getSelectedValue();

        if(animalSeleccionado != null){

            int resultadoConfirmar = JOptionPane.showConfirmDialog(this, "¿Desea adoptar el animal seleccionado?");

            if(resultadoConfirmar == JOptionPane.OK_OPTION){

                String resultado = usuarioLogica.adoptarAnimal(usuario.getCedula(), animalSeleccionado.getCodigoAnimal());

                if(resultado.equals("OK")){

                    resultadoLabel.setText("Se ha adoptado el animal correctamente.");
                    actualizarListadoAnimales();
                }
                else
                {
                    resultadoLabel.setText(resultado);
                }
            }
        }
    }//GEN-LAST:event_botonAdoptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdoptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Animal> listaAnimales;
    private javax.swing.JLabel resultadoLabel;
    // End of variables declaration//GEN-END:variables
}