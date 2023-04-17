package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class Sneko implements Moves {

  String name;
  int attribute;
  int atk_pow;
  int hp;

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

  public Sneko() {
    name = "Sneko";
    attribute = 1;
    atk_pow = 7;
    hp = 60;
  }
}
