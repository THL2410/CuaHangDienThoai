import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class App extends JFrame {
    // Các thành phần giao diện Swing và biến khác
    private JButton button;
    private JLabel label;

    public App() {
        // Cấu hình cửa sổ ứng dụng
        setTitle("Ứng dụng Swing");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Khởi tạo và đặt các thành phần giao diện
        button = new JButton("Click me!");
        label = new JLabel("Hello, World!");

        // Xử lý sự kiện khi nút được nhấn
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Xử lý sự kiện ở đây
                label.setText("Button clicked!");
            }
        });

        // Thêm các thành phần giao diện vào cửa sổ ứng dụng
        add(button);
        add(label);

        // Hiển thị cửa sổ ứng dụng
        setVisible(true);
    }

    public static void main(String[] args) {
        // Tạo một đối tượng App để khởi chạy ứng dụng
        App app = new App();
    }
}

