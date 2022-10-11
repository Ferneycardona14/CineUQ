package co.uniquindio.programacion1.asignar_Funcion.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.uniquindio.programacion1.asignar_Funcion.model.Asignar_Peliculas_Model;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class Ventana_AsignarPelicula extends JFrame {

	private JPanel contentPane;
	private Asignar_Peliculas_Model asignarPelicula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_AsignarPelicula frame = new Ventana_AsignarPelicula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public Ventana_AsignarPelicula() {
		asignarPelicula = new Asignar_Peliculas_Model();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setBounds(700, 700, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		
		
		
//
		
		JButton pelicula1 = new JButton("");
		pelicula1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

			}
		});
		pelicula1.setBounds(118, 129, 200, 310);
		contentPane.add(pelicula1);
		
		
		JLabel lblNewLabel = new JLabel(((ArrayList) asignarPelicula.getFuncion().get(0)).get(2).toString());
		lblNewLabel.setBounds(181, 451, 61, 16);
		contentPane.add(lblNewLabel);
		
		//
		
		JButton pelicula2 = new JButton("");
		pelicula2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pelicula2.setBounds(416, 129, 200, 310);
		contentPane.add(pelicula2);
		
		//
		
		
		JButton pelicula3 = new JButton("");
		pelicula3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pelicula3.setBounds(702, 129, 200, 310);
		contentPane.add(pelicula3);
		
		
		
		
		
		//
		
	     }
	}


