
public class LineStepSpring implements ILineStep{
	 public LineStepSpring(){
	        System.out.println("Created line step spring");
	    }

	    public IProductPart buildProductPart(){
	        return new ProductPartSpring();
	    }
}
