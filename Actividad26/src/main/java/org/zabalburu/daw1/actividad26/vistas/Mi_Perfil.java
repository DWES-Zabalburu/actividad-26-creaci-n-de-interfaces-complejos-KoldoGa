/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad26.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class Mi_Perfil extends JFrame {
    
    private Dimension miVentana = new Dimension(800, 450);
    
    private JLabel lblTitulo = new JLabel("Actualiza tu Perfil");
    private JLabel lblNombre = new JLabel("Nombre Completo");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreo = new JLabel("Correo electrónico");
    private JTextField txtCorreo = new JTextField();
    private JLabel lblTelefono = new JLabel("Teléfono");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblDireccion = new JLabel("Dirección");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblWeb = new JLabel("Sitio web");
    private JTextField txtWeb = new JTextField();
    
    private JButton btnCancelar = new JButton("Cancelar");
    private JButton btnGuardar = new JButton("Guardar Cambios");
    
    private JPanel pnlDatos = new JPanel(new GridLayout(10,1));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    private final Color COLOR_FONDO = new Color(41,128,185);
    private final Color COLOR_TEXTO = new Color(243,247,251);
    
    private final Font FUENTE = new Font("Calibri", Font.PLAIN,22);
    
    public Mi_Perfil(){
        this.setSize(miVentana);
        this.setTitle("Mi Perfil");
        lblTitulo.setFont(new Font("Calibri",Font.BOLD,32));
        lblTitulo.setHorizontalAlignment(JLabel.LEFT);
        lblTitulo.setForeground(COLOR_TEXTO);
        lblTitulo.setOpaque(true);
        lblTitulo.setBackground(COLOR_FONDO);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder());
        this.add(lblTitulo, BorderLayout.NORTH);
        
        txtNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_FONDO));
        txtCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_FONDO));
        txtTelefono.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_FONDO));
        txtDireccion.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_FONDO));
        txtWeb.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_FONDO));
        
        
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        pnlDatos.add(lblWeb);
        pnlDatos.add(txtWeb);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(0, 20, 10, 20));
        this.add(pnlDatos);
        
        for (int i = 0; i < pnlDatos.getComponentCount(); i++) {
            Component cmp = pnlDatos.getComponent(i);
            if (cmp instanceof JLabel) {
                cmp.setFont(FUENTE.deriveFont(Font.BOLD));
            } else {
                cmp.setFont(FUENTE);
            }
        }
        
        
        this.add(pnlDatos, BorderLayout.CENTER);
        btnGuardar.setFont(FUENTE);
        btnGuardar.setToolTipText("Guardar Datos de Formulario");
        btnCancelar.setFont(FUENTE);
        btnCancelar.setToolTipText("Cancelar Formulario");
        pnlBotones.add(btnCancelar);
        btnCancelar.setMnemonic('C');
        pnlBotones.add(btnGuardar);
        this.add(pnlBotones, BorderLayout.SOUTH);
    }
}
