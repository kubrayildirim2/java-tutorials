package be.intecbrussel.application;

import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.MagnumType;

public class IceCreamApp {
    public static void main(String[] args) throws NoMoreIceCreamException {

        PriceList priceList = new PriceList(2,3,4);
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);

        Eatable[] iceCreams = {
                iceCreamSeller.orderMagnum(MagnumType.WHITECHOCOLATE),
                iceCreamSeller.orderMagnum(MagnumType.ALPINENUTS),
                iceCreamSeller.orderMagnum(MagnumType.BLACKCHOCOLATE),
                iceCreamSeller.orderIceRocket(),
                iceCreamSeller.orderIceRocket(),
                iceCreamSeller.orderCone(new Flavor[]{Flavor.PISTACHE, Flavor.STRAWBERY}),
                iceCreamSeller.orderCone(new Flavor[]{Flavor.CHOCOLATE, Flavor.MOKKA, Flavor.LEMON})};

        for (Eatable iceCream: iceCreams) {

            iceCream.eat();
        }

        System.out.println("The total profit is " + iceCreamSeller.getProfit()+" Euro");
    }


    }

