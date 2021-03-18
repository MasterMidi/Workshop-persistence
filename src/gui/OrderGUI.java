package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import gui.tab.pCreateOrder;

public class OrderGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderGUI frame = new OrderGUI();
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
	public OrderGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_products = new JPanel();
		tabbedPane.addTab("Produkter", null, panel_products, null);
		
		JPanel panel_customers = new JPanel();
		tabbedPane.addTab("Kunder", null, panel_customers, null);
		
		JPanel panel_orders = new pCreateOrder();
		tabbedPane.addTab("Ordrer", null, panel_orders, null);
		
		JPanel panel_invoices = new JPanel();
		tabbedPane.addTab("Invoices", null, panel_invoices, null);
	}

}
