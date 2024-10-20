package jTable;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MarcoTabla extends JFrame {
    
    public MarcoTabla() {
        
    	setTitle("Los planetas");
        setBounds(300, 300, 400, 300);

        TablaDatos datos = new TablaDatos();
        JTable tablaPlanetas = new JTable(datos.getDatosFila(), datos.getNombresColumnas());

        add(new JScrollPane(tablaPlanetas), BorderLayout.CENTER);

        JButton botonImprimir = new JButton("Imprimir tabla");
        botonImprimir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tablaPlanetas.print();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });

        JPanel laminaBoton = new JPanel();
        laminaBoton.add(botonImprimir);
        add(laminaBoton, BorderLayout.SOUTH);
        
    }
    
}