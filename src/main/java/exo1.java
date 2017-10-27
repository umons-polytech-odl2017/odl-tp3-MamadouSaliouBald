import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exo1
{
	private JButton button1;
	private JPanel panel1;
	private JRadioButton Rectangle;
	private JRadioButton Circle;
	private JRadioButton Elllipsis;
	private JRadioButton Square;
	private JPanel drowingPanel;
	private JTextField textField1;

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("exo1");
		frame.setContentPane(new exo1().panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}


	private void createUIComponents()
	{
		// TODO: place custom component creation code here
		drowingPanel = new JPanel();
		//if()

	}
}
