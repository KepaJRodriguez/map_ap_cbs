package il.org.yadvashem.map_ap_cbs;

import java.util.HashMap;
import java.util.List;


public class ListMatches {

	public static HashMap<Integer, HashMap<AccessPoint, CorporateBody>> listMatches(List<AccessPoint> accessPoints,
			List<CorporateBody> ehriPersonalities) {

		HashMap<Integer, HashMap<AccessPoint, CorporateBody>> matches = new HashMap<Integer, HashMap<AccessPoint, CorporateBody>>();
		int match_number = 0;
		for (int i = 0; i < accessPoints.size(); i++) {
				AccessPoint ap = accessPoints.get(i);
			for (int idx = 0; idx < ehriPersonalities.size(); idx++) {

				CorporateBody person = ehriPersonalities.get(idx);


					if (AssessMatch.assessMachNameString(ap, person) == true) {
						match_number++;
						HashMap<AccessPoint,CorporateBody> match = new HashMap<AccessPoint,CorporateBody>();
						match.put(ap, person);
						matches.put(match_number, match);
				}

			}

		}

		return matches;
	}
	
}
