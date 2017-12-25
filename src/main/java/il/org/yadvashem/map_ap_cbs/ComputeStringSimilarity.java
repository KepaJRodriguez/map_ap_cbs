package il.org.yadvashem.map_ap_cbs;

import java.util.List;

import info.debatty.java.stringsimilarity.JaroWinkler;

public class ComputeStringSimilarity {

	public static double computeStringSimilarity(String ap, CorporateBody cb) {
		
		double similarity = 0.0;

		JaroWinkler jw = new JaroWinkler();
		similarity = jw.similarity(ap, cb.getName());

		List<String> aliases = cb.getAliases();
		if (aliases.size() > 0) {
			for (int index = 0; index < aliases.size(); index++) {
				if (jw.similarity(ap, aliases.get(index)) > similarity) {
					similarity = jw.similarity(ap, aliases.get(index));
				}
			}
		}
		return similarity;
	}
	
	
}
