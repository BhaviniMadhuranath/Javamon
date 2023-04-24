package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class YakYak implements Moves {

  String name;
  int attribute;
  int atk_pow;
  int hp;

  @Override
  public int check_attr(int attr) {
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

  @Override
  public void receive_attack(int atk, int attr) {
    int factor = check_attr(attr);
    atk = atk + factor;
    this.hp = this.hp - atk;
    // buffer resets to zero after the round regardless of amount used
  }

  @Override
  public void special(int opt) {
    System.out.println("Does not have special powers");
  }

  @Override
  public void defend() {
    System.out.println("Does not have defensive powers");
  }

  public int launch_attack() {
    return this.atk_pow;
  }

  public int get_hp() {
    return this.hp;
  }

  public int get_def_pow() {
    return -1;
  }

  // change default later
  public String get_name() {
    return this.name;
  }

  public YakYak() {
    name = "YakYak";
    attribute = 2;
    atk_pow = 8;
    hp = 70;
  }
}
