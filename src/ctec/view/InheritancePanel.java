package ctec.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ctec.controller.InheritanceController;

public class InheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private JButton inheritanceButton;
	private JTextArea textDisplay;
	
	public InheritancePanel(InheritanceController baseController)
	{
		this.baseController = baseController;
		
		inheritanceButton = new JButton("SORT");
		textDisplay = new JTextArea(15,20);
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	public void setupPanel()
	{

		this.add(textDisplay);
		this.add(inheritanceButton);
		textDisplay.setText(baseController.showHeroLevel());
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		inheritanceButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				textDisplay.setText(baseController.showHeroLevel());
			}
		});
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
