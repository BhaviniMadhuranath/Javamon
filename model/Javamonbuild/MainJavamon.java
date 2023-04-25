package Javamon.model.JavamonBuild;
import java.util.Random;
import Javamon.model.Moves;

public class MainJavamon implements Moves {

    Random rand = new Random();
    int rand_int = rand.nextInt(2);
    // public static void main(String[] args) {
    // javamonBuilder one=new bumblebee();
    // selector selectone= new selector(one);

    // selectone.contructJavamon();

    // Javamon javamon=selectone.getJavamon();

    // System.out.println("Javamon hahaha "+ javamon.name);

    // }
    Javamon javamon;
    javamonBuilder one;

    public Javamon MainJavamon(int level) {
        // level 1
        if (level == 1) {
          one = new googul();
        }
        if (level == 2) {
          one = new panda();
        }
        if (level == 3) {
             one = new pokirimaan();
        }
        if (level == 4) {
             one = new bumblebee();
        }
        if (level == 5) {
           one = new chotmensinkai();
        }
        
        selector selectone = new selector(one);
        selectone.constructJavamon();
        Javamon javamon = selectone.getJavamon();
        return javamon;
      }

      @Override
      public int check_attr(int attr) {
        if (javamon.attribute == 0 && attr == 1) {
          return 5;
        } else if (javamon.attribute == 1 && attr == 2) {
          return 5;
        }
        if (javamon.attribute == 2 && attr == 0) {
          return 5;
        }
        return 0;
      }

      @Override
      public void receive_attack(int atk, int attr) {
        int factor = check_attr(attr);
        atk = atk + factor;
        if (atk > javamon.buffer) {
          atk -= javamon.buffer;
          javamon.hp = javamon.hp - atk;
        } else {
          javamon.buffer -= atk;
          System.out.println("defence used");
        }
        // buffer resets to zero after the round regardless of amount used
        javamon.buffer = 0;
      }
      @Override
      public int launch_attack() {
        return javamon.atk_pow;
      }
      @Override
      public int get_hp() {
        return javamon.hp;
      }
    
      @Override
      public int get_def_pow() {
        return javamon.def_pow;
      }
    
      @Override
      // change default later
      public void defend() {
        javamon.buffer = javamon.def_pow;
      }
    
      @Override
      public String get_name() {
        return javamon.name;
      }

      @Override
      public void special(int opt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'special'");
      }
    
        



  

    
}
