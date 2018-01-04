package il.org.yadvashem.map_ap_cbs;



public class AssessMatch {

	public static boolean assessMachNameString(AccessPoint ap, CorporateBody cb){
		boolean isMatch = false;
	
		double stringSimilarity = ComputeStringSimilarity.computeStringSimilarity(ap, cb);
		if (stringSimilarity >= .95) {
			isMatch = true;
		}
		
		return isMatch;
	}
	
	
}
