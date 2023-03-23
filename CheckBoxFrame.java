import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{
    private JTextField textField;
    private JCheckBox boldJCheckBox;
    private JCheckBox italiCheckBox;
    
    public CheckBoxFrame()
    {
        super( "jcheckbox Test" );
        setLayout( new FlowLayout() );
        
        textField = new JTextField( "Watch the font style change", 20 );
        add( textField );
        
        boldCheckBox = new JCheckBox( "Bold" );
        italicJCheckBox = new JCheckBox( "italic" );
        add( boldCheckBox );
        add ( italicJCheckBox );
        
        CheckBoxHandler handler = new CheckBoxHandler();
        boldCheckBox.addItemListener( handler );
        italicJCheckBox.addItemListener( handler );
    }
    
    private class CheckBoxHandler implements ItemListener
    {
        
        public void itemStateChanged( ItemEvent event )
        {
            Font font = null;
            
            if (boldJCheck.isSelected() && italicJCHeckBox.isSelected() )
                font = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
            else if (boldJCheckBox.isSelected() )
                font = new Font( "Serif", Font.BOLD, 14 );
            else if (italicJCheckBox.isSelected() )
                font = new Font ( "serif", Font.ITALIC, 14 );
            else
                font = new Font( "Serif", Font.PLAIN, 14 );
        }
    }
}