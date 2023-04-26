package Javamon.model.JavamonBuild;
import java.util.Random;
import Javamon.model.Moves;
import Javamon.model.ItemBuild.HealthPotion;
import Javamon.model.ItemBuild.StrengthPotion;
import Javamon.model.PlayerBuild.Player;
import Javamon.model.WeaponBuild.Sword;
import Javamon.model.WeaponBuild.Shield;
import Javamon.model.ItemBuild.SkinPotion;

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
    Player player = Player.getPlayer();

    public MainJavamon(int level) {
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
           one = new ved();
        }
        // this.javamon = one.getJavamon();
        selector selectone = new selector(one);
        selectone.constructJavamon();
        this.javamon = selectone.getJavamon();
        // return javamon;
      }

      public Javamon getJavamon() {
        return this.javamon;
      }

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
      public int get_atk_pow()
      {
        return javamon.atk_pow;
      }
      public int get_attribute()
      {
        return javamon.attribute;
      }
      public int launch_attack() {
        return javamon.atk_pow;
      }
      public int get_hp() {
        return javamon.hp;
      }
    
      public int get_def_pow() {
        return javamon.def_pow;
      }
    
      // change default later
      public void defend() {
        javamon.buffer = javamon.def_pow;
      }
    
      public String get_name() {
        return javamon.name;
      }

      @Override
      public void special(int opt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'special'");
      }

public void WeaponUse(int choice)
      {
      if (choice==0)
      { 
          if(player.shield)
          {
          System.out.println("No shield available");
          }
      else
          {
          Shield inc_def=new Shield();
          javamon.def_pow+=inc_def.increase_defpower();
          }
      }
      if (choice==1)
      { 
          if(player.sword)
          {
          System.out.println("No sword available");
          }
      else
          {
          Sword inc_attk=new Sword();
          javamon.atk_pow+=inc_attk.increase_atkpower();
          }
        }
      }

      public void ItemPowerUp(int choice) {

        if (choice==0)
        { 
            if(player.healthpotion==0)
            {
            System.out.println("No potions");
            }
        else
            {
            HealthPotion addi_hp=new HealthPotion();
            javamon.hp+=addi_hp.increase_hp();
            }
        }
        if (choice==1)
        {            
          if(player.skinpotion==0)
          {
          System.out.println("No potions");
          }
          else
          {
          SkinPotion addi_def=new SkinPotion();
          javamon.hp+=addi_def.increase_defpower();
          }
        }
        if (choice==2)
        {
          if(player.strengthpotion==0)
          {
          System.out.println("No potions");
          }
          else
          {
          StrengthPotion addi_attck=new StrengthPotion();
          javamon.hp+=addi_attck.increase_atkpower();
          }
        }
        
      
      }




  

    
}
