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
  int check_attr(int attr);

  // passing the attack strength of the attacker as an argument and altering the hp of the attacked
  public void receive_attack(int atk, int attr);

  public int get_attribute();

  public int launch_attack();

  public int get_hp();

  public int get_def_pow();

  // change default later
  public void defend();

  public String get_name();

  public void special(int opt); // villain uses this for powerup, player uses it for using item
}
