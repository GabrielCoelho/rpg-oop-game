import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainView {
  public void initializeApp() {
    JFrame windowFrame = new JFrame();
    windowFrame.setSize(400, 500);
    windowFrame.setLayout(null);
    windowFrame.setVisible(true);

    JButton startGameButton = new JButton("Start Game");
    startGameButton.setBounds(130, 100, 150, 40);

    windowFrame.add(startGameButton);

    startGameButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent clicked) {
        int decision = JOptionPane.showConfirmDialog(windowFrame, "Do you really want to start the game?");

        if (decision == JOptionPane.YES_OPTION) {
          System.out.println("Yes, starting the game...");
        } else {
          System.out.println("Nope, doing nothing");
        }
      }
    });

    windowFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
}
