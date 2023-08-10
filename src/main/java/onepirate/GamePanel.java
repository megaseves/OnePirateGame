package onepirate;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    // SCREEN settings
    final int originalTileSize = 16; // 16x16 tile
    final int scale = 3;
    final int titleSize = originalTileSize * scale; // 48x48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = titleSize * maxScreenCol; // 768 pixels
    final int screenHeight = titleSize * maxScreenRow; // 576 pixels

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);


    }

}
