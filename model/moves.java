package Javamon.model;

public interface Moves {
  /*
   * variables to be implemented in each class
   * hp - gives the total hp of the character
   * buffer - gives the buffer hp that is created by defend(), lasts only for one round
   * def_pow - attribute that decides how much hp it can defend
   * atk_pow - attribute that decides how much hp it can reduce from the opponent
   */
  // passing the attack strength of the attacker as an argument and altering the hp of the attacked
  public default void receive_attack(int atk) {
    if (atk > this.buffer) {
      atk -= this.buffer;
      this.hp = this.hp - atk;
    } else {
      this.buffer -= atk;
      System.out.println("defence used");
    }
    // buffer resets to zero after the round regardless of amount used
    this.buffer = 0;
  }

  public default int launch_attack() {
    return this.atk_pow;
  }

  public default void defend() {
    this.buffer = this.def_pow;
  }

  public void special(); // villain uses this for powerup, player uses it for using item
}
