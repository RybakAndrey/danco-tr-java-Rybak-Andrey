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
			if(Character.isLowerCase(s.charAt(0))){
				s = s.replaceFirst(Character.toString(s.charAt(0)), Character.toString(Character.toUpperCase(s.charAt(0))));
				System.out.println(s);
				sb.append(s + " ");
			}
			else{
				sb.append(s + " ");
			}
		}
		System.out.println(sb);
	}
}
