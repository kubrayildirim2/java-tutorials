package be.intecbrussel.eatables;

public class Magnum implements Eatable{

    private MagnumType type;

    public void setType(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() {
        return this.type;
    }

    public Magnum() {

    }

    public Magnum(MagnumType type){

        this.type = type;
    }

    @Override

    public void eat() {
        System.out.println("You can eat your "+ this.type+ " Magnum" );
    }

    
    }


