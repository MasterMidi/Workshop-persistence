package gui.renderer;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

import model.OrderLine;
import model.SellableProduct;

public class ProductListCellRenderer extends DefaultListCellRenderer {

	@Override
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {

		Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		if (renderer instanceof JLabel && value instanceof SellableProduct) {
			SellableProduct castedValue = (SellableProduct) value;
			String text = String.format("%s", castedValue.getProduct().getName());
			((JLabel) renderer).setText(text);
		}

		return renderer;
	}

}
