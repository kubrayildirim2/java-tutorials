package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar() {

    }

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    public PriceList getPriceList() throws NoMoreIceCreamException {
        return priceList;
    }

    public void setPriceList(PriceList priceList) throws NoMoreIceCreamException {
        this.priceList = priceList;
    }

    public Stock getStock() throws NoMoreIceCreamException {
        return stock;
    }

    public void setProfit(double profit) throws NoMoreIceCreamException {
        this.profit = profit;
    }

    public void setStock(Stock stock) throws NoMoreIceCreamException {
        this.stock = stock;
    }

    private Cone prepareCone(Flavor[] balls) throws NoMoreIceCreamException {
        if (stock.getCones() <= 0 || stock.getBalls() <= 0)
            throw new NoMoreIceCreamException("No Stock!");
        else {
            stock.setBalls(stock.getBalls() - balls.length);
            stock.setCones(stock.getCones() - 1);
            profit += priceList.getBallPrice();
            return new Cone(balls);

        }

    }


    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        if (stock.getIceRockets() <= 0)
            throw new NoMoreIceCreamException();
        else {
            stock.setIceRockets(stock.getIceRockets() - 1);
            profit += priceList.getRocketPrice();
            return new IceRocket();
        }


    }

    private Magnum prepareMagnum(MagnumType type) throws NoMoreIceCreamException {
        if (stock.getMagni() <= 0)
            throw new NoMoreIceCreamException();
        else {
        stock.setMagni(stock.getMagni()-1);
        profit += priceList.getMagnumStandardPrice(type);

            return new Magnum(type);
    }


    }
    @Override
    public Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException {
        return prepareCone(balls);
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        return prepareIceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {
        return prepareMagnum(type);
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
