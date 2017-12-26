package il.org.yadvashem.map_ap_cbs;

import java.util.HashMap;
import java.util.List;


public class ListMatches {

	public static HashMap<String, String> listMatches(List<String> accessPoints,
			List<CorporateBody> ehriPersonalities) {

		HashMap<String, String> matches = new HashMap<String, String>();

		for (int i = 0; i < accessPoints.size(); i++) {
				String ap = accessPoints.get(i);
			for (int idx = 0; idx < ehriPersonalities.size(); idx++) {

				CorporateBody person = ehriPersonalities.get(idx);


					if (AssessMatch.assessMachNameString(ap, person) == true) {
						matches.put(ap, person.getName());
						System.out.println(ap + "\t----\t" + person.getName());

				}

			}

		}

		return matches;
	}
	
}
