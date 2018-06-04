package comboSliderTextbox;

import java.awt.GridBagConstraints;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.TextField;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class SliderBoxGUI {

	
	final String string;
	final int valueDimension;
	final int scrollbarSize;
	
	public SliderBoxGUI(final String string, final int scrollbarSize, final int valueDimension) {
		
		this.string  = string;
		this.scrollbarSize = scrollbarSize;
		this.valueDimension = valueDimension;
		
	}
	
	
	
	public void BuildDisplay() {
	
	Label valueText = new Label(this.string + 1, Label.CENTER);
	String valuestring = string;
	JScrollBar valueslider = new JScrollBar(Scrollbar.HORIZONTAL, 0, 10, 0,
			scrollbarSize + 10);
	JPanel combosliderbox = new JPanel();
	TextField inputFieldT = new TextField(5);
	inputFieldT.setText(Integer.toString(valueDimension));
	layoutManager.Setlayout.LayoutSetter(combosliderbox);
	
	Border valueborder = new CompoundBorder(new TitledBorder("Select value"), new EmptyBorder(layoutManager.Setlayout.insets));
	

	combosliderbox.add(valueText, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
			GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));

	combosliderbox.add(valueslider, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
			GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));

	combosliderbox.add(inputFieldT, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
			GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));

	combosliderbox.setBorder(valueborder);
	
	
	}
	
}
