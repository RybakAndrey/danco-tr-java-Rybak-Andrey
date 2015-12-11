
public class LineStepRefill implements ILineStep{
	public LineStepRefill(){
        System.out.println("Created line step refill");
    }

    public IProductPart buildProductPart(){
        return new ProductPartRefill();
    }
}
