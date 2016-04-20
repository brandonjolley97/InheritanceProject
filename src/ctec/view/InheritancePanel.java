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
	private JLabel ironLabel;
	private JLabel manLabel;
	private JLabel suitLabel;
	private JTextArea textDisplay;
	
	public InheritancePanel(InheritanceController baseController)
	{
		this.baseController = baseController;
		
		inheritanceButton = new JButton("SORT");
		ironLabel = new JLabel("Iron");
		manLabel = new JLabel("Man");
		suitLabel = new JLabel("Suit");
		textDisplay = new JTextArea(15,20);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	public void setupPanel()
	{
		this.add(ironLabel);
		this.add(manLabel);
		this.add(suitLabel);
		this.add(textDisplay);
		this.add(inheritanceButton);
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
				ironLabel.setText("");
				manLabel.setText("");
				suitLabel.setText("");
			}
		});
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
