package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class Kokomelon implements Moves {

  int atk_pow;
  int attribute;
  String name;
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

  public Kokomelon() {
    name = "Kokomelon";
    attribute = 0;
    atk_pow = 9;
    hp = 75;
  }
}
