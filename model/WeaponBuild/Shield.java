package Javamon.model.WeaponBuild;

import Javamon.model.PowerUp;

public class Shield implements PowerUp{

    @Override
    public int increase_hp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'increase_hp'");
    }

    @Override
    public int increase_atkpower() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'increase_atkpower'");
    }

    @Override
    public int increase_defpower() {
        return 10;
    }
    
}
