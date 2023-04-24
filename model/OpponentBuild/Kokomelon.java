package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class Kokomelon implements Moves {

  int atk_pow;
  int attribute;
  String name;
  // int buffer;
  int hp;

  @Override
  int check_attr(int attr) {
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

  @Override
  public void special() {
    System.out.println("Does not have special powers");
  }

  @Override
  public void receive_attack(int atk) {
    this.hp -= atk;
  }

  @Override
  public void defend() {
    System.out.println("Does not have defensive powers");
  }
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

  public Kokomelon() {
    name = "Kokomelon";
    attribute = 0;
    atk_pow = 9;
    hp = 75;
  }
}
