
public class Main {
	public static void main(String[] args) {
		/* ILineStep lineStepHousing = new LineStepHousing();
	     ILineStep lineStepSpring = new LineStepSpring();
	     ILineStep lineStepRefill = new LineStepRefill();

	     IProductPart productPartHousing = lineStepHousing.buildProductPart();
	     IProductPart productPartSpring = lineStepSpring.buildProductPart();
	     IProductPart productPartRefill = lineStepRefill.buildProductPart();
		*/
	     IProduct ballPen = new ProductBallPen();
		
	     IAssemblyLine assemblyLine = new AssemblyLine();
	     assemblyLine.assembleProduct(ballPen);	
	}

}
