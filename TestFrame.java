package testframe;

import java.awt.*;

class TestFrame extends Frame
{
    public TestFrame()
    {
        super();
        setSize( 400, 400 );
        setLayout( new GridLayout( 3, 2 ) );
        setBackground( Color.lightGray );
        add( new Button( "One" ) );
        add( new Button( "Two" ) );
        add( new Button( "Three" ) );
        add( new Button( "Four" ) );
        add( new Button( "Five" ) );
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestFrame();
    }
}