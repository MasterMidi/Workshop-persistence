package gui.tab;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import gui.components.JHintTextField;

public class pProducts extends JPanel {
	private JHintTextField txtfBarcode;
	private JTable tblProducts;
	private JButton btnCreate;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JCheckBox chckbxShowInactive;
	private JPanel pButtons;
	private JPanel pFilter;

	/**
	 * Create the panel.
	 */
	public pProducts() {
		setLayout(new BorderLayout(0, 0));

		JPanel pActions = new JPanel();
		add(pActions, BorderLayout.SOUTH);
		pActions.setLayout(new GridLayout(0, 2, 0, 0));
		
		pFilter = new JPanel();
		FlowLayout fl_pFilter = (FlowLayout) pFilter.getLayout();
		fl_pFilter.setAlignment(FlowLayout.LEFT);
		pActions.add(pFilter);

		chckbxShowInactive = new JCheckBox("Vis inaktive");
		pFilter.add(chckbxShowInactive);
		chckbxShowInactive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		pButtons = new JPanel();
		FlowLayout fl_pButtons = (FlowLayout) pButtons.getLayout();
		fl_pButtons.setAlignment(FlowLayout.RIGHT);
		pActions.add(pButtons);

		btnCreate = new JButton("Opret...");
		pButtons.add(btnCreate);

		btnDelete = new JButton("Slet");
		pButtons.add(btnDelete);

		btnUpdate = new JButton("Opdater");
		pButtons.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

//		btnFind = new JButton("Søg...");
//		btnFind.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				refreshProductTable();
//			}
//		});
//		pButtons.add(btnFind);

		JPanel pProductView = new JPanel();
		add(pProductView, BorderLayout.CENTER);
		pProductView.setLayout(new BorderLayout(0, 0));

		txtfBarcode = new JHintTextField();
		txtfBarcode.setHint("Stregkode / Navn...");
		txtfBarcode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		pProductView.add(txtfBarcode, BorderLayout.SOUTH);
		txtfBarcode.setColumns(10);

		JScrollPane scrlProducts = new JScrollPane();
		pProductView.add(scrlProducts, BorderLayout.CENTER);

		tblProducts = new JTable();
		tblProducts.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		scrlProducts.setViewportView(tblProducts);
		tblProducts.getTableHeader().setReorderingAllowed(false);
		tblProducts.setAutoCreateRowSorter(true);

		init();
	}

	private void init() {

	}
}
