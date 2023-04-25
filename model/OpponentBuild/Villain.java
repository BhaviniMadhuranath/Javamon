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
    hp = 150;
    atk_pow = 10;
    def_pow = 4;
    power_up = 2;
  }

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

  // passing the attack strength of the attacker as an argument and altering the hp of the attacked
  public void receive_attack(int atk, int attr) {
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

  public int launch_attack() {
    return this.atk_pow;
  }

  public int get_attribute() {
    return this.attribute;
  }

  public int get_hp() {
    return this.hp;
  }

  public int get_def_pow() {
    return this.def_pow;
  }

  // change default later
  public void defend() {
    this.buffer = this.def_pow;
  }

  public String get_name() {
    return this.name;
  }

  public void special(int opt) {
    // this increases the attack power of the villain
    this.atk_pow += this.power_up;
  }
}
