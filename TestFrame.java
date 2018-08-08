package testframe;

import java.awt.*;

class TestFrame extends Frame
{
    public TestFrame()
    {
        super();

        setLayout( new BorderLayout() );
        setBackground( Color.lightGray );

        // Create a subpanel for the toolbar
        Panel toolbar = new Panel();
        toolbar.setLayout( new FlowLayout() );
        toolbar.add( new Button( "Button 1" ) );
        toolbar.add( new Button( "Button 2" ) );
        toolbar.add( new Button( "Button 3" ) );
        toolbar.add( new Button( "Button 4" ) );
        toolbar.add( new Button( "Button 5" ) );

        // Add the toolbar to the main panel
        add( toolbar, BorderLayout.NORTH );

        // Add a multi-line editor to the reset of the panel
        add( new TextArea("text area"), BorderLayout.CENTER );

        setSize( 400, 400 );
        setVisible(true);
    }


    public static void main(String[] args) {
        new TestFrame();
    }
}