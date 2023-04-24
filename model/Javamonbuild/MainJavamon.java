package Javamon.model.Javamonbuild;

import java.util.Random;

public class MainJavamon {

    Random rand = new Random();
    int rand_int = rand.nextInt(2);
    // public static void main(String[] args) {
    // javamonBuilder one=new bumblebee();
    // selector selectone= new selector(one);

    // selectone.contructJavamon();

    // Javamon javamon=selectone.getJavamon();

    // System.out.println("Javamon hahaha "+ javamon.name);

    // }

    public Javamon getOpponent(int level) {
        // level 1
        javamonBuilder one;
        if (level == 1) {
            one = new googul();
        }
        if (level == 2) {
            one = new googul();
        }
        if (level == 3) 
            {
                one = new googul();
            }
            if (level == 4) {
                one = new googul();
            }
            if (level == 5) {
                one = new googul();
            }

            selector selectone = new selector(one);
            selectone.contructJavamon();

            Javamon javamon = selectone.getJavamon();
            return javamon;
        

    }
}
