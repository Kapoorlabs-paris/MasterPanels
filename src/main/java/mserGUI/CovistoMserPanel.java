package mserGUI;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dimension;
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



public class CovistoMserPanel {
	
	public static JPanel MserPanel = new JPanel();
	
	public static int deltaInit = 10;
	public static float delta = deltaInit;
	public static int Unstability_ScoreInit = 1;
	public static float Unstability_Score = Unstability_ScoreInit;

	public static int minSizeInit = 50;
	public static int maxSizeInit = 500;
	public static long maxSize = maxSizeInit;
	public static long minSize = minSizeInit;
	public static long minSizemin = 0;
	public static long minSizemax = 1000;
	public static long maxSizemin = 1;
	public static long maxSizemax = 10000;
	public static float deltaMin = 0;
	public static float minDiversityMin = 0;
	public static float minDiversityMax = 1;
	public static int minDiversityInit = 1;
	public static float minDiversity = minDiversityInit;
	public static final int scrollbarSize = 1000;
	public static float Unstability_ScoreMin = 0f;
	public static float Unstability_ScoreMax = 1f;
	public static float deltaMax = 255f;
	
	public final static String deltastring = "Stride in intensiy threshold space";
	public final static String Unstability_Scorestring = "Unstability score";
	public final static String minDivstring = "Minimum diversity b/w components of tree";
	public final static String minSizestring = "Minimum size of MSER ellipses";
	public final static String maxSizestring = "Maximum size of MSER ellipses";
	public final static Label deltaText = new Label(deltastring + " = " + deltaInit, Label.CENTER);
	public final static Label Unstability_ScoreText = new Label(Unstability_Scorestring + " = " + Unstability_ScoreInit,
			Label.CENTER);
	public final static Label minDivText = new Label(minDivstring + " = " + minDiversityInit, Label.CENTER);
	public  final static Label minSizeText = new Label(minSizestring + " = " + minSizeInit, Label.CENTER);
	public final static Label maxSizeText = new Label(maxSizestring + " = " + maxSizeInit, Label.CENTER);

	public final static JScrollBar deltaS = new JScrollBar(Scrollbar.HORIZONTAL, deltaInit, 10, 0, 10 + scrollbarSize);
	public final static JScrollBar Unstability_ScoreS = new JScrollBar(Scrollbar.HORIZONTAL, Unstability_ScoreInit, 10, 0,
			10 + scrollbarSize);
	public  final static JScrollBar minDiversityS = new JScrollBar(Scrollbar.HORIZONTAL, minDiversityInit, 10, 0, 10 + scrollbarSize);

	public final static JScrollBar minSizeS = new JScrollBar(Scrollbar.HORIZONTAL, minSizeInit, 10, 0, 10 + scrollbarSize);
	public final static JScrollBar maxSizeS = new JScrollBar(Scrollbar.HORIZONTAL, maxSizeInit, 10, 0, 10 + scrollbarSize);
	
	
	
	public static boolean darktobright = false;
	public static boolean brighttodark = true;
	public static CheckboxGroup minormaxMser = new CheckboxGroup();
	public final static Checkbox findminimaMser = new Checkbox("Locate Maxima", minormaxMser, brighttodark);
	public final static Checkbox findmaximaMser = new Checkbox("Locate Minima", minormaxMser, darktobright);
	
	
	public static JButton AllMser = new JButton("MSER in 3D/4D"); 
	public static int SizeX = 400;
	public static int SizeY = 200;
	public static int SizeYbig = 500;
	
	
	public static void setInitialDelta(final float value) {
		delta = value;
		deltaInit = scrollbar.Utility.computeScrollbarPositionFromValue(delta, deltaMin, deltaMax, scrollbarSize);
	}
	
	public static void setInitialmaxSize(final int value) {
		maxSize = value;
		maxSizeInit = scrollbar.Utility.computeScrollbarPositionFromValue(maxSize, maxSizemin, maxSizemax, scrollbarSize);
	}
	public static void setInitialminDiversity(final float value) {
		minDiversity = value;
		minDiversityInit = scrollbar.Utility.computeScrollbarPositionFromValue(minDiversity, minDiversityMin, minDiversityMax,
				scrollbarSize);
	}

	public static double getInitialminDiversity(final float value) {

		return minDiversity;

	}

	public static void setInitialminSize(final int value) {
		minSize = value;
		minSizeInit = scrollbar.Utility.computeScrollbarPositionFromValue(minSize, minSizemin, minSizemax, scrollbarSize);
	}
	public static void setInitialUnstability_Score(final float value) {
		Unstability_Score = value;
		Unstability_ScoreInit = scrollbar.Utility.computeScrollbarPositionFromValue(Unstability_Score, Unstability_ScoreMin,
				Unstability_ScoreMax, scrollbarSize);
	}
	public static double getInitialminSize(final int value) {

		return minSize;

	}

	public double getInitialDelta(final float value) {

		return delta;

	}

	public static double getInitialmaxSize(final int value) {

		return maxSize;

	}
	public static JPanel MserPanel() {
		
		layoutManager.Setlayout.LayoutSetter(MserPanel);
		setInitialUnstability_Score(Unstability_ScoreInit);
		setInitialDelta(deltaInit);

		setInitialminDiversity(minDiversityInit);
		setInitialmaxSize(maxSizeInit);
		setInitialminSize(minSizeInit);
		Border mserborder = new CompoundBorder(new TitledBorder("MSER detection"), new EmptyBorder(layoutManager.Setlayout.c.insets));
		Unstability_ScoreS.setValue(scrollbar.Utility.computeScrollbarPositionFromValue(Unstability_ScoreInit,
				Unstability_ScoreMin, Unstability_ScoreMax, scrollbarSize));

		minDiversityS.setValue(scrollbar.Utility.computeScrollbarPositionFromValue(minDiversityInit,
				minDiversityMin, minDiversityMax, scrollbarSize));

		maxSizeS.setValue(scrollbar.Utility.computeScrollbarPositionFromValue(maxSizeInit, maxSizemin, maxSizemax,
				scrollbarSize));

		minSizeS.setValue(scrollbar.Utility.computeScrollbarPositionFromValue(minSizeInit, minSizemin, minSizemax,
				scrollbarSize));

		deltaS.setValue(
				scrollbar.Utility.computeScrollbarPositionFromValue(deltaInit, deltaMin, deltaMax, scrollbarSize));
		
		delta = scrollbar.Utility.computeValueFromScrollbarPosition(deltaS.getValue(), deltaMin, deltaMax,
				scrollbarSize);
		minDiversity = scrollbar.Utility.computeValueFromScrollbarPosition(minDiversityS.getValue(),
				minDiversityMin, minDiversityMax, scrollbarSize);
		Unstability_Score = scrollbar.Utility.computeValueFromScrollbarPosition(Unstability_ScoreS.getValue(),
				Unstability_ScoreMin, Unstability_ScoreMax, scrollbarSize);
		minSize = (long) scrollbar.Utility.computeValueFromScrollbarPosition(minSizeS.getValue(), minSizemin,
				minSizemax, scrollbarSize);

		maxSize = (long) scrollbar.Utility.computeValueFromScrollbarPosition(maxSizeS.getValue(), maxSizemin,
				maxSizemax, scrollbarSize);
		
		
		MserPanel.add(deltaText, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));

		MserPanel.add(deltaS, new GridBagConstraints(0, 1, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));

		MserPanel.add(Unstability_ScoreText, new GridBagConstraints(0, 2, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));

		MserPanel.add(Unstability_ScoreS, new GridBagConstraints(0, 3, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));

		MserPanel.add(minDivText, new GridBagConstraints(0, 4, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));

		MserPanel.add(minDiversityS, new GridBagConstraints(0, 5, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));

		MserPanel.add(minSizeText, new GridBagConstraints(0, 6, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));

		MserPanel.add(minSizeS, new GridBagConstraints(0, 7, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));

		MserPanel.add(maxSizeText, new GridBagConstraints(0, 8, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));
		MserPanel.add(maxSizeS, new GridBagConstraints(0, 9, 3, 1, 0.0, 0.0, GridBagConstraints.EAST,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));
		MserPanel.add(findminimaMser, new GridBagConstraints(0, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));

		MserPanel.add(findmaximaMser, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));
		MserPanel.add(AllMser, new GridBagConstraints(1, 12, 1, 1, 0.0, 0.0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, layoutManager.Setlayout.insets, 0, 0));
		MserPanel.setPreferredSize(new Dimension(SizeX, SizeYbig));

		MserPanel.setBorder(mserborder);
	
		
		
	return MserPanel;	
		
	}
	
	
}
