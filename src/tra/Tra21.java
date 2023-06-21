package tra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tra21 extends JFrame {
    private JButton btn01;
    private JButton btn02;
    private JPanel panel;
    MyLisenter listener = new MyLisenter();

    // 생성자 안에 필요한 초기화 코드를 포함시켜 객체의 초기 상태를 설정하는 것은 일반적인 관행
    public Tra21() {
        // new 키워드를 사용하여 객체를 생성하면 메모리에서 객체를 위한 공간이 할당되지만,
        // 이 공간은 아직 초기화되지 않은 상태입니다. 생성자를 호출함으로써 해당 공간이 초기화되고 객체의 속성이나 상태가 설정됩니다.
        // 따라서 생성자 호출 이후에야 객체가 완전히 생성되어 사용할 수 있는 상태이기 때문에 new 객체 생성된 참조변수는 사용 안됨
        // this를 사용하자

        // tr.setSize(300, 200); 오류
        this.setSize(300, 200);
        // this 생략 가능
        setTitle("이벤트 예제");
        panel = new JPanel();
        btn01 = new JButton("노란색");
        btn01.addActionListener(listener);
        panel.add(btn01);
        btn02 = new JButton("파란색");
        btn02.addActionListener(listener);
        panel.add(btn02);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(rootPaneCheckingEnabled);

    }

    public class MyLisenter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // e.getSource()는 이벤트가 발생한 소스(버튼, 메뉴 등)를 반환
            if (e.getSource() == btn01) {
                panel.setBackground(Color.YELLOW);
            } else if (e.getSource() == btn02) {
                panel.setBackground(Color.BLUE);
            }
        };
    }

    public static void main(String[] args) {
        // Tra21 tr = new Tra21();
        new Tra21();
    }
}
