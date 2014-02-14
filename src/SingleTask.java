import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;

public class SingleTask extends JPanel
{
	JLabel newTask;
	JTextField complete;
	JButton submitDaily, submitAdvanced, submitBOSS;
	JProgressBar schDaily, schAdvanced, schBOSS;
	public static int value, sumDaily, sumAdvanced, sumBOSS, intelligence,
			power;
	Timer timer;

	public SingleTask(String task, int i)
	{
		this.setLayout(new FlowLayout());
		newTask = new JLabel(task);
		complete = new JTextField();
		schDaily = new JProgressBar();
		schAdvanced = new JProgressBar();
		schBOSS = new JProgressBar();

		value = 0;

		sumDaily = 0;
		schDaily.setMaximum(100);
		schDaily.setMinimum(0);
		schDaily.setValue(0);

		sumAdvanced = 0;
		schAdvanced.setMaximum(100);
		schAdvanced.setMinimum(0);
		schAdvanced.setValue(0);

		sumBOSS = 0;
		schBOSS.setMaximum(100);
		schBOSS.setMinimum(0);
		schBOSS.setValue(0);

		submitDaily = new JButton("提交");
		submitAdvanced = new JButton("提交");
		submitBOSS = new JButton("提交");

		complete.setPreferredSize(new Dimension(70, 20));

		submitDailyAction DailyAction = new submitDailyAction();
		submitAdvancedAction AdvancedAction = new submitAdvancedAction();
		submitBOSSAction BOSSAction = new submitBOSSAction();

		submitDaily.addActionListener(DailyAction);
		submitAdvanced.addActionListener(AdvancedAction);
		submitBOSS.addActionListener(BOSSAction);

		this.add(newTask);
		this.add(complete);
		if (i == 1)
		{
			this.add(submitDaily);
			this.add(schDaily);
		} else if (i == 2)
		{
			this.add(submitAdvanced);
			this.add(schAdvanced);
		} else
		{
			this.add(submitBOSS);
			this.add(schBOSS);
		}
		this.setVisible(true);

	}

	private class submitDailyAction implements ActionListener
	{
		public submitDailyAction()
		{
			// System.out.println(value);
		}

		public void actionPerformed(ActionEvent e)
		{
			String add = complete.getText();
			int iDailyAdd = Integer.parseInt(add);
			// System.out.println(iDailyAdd);
			sumDaily += iDailyAdd;
			if ((sumDaily / 100) >= 1)
			{
				intelligence += (sumDaily / 100);
				System.out.println(intelligence);
				sumDaily %= 100;
			}
			schDaily.setValue(sumDaily);
			// System.out.println(sumDaily);
			// System.out.println(value);
		}
	}

	private class submitAdvancedAction implements ActionListener
	{
		public submitAdvancedAction()
		{
			// System.out.println(value);
		}

		public void actionPerformed(ActionEvent e)
		{
			String add = complete.getText();
			int iAdvancedAdd = Integer.parseInt(add);
			// System.out.println(value);
			sumDaily += iAdvancedAdd;
			if ((sumDaily / 100) >= 1)
			{
				intelligence += (sumDaily / 100);
				System.out.println(intelligence);
				sumDaily %= 100;
			}
			schAdvanced.setValue(sumDaily);
		}
	}

	private class submitBOSSAction implements ActionListener
	{
		public submitBOSSAction()
		{
			// System.out.println(value);
		}

		public void actionPerformed(ActionEvent e)
		{
			String add = complete.getText();
			int iBOSSAdd = Integer.parseInt(add);
			// System.out.println(value);
			sumDaily += iBOSSAdd;
			if ((sumDaily / 100) >= 1)
			{
				intelligence += (sumDaily / 100);
				System.out.println(intelligence);
				sumDaily %= 100;
			}
			schBOSS.setValue(sumDaily);
		}
	}

	public static int getIntelligence()
	{
		return intelligence;
	}

	public static int getPower()
	{
		return power;
	}

}
