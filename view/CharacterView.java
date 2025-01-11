public class CharacterView {
  protected Character character;

  public CharacterView(Character character) {
    this.character = character;
  }

  public void showCharacterStats(CharacterController character) {
    System.out.println("Char: " + character.getName());
    System.out.println("HP: " + character.getHealth_points());
    System.out.println("MP: " + character.getMana_points());

  }
}
