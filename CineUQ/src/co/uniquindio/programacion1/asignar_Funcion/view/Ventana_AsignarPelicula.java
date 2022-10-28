package co.uniquindio.programacion1.asignar_Funcion.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import co.uniquindio.programacion1.asignar_Funcion.model.Asignar_Peliculas_Model;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;


public class Ventana_AsignarPelicula extends JFrame {

	private JPanel contentPane;
	private Asignar_Peliculas_Model asignarPelicula;
	LocalDate fechahoy = LocalDate.now();

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
		setResizable(false);
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
        
		
		getPeli(((ArrayList<?>) asignarPelicula.getFuncion().get(0)).get(4), ((ArrayList<?>) asignarPelicula.getFuncion().get(0)).get(3).toString(),  ((ArrayList<?>) asignarPelicula.getFuncion().get(0)).get(1).toString());
		getPeli(((ArrayList<?>) asignarPelicula.getFuncion().get(1)).get(4), ((ArrayList<?>) asignarPelicula.getFuncion().get(1)).get(3).toString(),  ((ArrayList<?>) asignarPelicula.getFuncion().get(1)).get(1).toString());
		getPeli(((ArrayList<?>) asignarPelicula.getFuncion().get(2)).get(4), ((ArrayList<?>) asignarPelicula.getFuncion().get(2)).get(3).toString(),  ((ArrayList<?>) asignarPelicula.getFuncion().get(2)).get(1).toString());

	
	
}
	
	
	
	public void getPeli(Object image, String texto, String posicion) {
		JButton ButtonPelicula = new JButton("");
		ButtonPelicula.setIcon(new ImageIcon("/Users/ferneycardonagarcia/git/CineUQ/CineUQ/imagenes/"+image+""));
		ButtonPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(posicion);
				
	}
		});
		ButtonPelicula.setBounds(59, 129, 250, 310);
		contentPane.add(ButtonPelicula);
		JLabel txtPelicula1 = new JLabel( "<html><p>" + texto + "</p></html>");
		txtPelicula1.setVerticalAlignment(SwingConstants.TOP);
		if (posicion.equals("0") || posicion.equals("3") || posicion.equals("6")) {
			ButtonPelicula.setBounds(59, 129, 250, 310);
			txtPelicula1.setBounds(59, 451, 266, 160);
		} else if(posicion.equals("1")) {
			txtPelicula1.setBounds(382, 451, 242, 176);
			ButtonPelicula.setBounds(382, 129, 242, 310);
		} else {
			ButtonPelicula.setBounds(691, 129, 250, 310);
			txtPelicula1.setBounds(691, 451, 250, 190);
		}
		contentPane.add(txtPelicula1);
    }
	
	
	
	
		 
	
	
	
	
	
	
	
	
	
	/**
	
public void getPelicula1() {
		JButton ButtonPelicula1 = new JButton("");
		ButtonPelicula1.setIcon(new ImageIcon("/Users/ferney/CineUQ/CineUQ/imagenes/"+((ArrayList<?>) asignarPelicula.getFuncion().get(0)).get(4)+""));
		ButtonPelicula1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	}
		});
		ButtonPelicula1.setBounds(59, 129, 250, 310);
		contentPane.add(ButtonPelicula1);
		JLabel txtPelicula1 = new JLabel( "<html><p>" + ((ArrayList<?>) asignarPelicula.getFuncion().get(0)).get(3).toString()+ "</p></html>");
		txtPelicula1.setVerticalAlignment(SwingConstants.TOP);
		txtPelicula1.setBounds(59, 451, 266, 160);
		contentPane.add(txtPelicula1);
		
    }
		
	
		
		
		public void getPelicula2() {
		JButton ButtonPelicula2 = new JButton("");
		ButtonPelicula2.setIcon(new ImageIcon("/Users/ferney/CineUQ/CineUQ/imagenes/"+((ArrayList<?>) asignarPelicula.getFuncion().get(1)).get(4)+""));

		ButtonPelicula2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		    });
		ButtonPelicula2.setBounds(382, 129, 242, 310);
		   
			JLabel txtPelicula2 = new JLabel("<html><p>" + ((ArrayList<?>) asignarPelicula.getFuncion().get(1)).get(3).toString()+ "</p></html>");
			txtPelicula2.setVerticalAlignment(SwingConstants.TOP);
			txtPelicula2.setBounds(382, 451, 242, 176);
			contentPane.add(txtPelicula2);
		    
		    contentPane.add(ButtonPelicula2);
      }
	
		
		
		
		
		public void getPelicula3() {
		JButton ButtonPelicula3 = new JButton("");
		ButtonPelicula3.setIcon(new ImageIcon("/Users/ferney/CineUQ/CineUQ/imagenes/"+((ArrayList<?>) asignarPelicula.getFuncion().get(2)).get(4)+""));
		ButtonPelicula3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonPelicula3.setBounds(691, 129, 250, 310);
		contentPane.add(ButtonPelicula3);
		
			JLabel txtPelicula3 = new JLabel("<html><p>" + ((ArrayList<?>) asignarPelicula.getFuncion().get(2)).get(3).toString()+ "</p></html>");
			txtPelicula3.setVerticalAlignment(SwingConstants.TOP);
			txtPelicula3.setHorizontalAlignment(SwingConstants.LEFT);
			txtPelicula3.setBounds(691, 451, 250, 190);
			contentPane.add(txtPelicula3);
		
		
	 }
	 
	 */
	
	}




