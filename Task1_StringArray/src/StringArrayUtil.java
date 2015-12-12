public class StringArrayUtil {
	
	public void getString(String[] stringArray){
		
		String tempString;
		StringBuilder sb = new StringBuilder();
		
		for(String s: stringArray){
			sb = sb.append(s + " ");	
		}
		
		tempString = sb.toString();
		
		sb.delete(0, sb.length());
		
		for(String s: tempString.split(" ")){
			if(Character.isUpperCase(s.charAt(0))){
				sb.append(s + " ");
			}		
			
		}
		System.out.println(sb);
	}
}
