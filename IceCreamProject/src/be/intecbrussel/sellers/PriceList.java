package be.intecbrussel.sellers;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {
    double ballPrice;
    double rocketPrice;
    double magnumStandardPrice;


    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumStandardPrice(MagnumType type) {

        switch (type) {
            case ALPINENUTS :
                return magnumStandardPrice*1.5;
            case MILKCHOCOLATE:
                return magnumStandardPrice*2;
            case WHITECHOCOLATE:
                return magnumStandardPrice*2.5;
            default:
                return magnumStandardPrice;
        }
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {

        this.magnumStandardPrice = magnumStandardPrice;
    }
}
