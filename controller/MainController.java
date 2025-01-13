import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * MainController
 * Storyline goes here
 */
public class MainController {
  protected JFrame window;

  public void initializeGame(CharacterController player) {
    MainView windowView = new MainView();
    window = windowView.prepareGUI();
    ScenesView scenes = new ScenesView(window);
    windowView.addStartGameButton(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        windowView.removeStartGameButton();
        System.out.println("Game started!...");
        window.add(scenes.addNextButton());
        window.add(scenes.addPreviousButton());
        window.revalidate();
        window.repaint();
        scenes.createNewScene();

      }
    });
  }

}
