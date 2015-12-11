
public class AssemblyLine implements IAssemblyLine {
	 public AssemblyLine(){
	        System.out.println("Create assembly line");
	    }
	 
	 ILineStep stepHousing = new LineStepHousing();
	 ILineStep stepRefill = new LineStepRefill();
	 ILineStep stepSpring = new LineStepSpring();
	 
	 
	    public IProduct assembleProduct(IProduct product) {
	        product.installFirstPart(stepHousing.buildProductPart());
	        product.installSecondPart(stepRefill.buildProductPart());
	        product.installThirdPart(stepSpring.buildProductPart());
	        System.out.println("Ball pen is ready!");
	        return product;
	    }
}
