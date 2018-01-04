package il.org.yadvashem.map_ap_cbs;

public class SymplifyName {
	
	public static String simplifyName(String name){
		
		String simplifiedName = "";
		
		simplifiedName = name.replaceAll(" ", "").toLowerCase();
				
		return simplifiedName;
	}
	
}
