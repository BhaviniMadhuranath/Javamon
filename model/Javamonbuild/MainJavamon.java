package Javamon.model.JavamonBuild;
import java.util.HashSet;
import java.util.Random;
import Javamon.model.Moves;
import Javamon.model.ItemBuild.HealthPotion;
import Javamon.model.ItemBuild.StrengthPotion;
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
    

      public void set_itemsforjavamon(int ch)
      {
        if (ch==0)
        {
          javamon.healthpotion+=1;
        }
        if (ch==1)
        {
          javamon.skinpotion+=1;

        }
        if (ch==2)
        {
          javamon.strengthpotion+=1;
        }
      }
//0 for healthpotion -hp
//1 for skinpotion- defence power
//2 for strength potion- attack power


      public void ItemPowerUp(int choice) {

        if (choice==0)
        { 
            if(javamon.healthpotion==0)
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
          if(javamon.skinpotion==0)
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
          if(javamon.strengthpotion==0)
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
//0 for shield
//1 for sword
        public void set_weapons(int ch)
        {
          if (ch==0)
          {
            javamon.shield=true;
          }
          if (ch==1)
          {
            javamon.sword=true;
          }
        
      }
        
public void WeaponUse(int choice)
{
  if (choice==0)
  { 
      if(javamon.shield)
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
      if(javamon.sword)
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


  

    
}
