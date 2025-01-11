public class CharacterController {
  private Character playerChar;

  public CharacterController(Character newChar) {
    this.playerChar = newChar;
  }

  // Getters and Setters for Model
  public String getName() {
    return playerChar.name;
  }

  public float getMana_points() {
    return playerChar.mana_points;
  }

  public float getHealth_points() {
    return playerChar.health_points;
  }

  public void setName(String name) {
    playerChar.name = name;
  }

  public void setMana_points(float mana_points) {
    playerChar.mana_points = mana_points;
  }

  public void setHealth_points(float health_points) {
    playerChar.health_points = health_points;
  }

  // View

  // Sub class
}
