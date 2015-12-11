
public class LineStepHousing implements ILineStep{
	public LineStepHousing(){
        System.out.println("Created line step housing");
    }
    public IProductPart buildProductPart(){
        return new ProductPartHousing();
    }
}
