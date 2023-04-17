package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class YakYak implements Moves {

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

  public YakYak() {
    name = "YakYak";
    attribute = 2;
    atk_pow = 8;
    hp = 70;
  }
}
