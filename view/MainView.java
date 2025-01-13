import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainView {
  JFrame windowFrame = new JFrame();
  JPanel panelFrame = new JPanel();
  JButton startGameButton = new JButton("Start Game");
  boolean gameStart = false;
  JButton nextButton = new JButton("next ->");
  JButton prevButton = new JButton("<- previous");

  public void prepareGUI() {
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
  }

  public void addStartGameButton() {
    startGameButton.setBounds(130, 100, 150, 40);
    panelFrame.revalidate();
    panelFrame.repaint();
    panelFrame.add(startGameButton);
    startGameButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        int decision = JOptionPane.showConfirmDialog(windowFrame, "Do you want to start the game?", "Confirm new Game",
            JOptionPane.YES_NO_OPTION);

        if (decision == JOptionPane.YES_OPTION) {
          System.out.println("Yes, starting the game...");
          gameStart = true;
          removeStartGameButton();
          createScene("Teste");
        } else {
          System.out.println("Nope, doing nothing");
        }
      }
    });
  }

  public void removeStartGameButton() {
    panelFrame.remove(startGameButton);
    panelFrame.repaint();
  }

  public void addNextButton() {
    nextButton.setBounds(235, 420, 150, 40);
    panelFrame.add(nextButton);
    nextButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        System.out.println("Hello from next button");

      }
    });
  }

  public void addPreviousButton() {
    prevButton.setBounds(5, 420, 150, 40);
    panelFrame.add(prevButton);
    prevButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {

        System.out.println("Hello from previous button");
      }
    });
  }

  public void createScene(String message) {
    addNextButton();
    addPreviousButton();
    System.out.println("Tudo certo até aqui");
  }

}
