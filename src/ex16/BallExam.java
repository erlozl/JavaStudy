package ex16;

import java.awt.*;
import javax.swing.*;

class Ball {
    private int x = 100;
    private int y = 100;
    private int size = 30;
    private int xSpeed = 10;
    private int ySpeed = 10;
    // 공의 속성은 위치, 크기, 속도

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);

        // 공을 화면에 그려주는 메서드
    }

    public void update() {
        x += xSpeed;
        y += ySpeed;
        if ((x + size) > MyPanel.BOARD_WIDTH - size || x < 0) {
            xSpeed = -xSpeed;
            System.out.println(xSpeed);
        }
        if ((y + size) > MyPanel.BOARD_HEIGHT - size || y < 0) {
            ySpeed = -ySpeed;
        }
    }
}

class MyPanel extends JPanel {
    static final int BOARD_WIDTH = 600;
    static final int BOARD_HEIGHT = 300;
    private Ball ball = new Ball();

    public MyPanel() {
        this.setBackground(Color.YELLOW);

        Runnable task = () -> {
            while (true) {
                ball.update();
                repaint();
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
            }
        };
        new Thread(task).start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.draw(g);
    }
}

public class BallExam {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(MyPanel.WIDTH, MyPanel.BOARD_HEIGHT);
        jf.add(new MyPanel());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
