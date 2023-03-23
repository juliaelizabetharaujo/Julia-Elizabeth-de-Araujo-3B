import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame
{
    private JButton plainButton;
    private JButton fancyJButton;
    private final JButton plainJButton;
    
    public ButtonFrame()
    {
        super("lesting buttons");
        setLayout(new FlowLayout() );
        
        plainJButton = new JButton( "plain button" );
        add( plainButton );
        
        Icon bug1 = new ImageIcon( getClass().getResource( "bug1.gif" ) );
        Icon bug2 = new ImageIcon( getClass().getResource( "bug2.gif" ) );
        fancyButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add( FancyButton );
        
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener( handler );
        plainJButton.addActionListener( handler );
    }
    
    private class ButtonHandler implements ActionListener{
    {
            public void actionPerformed( ActionEvent event ){
            {
                JOptionPane.showMessageDialog(ButtonFrame.this.String.Format("you pressed: %s", event.getActionCommand()));
            }
        }
    }
}