package testframe;

import java.awt.*;

class TestFrame extends Frame
{
    public TestFrame()
    {
        super();

        // Create the grid bag layout manager instance and
        // an associated constraints object
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints gridConstraints = new GridBagConstraints();

        setLayout( gridBag );
        setBackground( Color.lightGray );
        // Create some buttons, adding them to the grid bag
        // using three equal portions
        gridConstraints.fill = GridBagConstraints.BOTH;
        gridConstraints.weightx = 1.0;
        createButton( "Button1", gridBag, gridConstraints );
        createButton( "Button2", gridBag, gridConstraints );
        createButton( "Button3", gridBag, gridConstraints );
        // The fourth button on this line gets the space that’s left
        gridConstraints.gridwidth =
                GridBagConstraints.REMAINDER;
        createButton( "Button4", gridBag, gridConstraints );
        // Create another button on the next line that uses
        // the entire width.
        gridConstraints.weightx = 0.0;
        createButton( "Button5", gridBag, gridConstraints );
        gridConstraints.gridwidth = GridBagConstraints.RELATIVE;

        setSize( 400, 400 );
        setVisible(true);
    }

    protected void createButton( String sName,
                                 GridBagLayout gridBag,
                                 GridBagConstraints gridConstraint )
    {
        Button button = new Button( sName );
        gridBag.setConstraints( button, gridConstraint );
        add( button );
    }

    public static void main(String[] args) {
        new TestFrame();
    }
}