
public class AssemblyLine implements IAssemblyLine {
	 public AssemblyLine(){
	        System.out.println("Create assembly line");
	    }
	 
	    public IProduct assembleProduct(IProduct product) {
	        product.installFirstPart(product.getSecondProductPart());
	        System.out.println("Ball pen is ready!");
	        return product;
	    }
}
