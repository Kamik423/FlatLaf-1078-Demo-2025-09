package demo;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.util.SystemFileChooser;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        FlatLightLaf.setup();
        Timer timer =
                new Timer(
                        10,
                        ae -> {
                            SystemFileChooser fileChooser = new SystemFileChooser();
                            if (fileChooser.showOpenDialog(null)
                                    == SystemFileChooser.APPROVE_OPTION) {
                                System.out.println(
                                        "Selected file: "
                                                + fileChooser.getSelectedFile().getAbsolutePath());
                            }
                        });
        timer.setRepeats(false);
        timer.start();
    }
}
