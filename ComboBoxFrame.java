import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCombox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame
{
    private JCombox imagesJComboBox;
    private JLabel label;
    
    private static final String[] names =
       { "bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif" };
    private Icon[] icon = {
        new ImageIcon( getClass().getResource(names[ 0 ] ) ),
        new ImageIcon( getClass().getResource(names[ 1 ] ) ),
        new ImageIcon( getClass().getResource(names[ 2 ] ) ),
        new ImageIcon( getClass().getResource(names[ 3 ] ) ) };
    
    public ComboBoxFrame()
    {
        super( "testando JComboBox" );
        setLayout( new FlowLayout() );
        
        imagesJCombox = new JCombox( names );
        imagesJComboBox.setMaximumRowCount( 3 );
        
        imagesJComboBox.addItemListener(
           new ItemListener()
           {
               
               public void itemStateChaged( itemEvent event )
               {
                   
                   if( event.getStateChange() == ItemEvent.SELECTED )
                     label.setIcon( icons[
                       imagesJComboBox.getSelectedIndex() ] );
           
        }
    }
);

        add( imagesJComboBox );
        label = new JLabel( icons[0] );
        add( label );
    }
}