package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class Pinguva implements Moves {

  String name;
  int atk_pow;
  int attribute;
  int hp;

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

  public void receive_attack(int atk, int attr) {
    int factor = check_attr(attr);
    atk = atk + factor;
    this.hp = this.hp - atk;
    // buffer resets to zero after the round regardless of amount used
  }

  public void special(int opt) {
    System.out.println("Does not have special powers");
  }

  public void defend() {
    System.out.println("Does not have defensive powers");
  }

  public int get_hp() {
    return this.hp;
  }

  public int get_def_pow() {
    return -1;
  }

  public int launch_attack() {
    return this.atk_pow;
  }

  // change default later
  public String get_name() {
    return this.name;
  }

  public Pinguva() {
    name = "Pinguva";
    attribute = 0;
    atk_pow = 7;
    hp = 60;
  }
}
