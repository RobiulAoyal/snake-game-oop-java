import java.awt.Color;
import java.awt.Graphics;

public class Orange extends GameObject {

    public Orange(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(getX(), getY(), GamePanel.UNIT_SIZE, GamePanel.UNIT_SIZE);
    }
}