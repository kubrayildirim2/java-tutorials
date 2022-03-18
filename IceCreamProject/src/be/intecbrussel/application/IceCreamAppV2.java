package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2  {
    public static void main(String[] args) throws NoMoreIceCreamException {

        PriceList priceList = new PriceList(2, 3, 4);
        Stock stock = new Stock(0, 0, 0, 0);
        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList, stock);


        try {
            Eatable[] iceCreams = {
                    iceCreamSeller.orderMagnum(MagnumType.WHITECHOCOLATE),
                    iceCreamSeller.orderMagnum(MagnumType.ALPINENUTS),
                    iceCreamSeller.orderMagnum(MagnumType.BLACKCHOCOLATE),
                    iceCreamSeller.orderIceRocket(),
                    iceCreamSeller.orderIceRocket(),
                    iceCreamSeller.orderCone(new Flavor[]{Flavor.PISTACHE, Flavor.STRAWBERY}),
                    iceCreamSeller.orderCone(new Flavor[]{Flavor.CHOCOLATE, Flavor.MOKKA, Flavor.LEMON})};

            for (Eatable iceCream : iceCreams) {

                iceCream.eat();
            }

            System.out.println("The total profit is: " + iceCreamSeller.getProfit() + " Euro");

        } catch (NoMoreIceCreamException e) {
            System.out.println("No Stock!");
            System.out.println(" e.getMessage()");


        }

    }
}