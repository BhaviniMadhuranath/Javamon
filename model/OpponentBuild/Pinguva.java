package Javamon.model.OpponentBuild;

import Javamon.model.Moves;

public class Pinguva implements Moves {

  String name;
  int atk_pow;
  int attribute;
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

  public Pinguva() {
    name = "Pinguva";
    attribute = 0;
    atk_pow = 7;
    hp = 60;
  }
}
