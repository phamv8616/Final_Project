import javax.swing.*;
 
public class splitPane extends JFrame {
     
    public splitPane() {
         
        setTitle("Example of Split Pane");
        setSize(150, 150);
         
        JPanel jsp1 = new JPanel();
        JPanel jsp2 = new JPanel();
        JLabel j1 = new JLabel("Area 1");
        JLabel j2 = new JLabel("Area 2");
         
        jsp1.add(j1);
        jsp2.add(j2);
         
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, 
                true, jsp1, jsp2);
         
        splitPane.setOneTouchExpandable(true);
        getContentPane().add(splitPane);
         
    }
    public static void main(String[] args) {
         
        splitPane sp = new splitPane();
        sp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sp.setVisible(true);
         
    }
}