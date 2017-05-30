import java.awt.*;
import java.swing.*;
public class layeredPanel extends JPanel
{
    public layeredPanel()
    {
    super();
    onInit();
}
private void onInit()
{
    setLayout(new BorderLayout());

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.add(new JTextArea(100,100),BorderLayout.CENTER);
    panel.add(new JButton("submit"),BorderLayout.SOUTH);

    JPanel glass = new JPanel();
    glass.setOpaque(false);

    add(panel,BorderLayout.CENTER);
    add(glass,BorderLayout.CENTER);
    setVisible(true);
}

public static void main(String args[])
{
    new layeredPanel();
}
}