package Javamon.model;

public interface Moves {
  /*
   * variables to be implemented in each class
   * hp - gives the total hp of the character
   * buffer - gives the buffer hp that is created by defend(), lasts only for one round
   * def_pow - attribute that decides how much hp it can defend
   * atk_pow - attribute that decides how much hp it can reduce from the opponent
   */

  /*
   * attributes
   * fire (0) - beats grass
   * water (1)- beats fire
   * grass (2) - beats water
   */
  public default int check_attr(int attr) {
    if (this.attribute == 0 && attr == 1) {
      return 5;
    } else if (this.attribute == 1 && attr == 2) {
      return 5;
    }
    if (this.attribute == 2 && attr == 0) {
      return 5;
    }
    return 0;
  }

  // passing the attack strength of the attacker as an argument and altering the hp of the attacked
  public default void receive_attack(int atk, int attr) {
    int factor = check_attr(attr);
    atk = atk + factor;
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
  error: cannot find symbol
  this.buffer -= atk;
  public default int get_hp() {
    return this.hp;
  }

  public default int get_def_pow() {
    return this.def_pow;
  }

  // change default later
  public default void defend() {
    this.buffer = this.def_pow;
  }

  public default String get_name() {
    return this.name;
  }

  public void special(int opt); // villain uses this for powerup, player uses it for using item
}
