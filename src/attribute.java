import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class attribute extends JPanel implements ActionListener
{
	public static JPanel powerPanel, intelligencePanel;
	public static JButton jb;
	public static JTextField textIntelligence,textPower;

	public attribute()
	{
		textIntelligence = new JTextField();
		textPower = new JTextField();
		textIntelligence.setPreferredSize(new Dimension(20,20));
		textPower.setPreferredSize(new Dimension(20,20));		
		textIntelligence.setText("" + SingleTask.getIntelligence());
		textPower.setText("" + SingleTask.getPower());	
		
		jb = new JButton("¸üÐÂ");
		jb.addActionListener(this);		
		
		this.setLayout(new BorderLayout());
		
		powerPanel = new JPanel();
		intelligencePanel = new JPanel();
		powerPanel.add(new JLabel("Á¦:   "));
		powerPanel.add(textPower);
		intelligencePanel.add(new JLabel("ÖÇ:   "));
		intelligencePanel.add(textIntelligence);
		
		this.add(jb, BorderLayout.SOUTH);
		this.add(powerPanel, BorderLayout.NORTH);
		this.add(intelligencePanel, BorderLayout.CENTER);
		this.setVisible(true);
		this.validate();
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println(SingleTask.getIntelligence());
		textIntelligence.setText("" + SingleTask.getIntelligence());
		textPower.setText("" + SingleTask.getPower());
		this.setVisible(true);
		this.validate();
	}
}
