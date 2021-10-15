/** Node class that represents a pixel in mxn grid
 * It can represent a block, open, closed path
 * Each Node has a corresponding x and y int coordinates on the grid
 * Node will keep track of its parent Node, f-cost, g-cost, and heuristic cost
 *
 * @author Zakariya Legnain
 * @version 1.0, 10/14/2021
 */


public class Node {

    private int x;
    private int y;
    private int fcost;
    private int gcost;
    private int hcost;
    private boolean wall;
    private Node parent;

    /**
     * intialize Node with x y coordinates
     *
     * @param x - x coordinate of node
     * @param y - y coordinate of node
     */
    public Node(int x, int y) {
        this.x = x;
        this.y = y;

    }

    /**
     * method that will calculate the heuristic cost from the current Node to the Goal Node
     * Uses Manhattan distance heuristic
     *
     * @param goal - goal Node in grid
     */
    public void Hcost(Node goal) {
        this.hcost = Math.abs(goal.x - this.x) + Math.abs(goal.y - this.y);

    }

    /**
     * method that will calculate final cost: f(n) = h(n) + g(n)
     */
    public void Fcost() {
        this.fcost = this.gcost + this.hcost;

    }


    // getters
    public int getFcost() {
        return this.fcost;
    }

    public int getGcost() {
        return this.gcost;
    }

    public int getHcost() {
        return this.hcost;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Node getParent() {
        return this.parent;
    }

    public boolean isWall() {
        return this.wall;
    }

    //setters
    public void setFcost(int fcost) {
        this.fcost = fcost;
    }

    public void setGcost(int gcost) {
        this.gcost = gcost;
    }

    public void setHcost(int hcost) {
        this.hcost = hcost;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }


}
