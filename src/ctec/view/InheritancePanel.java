package ctec.view;

import javax.swing.*;
import java.awt.*;
import ctec.controller.InheritanceController;

public class InheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private JButton inheritanceButton;
	private JLabel ironLabel;
	private JLabel manLabel;
	private JLabel suitLabel;
	
	public InheritancePanel(InheritanceController baseController)
	{
		this.baseController = baseController;
		
		inheritanceButton = new JButton("");
		ironLabel = new JLabel("");
		manLabel = new JLabel("");
		suitLabel = new JLabel("");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
		
		
	}
	
	public void setupPanel()
	{
		this.add(ironLabel);
		this.add(manLabel);
		this.add(suitLabel);
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
