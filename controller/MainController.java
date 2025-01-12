/**
 * MainController
 * Storyline goes here
 */
public class MainController {
  MainView window = new MainView();

  public void initializeGame(CharacterController player) {
    MainView windowView = new MainView();
    windowView.prepareGUI();
    windowView.addStartGameButton();
  }

}
