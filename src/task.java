import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class task extends JPanel
{
	JLabel dailyTask, advancedTask, BOSSTask;
	JPanel dailyPanel, advancedPanel, BOSSPanel;
	SingleTask singleDailyTask, singleAdvancedTask, singleBOSSTask;
	JPanel powerPanel, intelligencePanel;
	JButton jb;
	JLabel newTask;
	JTextField complete;
	JButton submitDaily, submitAdvanced, submitBOSS;
	JProgressBar schDaily, schAdvanced, schBOSS;
	public static int value, sumDaily, sumAdvanced, sumBOSS, intelligence,
			power;

	public task()
	{
		JPanel attributePanel = new JPanel();
		JPanel taskPanel = new JPanel();

		jb = new JButton("����");

		dailyTask = new JLabel("�ճ�����");
		advancedTask = new JLabel("�ƹ�����");
		BOSSTask = new JLabel("BOSS����");

		dailyPanel = new JPanel();
		advancedPanel = new JPanel();
		BOSSPanel = new JPanel();

		singleDailyTask = new SingleTask("   ����ճ�����", 1);
		singleAdvancedTask = new SingleTask("   ����ƹ�����", 2);
		singleBOSSTask = new SingleTask("   ���BOSS����", 3);

		attributePanel.setLayout(new BorderLayout());
		powerPanel = new JPanel();
		intelligencePanel = new JPanel();
		powerPanel.add(new JLabel("��:   "));
		powerPanel.add(new JLabel("" + power));
		intelligencePanel.add(new JLabel("��:   "));
		intelligencePanel.add(new JLabel("" + intelligence));
		attributePanel.add(jb, BorderLayout.NORTH);
		attributePanel.add(powerPanel, BorderLayout.CENTER);
		attributePanel.add(intelligencePanel, BorderLayout.SOUTH);

		dailyPanel.setLayout(new BorderLayout());
		dailyPanel.add(dailyTask, BorderLayout.NORTH);
		dailyPanel.add(singleDailyTask, BorderLayout.CENTER);

		advancedPanel.setLayout(new BorderLayout());
		advancedPanel.add(advancedTask, BorderLayout.NORTH);
		advancedPanel.add(singleAdvancedTask, BorderLayout.CENTER);

		BOSSPanel.setLayout(new BorderLayout());
		BOSSPanel.add(BOSSTask, BorderLayout.NORTH);
		BOSSPanel.add(singleBOSSTask, BorderLayout.CENTER);

		this.setLayout(new BorderLayout());
		this.add(dailyPanel, BorderLayout.NORTH);
		this.add(advancedPanel, BorderLayout.CENTER);
		this.add(BOSSPanel, BorderLayout.SOUTH);

		this.setVisible(true);
	}
}
