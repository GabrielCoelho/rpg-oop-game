public class MainApp {
  public static void main(String[] args) {
    MainController game = new MainController();
    Character player = new Character();
    CharacterController playerController = new CharacterController(player);
    CharacterView playerView = new CharacterView(player);
    game.initializeGame(playerController);
  }
}
