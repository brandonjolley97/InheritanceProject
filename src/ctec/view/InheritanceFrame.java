package ctec.view;

import javax.swing.*;
import ctec.controller.*;

public class InheritanceFrame extends JFrame
{
	private InheritanceController baseController;
	private InheritancePanel basePanel;
	
	public InheritanceFrame(InheritanceController baseController)
	{
		
		this.baseController = baseController;
		this.basePanel = new InheritancePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(600, 600);
		this.setTitle("Inheritance and Sorting!");
		this.setVisible(true);
	}
}
