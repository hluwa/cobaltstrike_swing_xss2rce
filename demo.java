import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class demo {

    public static String readFile(File file) {
        try {
            InputStream input = new FileInputStream(file);
            byte[] b = new byte[input.available()];
            input.read(b);
            input.close();
            return new String(b);
        } catch (IOException e) {
            return "";
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.add(new JLabel(readFile(new File("payload.html"))));

            frame.pack();
            frame.setVisible(true);
        });
    }
}