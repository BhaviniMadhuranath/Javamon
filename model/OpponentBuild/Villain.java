package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class Villain implements Moves {

  String name;
  int atk_pow;
  int attribute;
  int hp;
  int buffer = 0;
  int def_pow = 0;
  int power_up = 0;

  public Villain() {
    name = "rajkumari";
    attribute = 2;
    hp = 200;
    atk_pow = 15;
    def_pow = 4;
    power_up = 2;
  }

  @Override
  public void special(int opt) {
    // this increases the attack power of the villain
    this.atk_pow += this.power_up;
  }
}
