package il.org.yadvashem.map_ap_cbs;

import java.util.List;


import info.debatty.java.stringsimilarity.JaroWinkler;

public class ComputeStringSimilarity {

	public static double computeStringSimilarity(AccessPoint ap, CorporateBody cb) {
		
		double similarity = 0.0;

		JaroWinkler jw = new JaroWinkler();
		String simplified_ap = SymplifyName.simplifyName(ap.getName());
		String simplified_name = SymplifyName.simplifyName( cb.getName());
		similarity = jw.similarity(simplified_ap, simplified_name);

		List<String> aliases = cb.getAliases();
		if (aliases.size() > 0) {
			for (int index = 0; index < aliases.size(); index++) {
				String simplified_alias = SymplifyName.simplifyName(aliases.get(index));
				if (jw.similarity(simplified_ap, simplified_alias) > similarity) {
					similarity = jw.similarity(simplified_ap, simplified_alias);
				}
			}
		}
		return similarity;
	}
	
	
}
