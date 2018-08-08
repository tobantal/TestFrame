package testframe;

import java.awt.*;

class TestFrame extends Frame
{
    public TestFrame()
    {
        super();
        setSize( 400, 400 );
        setLayout( new FlowLayout() );
        setBackground( Color.lightGray );
        add( new Button( "North" ), BorderLayout.NORTH );
        add( new Button( "South" ), BorderLayout.SOUTH );
        add( new Button( "East" ), BorderLayout.EAST );
        add( new Button( "West" ), BorderLayout.WEST );
        add( new Button( "Center" ), BorderLayout.CENTER );
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestFrame();
    }
}