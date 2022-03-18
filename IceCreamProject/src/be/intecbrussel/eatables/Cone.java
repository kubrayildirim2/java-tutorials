package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{

    private Flavor[] balls;

    public Cone(){
    }
    public Cone (Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {

        System.out.println("You can eat your cone with " + Arrays.toString(balls)+" balls");

    }
}
