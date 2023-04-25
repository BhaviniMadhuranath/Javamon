package Javamon.model.OpponentBuild;

import Javamon.model.Moves;
import java.util.Random;
public class OpponentFactory {

  Random rand = new Random();
  int rand_int = rand.nextInt(2);

  public Moves getOpponent(int level) {
    // level 1
    if (level == 1) {
      if (rand_int == 0) {
        return new Pinguva();
      } else {
        return new Sneko();
      }
    }
    if (level == 2) {
      if (rand_int == 0) {
        return new Stylo();
      } else {
        return new YakYak();
      }
    }
    if (level == 3) {
      if (rand_int == 0) {
        return new ShaolinMan();
      } else {
        return new Kokomelon();
      }
    }
    if (level == 4) {
      if (rand_int == 0) {
        return new SeaHag();
      } else {
        return new Singma();
      }
    }
    if (level == 5) {
      return new Villain();
    }
    return null;
  }
}
