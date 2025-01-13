import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainView {
  JFrame windowFrame = new JFrame();
  JPanel panelFrame = new JPanel();
  JButton startGameButton = new JButton("Start Game");
  JButton nextButton = new JButton("next ->");
  JButton prevButton = new JButton("<- previous");

  public JFrame prepareGUI() {
    // Configuring JFrame
    windowFrame.setSize(400, 500);
    windowFrame.setLayout(null);
    windowFrame.setTitle("Lands of Eternal Night");
    windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Configuring JPanel
    panelFrame.setLayout(null);
    panelFrame.setBounds(0, 0, 400, 500);
    windowFrame.add(panelFrame);

    // making it visible
    windowFrame.setVisible(true);
    return windowFrame;
  }

  public void addStartGameButton(ActionListener gameStartListener) {
    // Configuring start Button
    startGameButton.setBounds(130, 100, 150, 40);
    panelFrame.add(startGameButton);
    panelFrame.revalidate();
    panelFrame.repaint();

    // Start button action
    startGameButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        int decision = JOptionPane.showConfirmDialog(windowFrame,
            "Do you want to start the game?", "Confirm new Game",
            JOptionPane.YES_NO_OPTION);
        if (decision == JOptionPane.YES_OPTION) {
          gameStartListener.actionPerformed(event);
        } else {
          System.out.println("Exiting the game...");
          System.exit(0);
        }
      }
    });

  }

  public void removeStartGameButton() {
    panelFrame.remove(startGameButton);
    panelFrame.revalidate();
    panelFrame.repaint();
  }

}
