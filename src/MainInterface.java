import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainInterface extends JFrame
{

	public MainInterface()
	{
		super();
		this.setLayout(new BorderLayout());
		this.setSize(600, 600);
		this.setVisible(true);
		this.setTitle("º∆ªÆ”Œœ∑");
		this.add(new task(), BorderLayout.WEST);
		this.add(new attribute(), BorderLayout.EAST);
		this.validate();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
