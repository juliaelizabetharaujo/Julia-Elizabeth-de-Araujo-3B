import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener
{
    private JButton[] buttons;
    private static final String[] names = { "hide north", "hide south". "hide east", "hide west", "hide center"};
    private BorderLayout layout;

    public BorderLayoutFrame()
{
  super( "BorderLayout Demo" );
  layout = new BorderLayout( 5, 5 );
  setLayout( layout );
  buttons = new JButton[ names.length ];
  for ( int count = 0; count < names.length; count++ )
{
     buttons[count] = new JButton(names[count]);
     buttons[count].addActionListener(this);
}

add( buttons[0], BorderLayout.NORTH );
add( buttons[1], BorderLayout.SOUTH );
add( buttons[2], BorderLayout.EAST );
add( buttons[3], BorderLayout.WEST );
add( buttons[4], BorderLayout.CENTER );
}