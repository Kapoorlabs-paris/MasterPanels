package dogGUI;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Scrollbar;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class CovistoDogPanel {

	
	public static JPanel DogPanel = new JPanel();
	
	
	public static final int scrollbarSize = 1000;
	public static boolean lookForMaxima = true;
	public static boolean lookForMinima = false;
	public static int sigmaInit = 30;
	public static float sigma = sigmaInit;
	public static float sigmaMin = 1f;
	public static float sigmaMax = 100f;
	public static CheckboxGroup minormax = new CheckboxGroup();
	public static final Checkbox findminima = new Checkbox("Locate Minima", minormax, lookForMinima);
	public static final Checkbox findmaxima = new Checkbox("Locate Maxima", minormax, lookForMaxima);
	public static float thresholdMin = 0;
	public static float thresholdMax = 255f;
	public static  int thresholdInit = 0;
	public static float sigma2 = 1.1f;
	public static float threshold = 1f;
	public static int sigmasliderInit = 0;
	public static int thresholdsliderInit = 125;
	public static Label sigmaText = new Label("Approximate object size = " + sigmaInit, Label.CENTER);
	public static JScrollBar sigmaslider = new JScrollBar(Scrollbar.HORIZONTAL, sigmaInit, 10, 0, scrollbarSize + 10);
	public static JScrollBar thresholdslider = new JScrollBar(Scrollbar.HORIZONTAL, thresholdInit, 10, 0, 10 + scrollbarSize);
	public static Label thresholdText = new Label("Approximate peak intensity " + thresholdInit, Label.CENTER);
	public static JButton AllDog = new JButton("DOG in 3D/4D"); 
	public static final String sigmastring = "Approximate object size";
	public static final String thresholdstring = "Threshold peak intensity";
	public static JPanel DogPanel() {
		
		
		layoutManager.Setlayout.LayoutSetter(DogPanel);
		sigmaslider.setValue(
				scrollbar.Utility.computeScrollbarPositionFromValue(sigmaInit, sigmaMin, sigmaMax, scrollbarSize));
		sigmaText = new Label("Approximate object size = " + sigma, Label.CENTER);
		thresholdslider.setValue(scrollbar.Utility.computeScrollbarPositionFromValue(thresholdsliderInit,
				thresholdMin, thresholdMax, scrollbarSize));

		sigma = scrollbar.Utility.computeValueFromScrollbarPosition(sigmaslider.getValue(), sigmaMin, sigmaMax,
				scrollbarSize);

		threshold = scrollbar.Utility.computeValueFromScrollbarPosition(thresholdslider.getValue(), thresholdMin,
				thresholdMax, scrollbarSize);
		thresholdText = new Label("Approximate peak intensity " + threshold, Label.CENTER);
		Border dogborder = new CompoundBorder(new TitledBorder("Difference of Gaussian detection"),
				new EmptyBorder(layoutManager.Setlayout.c.insets));
		DogPanel.add(sigmaText, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));

		DogPanel.add(sigmaslider, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));
		DogPanel.add(thresholdText, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));

		DogPanel.add(thresholdslider, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));

		DogPanel.add(findminima, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));

		DogPanel.add(findmaxima, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));
		DogPanel.add(AllDog, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));
		DogPanel.setBorder(dogborder);
		
		
		return DogPanel;
		
	}
	
	
	
}
