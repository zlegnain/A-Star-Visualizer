import javax.swing.JFrame;

/**
 * Display class
 * It will handle initializing our mainwindow display
 * It will create our m x n grid and draw the borders
 * It will handle drawing the Nodes -> (A node can be a wall (black) , visited (green), or open (white))
 * It will handle drawing the shortest path after path-finding is complete (red)
 * it will handle clearing the board
 * @author Zakariya Legnain
 */


public class Display {

    // frame
    private JFrame frame;
    private int width;
    private int height;

    // 2d array of Nodes

    public Display(int width, int height) {
        this.width = width;
        this.height = height;
        this.frame = new JFrame("A-star Visualizer");
    }

    public void run(){
        this.frame.setSize(this.width, this.height);
        this.frame.setVisible(true);

    }


    public static void main(String[] args) {
        Display win = new Display(500, 500);
        win.run();

    }











}
