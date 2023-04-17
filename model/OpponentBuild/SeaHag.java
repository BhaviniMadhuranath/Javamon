package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class SeaHag implements Moves {

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

  public SeaHag() {
    name = "SeaHag";
    attribute = 0;
    atk_pow = 10;
    hp = 80;
  }
}
