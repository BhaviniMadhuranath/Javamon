package TextRPG;
//builder design pattern
interface javamonPlan {
public void setName(String name);
public void setHP(int hp);
public void setAttackPower(int atk_pow);
public void setAttribute(int attribute);
public void setLevel(int level);
}

//0-fire
//1-water
//2-grass
class Javamon implements javamonPlan
{
    public String name;
    public int hp;
    public int atk_pow;
    public int attribute;
    public int level;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setHP(int name)
    {
        this.hp=hp;
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
}

interface javamonBuilder
{
    public void buildName();
    public void buildHp();
    public void buildAttackPower();
    public void buildAttribute();
    public void buildLevel();
    public Javamon getJavamon();
 
}

class googul implements javamonBuilder
{
    private Javamon javamon;
    public googul()
    {
        this.javamon= new Javamon();
    }
    public void buildName() {
        javamon.setName("Googul"); 
    }
    public void buildHp()
    {
        javamon.setHP(50);
    }
    public void buildAttackPower()
    {
        javamon.setAttackPower(10);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(2);
    }
    public void buildLevel()
    {
        javamon.setLevel(1);
    }
    public Javamon getJavamon()
    {
        return this.javamon;
    }
}

class panda implements javamonBuilder
{
    private Javamon javamon;
    public panda()
    {
        this.javamon= new Javamon();
    }
    public void buildName() {
        javamon.setName("Panda"); 
    }
    public void buildHp()
    {
        javamon.setHP(70);
    }
    public void buildAttackPower()
    {
        javamon.setAttackPower(5);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(2);
    }
    public void buildLevel()
    {
        javamon.setLevel(1);
    }
    public Javamon getJavamon()
    {
        return this.javamon;
    }
}
class pokirimaan implements javamonBuilder
{
    private Javamon javamon;
    public pokirimaan()
    {
        this.javamon= new Javamon();
    }
    public void buildName() {
        javamon.setName("Pokirimaan"); 
    }
    public void buildHp()
    {
        javamon.setHP(70);
    }
    public void buildAttackPower()
    {
        javamon.setAttackPower(13);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(1);
    }
    public void buildLevel()
    {
        javamon.setLevel(3);
    }
    public Javamon getJavamon()
    {
        return this.javamon;
    }
}
class bumblebee implements javamonBuilder
{
    private Javamon javamon;
    public bumblebee()
    {
        this.javamon= new Javamon();
    }
    public void buildName() {
        javamon.setName("BumbleBee"); 
    }
    public void buildHp()
    {
        javamon.setHP(70);
    }
    public void buildAttackPower()
    {
        javamon.setAttackPower(17);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(2);
    }
    public void buildLevel()
    {
        javamon.setLevel(3);
    }
    public Javamon getJavamon()
    {
        return this.javamon;
    }
}
class chotmensinkai implements javamonBuilder
{
    private Javamon javamon;
    public chotmensinkai()
    {
        this.javamon= new Javamon();
    }
    public void buildName() {
        javamon.setName("Chotmensinkai"); 
    }
    public void buildHp()
    {
        javamon.setHP(40);
    }
    public void buildAttackPower()
    {
        javamon.setAttackPower(12);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(0);
    }
    public void buildLevel()
    {
        javamon.setLevel(2);
    }
    public Javamon getJavamon()
    {
        return this.javamon;
    }
}
class ved implements javamonBuilder
{
    private Javamon javamon;
    public ved()
    {
        this.javamon= new Javamon();
    }
    public void buildName() {
        javamon.setName("Ved"); 
    }
    public void buildHp()
    {
        javamon.setHP(80);
    }
    public void buildAttackPower()
    {
        javamon.setAttackPower(20);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(0);
    }
    public void buildLevel()
    {
        javamon.setLevel(5);
    }
    public Javamon getJavamon()
    {
        return this.javamon;
    }
}

class selector
{
    private javamonBuilder javamonbuilder;

    public selector(javamonBuilder javamonbuilder)
    {
        this.javamonbuilder=javamonbuilder;
    }

    public Javamon getJavamon()
    {
        return this.javamonbuilder.getJavamon();
    }
    public void contructJavamon()
    {
        this.javamonbuilder.buildAttackPower();
        this.javamonbuilder.buildAttribute();
        this.javamonbuilder.buildHp();
        this.javamonbuilder.buildName();
        this.javamonbuilder.buildLevel();
    }
}


