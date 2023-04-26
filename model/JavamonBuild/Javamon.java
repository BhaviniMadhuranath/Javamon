package Javamon.model.JavamonBuild;

interface javamonPlan {
    public void setName(String name);
    public void setHP(int hp);
    public void setAttackPower(int atk_pow);
    public void setAttribute(int attribute);
    public void setLevel(int level);
    public void setBuffer(int buffer);
    public void setDefencePower(int def_pow);    
}

public class Javamon implements javamonPlan
{
    public String name;
    public int hp;
    public int atk_pow;
    public int attribute;
    public int level;
    public int buffer;
    public int def_pow;
//    public int skinpotion=0;
//    public int healthpotion=0;
//    public int strengthpotion=0;
//    public boolean shield=false;
//    public boolean sword=false;


    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setHP(int hp)
    {
        this.hp=hp;
    }

    public int getHP()
    {
        return this.hp;
    }

    public void setAttackPower(int atk_pow)
    {
        this.atk_pow=atk_pow;
    }
    public void setAttribute(int attribute)
    {
        this.attribute=attribute;
    }
    public void setLevel(int level)
    {
        this.level=level;
    }
    public void setBuffer(int buffer)
    {
        this.buffer=buffer;
    }
    
    public void setDefencePower(int def_pow)
    {
        this.def_pow=def_pow;
    }

}
