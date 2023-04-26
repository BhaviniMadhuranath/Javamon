package Javamon.model.PlayerBuild;

//singleton desgin pattern
public class Player {
    String name;
    int score;
    public int skinpotion=0;
    public int healthpotion=0;
    public int strengthpotion=0;
    public boolean shield=false;
    public boolean sword=false;



    //create an object of Player
    private static Player player = new Player();

    //constructor private
    private Player(){}

    //Get the only object available
    public static Player getPlayer(){
        return player;
    }

    public void set_itemsforjavamon(int ch)
    {
      if (ch==0)
      {
        player.healthpotion+=1;
      }
      if (ch==1)
      {
        player.skinpotion+=1;

      }
      if (ch==2)
      {
        player.strengthpotion+=1;
      }
    }
//0 for healthpotion -hp
//1 for skinpotion- defence power
//2 for strength potion- attack power



//0 for shield
//1 for sword
      public void set_weapons(int ch)
      {
        if (ch==0)
        {
          player.shield=true;
        }
        if (ch==1)
        {
          player.sword=true;
        }
      
    }

        
    }


    
