package org.ventanas;

import Data.Variables;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import static Data.FuncionesEnlace.*;

public class GestionarEmpleados extends javax.swing.JFrame {
    public GestionarEmpleados(PerfilGerente parent ) {
        setUndecorated(true);
        this.ventanaGerente=parent;
        initComponents();
        setLocationRelativeTo(parent);
    }

    private Object[][] devolverarray(ArrayList<ArrayList<String>> hoteles) {
        Object[][] arrayBidimensional = new Object[hoteles.size()][]; // Incrementa en 1 para incluir el nuevo dato

        for (int i = 0; i < hoteles.size(); i++) { // Itera solo hasta hoteles.size()
            ArrayList<String> lista = hoteles.get(i);
            arrayBidimensional[i] = lista.toArray(new Object[0]); // Incrementa el Ã­ndice en 1 para dejar espacio para el nuevo dato
        }
        return arrayBidimensional;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        EliminarButton = new javax.swing.JButton();
        AnnadirButton = new javax.swing.JButton();
        IdText = new javax.swing.JTextField();
        IDlabel = new javax.swing.JLabel();
        volverButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        errorID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        EliminarButton.setText("Eliminar");
        EliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtonActionPerformed(evt);
            }
        });

        AnnadirButton.setText("Añadir");
        AnnadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnadirButtonActionPerformed(evt);
            }
        });


        IDlabel.setText("ID");

        volverButton.setText("<");

        closeButton.setText("X");

        TablaEmpleados = crearTabla();
        jScrollPane1 = annadirScroll(TablaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(volverButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closeButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(errorID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(IDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(EliminarButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AnnadirButton)
                                                .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(volverButton)
                                        .addComponent(closeButton))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(errorID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(IDlabel)
                                                        .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(57, 57, 57)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(EliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AnnadirButton)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(41, Short.MAX_VALUE))
        );

        AnnadirButton.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>

    private void EliminarButtonActionPerformed(ActionEvent evt) {
        error.setForeground(new Color(255, 0, 0));
        if(IdText.getText().isEmpty()){
            error.setVisible(false);
            error.setText("Rellena el campo del id para continuar");
            error.setVisible(true);
            return;
        }
        if(!HayNumerosEnStringEmpl(IdText.getText())){
            error.setVisible(false);
            error.setText("El id debe de ser solo numerico");
            error.setVisible(true);
            return;
        }
        int id = Integer.parseInt(IdText.getText());
        error.setVisible(false);
        error.setForeground(new Color(0, 0, 0));
        error.setText("Empleado eliminado con exito");
        error.setVisible(true);
        eliminarEmpleadoGerente(id,conseguirLugarTrabajoEmpleado(conseguirIDExtra(Variables.usuario,Variables.telefono,Variables.password)));
        UpdateVentana();
    }
    private void AnnadirButtonActionPerformed(java.awt.event.ActionEvent evt){
        RegistrarEmpleado registerVentana = new RegistrarEmpleado(this);
        registerVentana.setVisible(true);
        this.setVisible(false);
    }
    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        salirPrograma();
    }
    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        ventanaGerente.setVisible(true);
    }
    private JTable crearTabla(){
        javax.swing.JTable TablaReservas=new JTable();
        TablaReservas.setModel(new javax.swing.table.DefaultTableModel(

                devolverarray(mostrarEmpleadosDeHotelEnArraylistGerente(conseguirLugarTrabajoEmpleado(conseguirIDExtra(Variables.usuario,Variables.telefono,Variables.password))))
                ,
                new String[]{
                        "IDusuario", "LugarTrabajo"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        return TablaReservas;
    }

    public void UpdateVentana(){
        DefaultTableModel modelo = (DefaultTableModel) TablaEmpleados.getModel();
        modelo.setDataVector(devolverarray(mostrarEmpleadosDeHotelEnArraylistGerente(conseguirLugarTrabajoEmpleado(conseguirIDExtra(Variables.usuario,Variables.telefono,Variables.password)))), new Object[]{"IDusuario", "LugarTrabajo"});
        TablaEmpleados = crearTabla();
        jScrollPane1 = annadirScroll(TablaEmpleados);
    }

    private JScrollPane annadirScroll(JTable tabla){
        javax.swing.JScrollPane jScrollPane=new JScrollPane();
        jScrollPane.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
        }
        return jScrollPane;
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify
    private javax.swing.JButton EliminarButton;
    private javax.swing.JLabel IDlabel;
    private javax.swing.JTextField IdText;
    private javax.swing.JButton AnnadirButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel error;
    private javax.swing.JLabel errorID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JButton volverButton;
    private javax.swing.JTable TablaEmpleados;

    private static PerfilGerente ventanaGerente;
    // End of variables declaration
}
