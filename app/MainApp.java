public class MainApp {
  public static void main(String[] args) {
    Character player = new Character();
    CharacterController playerController = new CharacterController(player);
    CharacterView playerView = new CharacterView(player);

    playerController.setName("Astarion");
    playerController.setMana_points(50);
    playerController.setHealth_points(100);
    playerView.showCharacterStats(playerController);
  }
}
