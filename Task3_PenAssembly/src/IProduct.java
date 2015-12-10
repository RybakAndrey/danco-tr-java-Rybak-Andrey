
public interface IProduct {
	
	public void installFirstPart(IProductPart firstProductPart);
    public void installSecondPart(IProductPart secondProductPart);
    public void installThirdPart(IProductPart thirdProductPart);
    public IProductPart getFirstProductPart();
    public IProductPart getSecondProductPart();
    public IProductPart getThirdProductPart();
}
