package Javamon.model.JavamonBuild;
//builder design pattern


//0-fire
//1-water
//2-grass


interface javamonBuilder
{
    public void buildName();
    public void buildHp();
    public void buildAttackPower();
    public void buildAttribute();
    public void buildLevel();
    public void buildBuffer();
    public void buildDefencePower();

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
        javamon.setHP(60);
    }
    public void buildAttackPower()
    {
        javamon.setAttackPower(8);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(2);
    }
    public void buildLevel()
    {
        javamon.setLevel(1);
    }
    public void buildBuffer()
    {
        javamon.setBuffer(0);
    }
    public void buildDefencePower()
    {
        javamon.setDefencePower(10);
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
        javamon.setAttackPower(9);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(2);
    }
    public void buildLevel()
    {
        javamon.setLevel(2);
    }
    public void buildBuffer()
    {
        javamon.setBuffer(0);
    }
    public void buildDefencePower()
    {
        javamon.setDefencePower(12);
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
        javamon.setHP(80);
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
    public void buildBuffer()
    {
        javamon.setBuffer(0);
    }
    public void buildDefencePower()
    {
        javamon.setDefencePower(15);
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
        javamon.setHP(80);
    }
    public void buildAttackPower()
    {
        javamon.setAttackPower(14);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(2);
    }
    public void buildLevel()
    {
        javamon.setLevel(4);
    }
    public void buildBuffer()
    {
        javamon.setBuffer(0);
    }
    public void buildDefencePower()
    {
        javamon.setDefencePower(17);
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
        javamon.setHP(90);
    }
    public void buildAttackPower()
    {
        javamon.setAttackPower(15);
    }
    public  void buildAttribute()
    {
        javamon.setAttribute(0);
    }
    public void buildLevel()
    {
        javamon.setLevel(5);
    }
    public void buildBuffer()
    {
        javamon.setBuffer(0);
    }
    public void buildDefencePower()
    {
        javamon.setDefencePower(18);
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
        javamon.setHP(90);
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
    public void buildBuffer()
    {
        javamon.setBuffer(0);
    }
    public void buildDefencePower()
    {
        javamon.setDefencePower(19);
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
    public void constructJavamon()
    {
        this.javamonbuilder.buildAttackPower();
        this.javamonbuilder.buildAttribute();
        this.javamonbuilder.buildHp();
        this.javamonbuilder.buildName();
        this.javamonbuilder.buildLevel();
        this.javamonbuilder.buildBuffer();
        this.javamonbuilder.buildDefencePower();

    }
}


