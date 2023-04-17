package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class ShaolinMan implements Moves {

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

  public ShaolinMan() {
    name = "ShaolinMan";
    attribute = 1;
    atk_pow = 9;
    hp = 75;
  }
}
