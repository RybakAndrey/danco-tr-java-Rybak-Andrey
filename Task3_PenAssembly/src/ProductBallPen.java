
public class ProductBallPen implements IProduct {
    private IProductPart housing;
    private IProductPart refill;
    private IProductPart spring;

    public ProductBallPen(IProductPart housing, IProductPart refill, IProductPart spring){
        this.housing = housing;
        this.refill = refill;
        this.spring = spring;
        System.out.println("Create product 'Ball pen'");
    }
    public void installFirstPart(IProductPart firstProductPart) {
        System.out.println("Install housing");
    }

    public void installSecondPart(IProductPart secondProductPart) {
        System.out.println("Install refill");
    }

    public void installThirdPart(IProductPart thirdProductPart) {
        System.out.println("Install spring");
    }

    public IProductPart getFirstProductPart(){
        return housing;
    }
    public IProductPart getSecondProductPart(){
        return refill;
    }
    public IProductPart getThirdProductPart(){
        return spring;
    }
}
