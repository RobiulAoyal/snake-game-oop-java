import java.awt.Color;
import java.awt.Graphics;

public class Apple extends GameObject {

    public Apple(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(getX(), getY(), GamePanel.UNIT_SIZE, GamePanel.UNIT_SIZE);
    }
}