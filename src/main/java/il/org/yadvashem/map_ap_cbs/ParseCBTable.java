package il.org.yadvashem.map_ap_cbs;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class ParseCBTable {

	public static List<CorporateBody> parsePersonalitiesTable(String tablename) throws IOException {

		List<CorporateBody> ehriCBs = new ArrayList<CorporateBody>();

		// read the table of vocabulary-export of ERHI
		CSVReader reader = new CSVReader(new FileReader(tablename));
		String[] nextLine;

		while ((nextLine = reader.readNext()) != null) {
			// nextLine[] is an array of values from the line

			if (nextLine[0].matches("ehri_cb-.*")) {
				CorporateBody person = new CorporateBody();
				List<String> aliases = new ArrayList<String>();
				List<String> dates = new ArrayList<String>();
				person.setID(nextLine[0]);
				person.setName(nextLine[1]);
				if (nextLine[3].length() > 1) {
					aliases = Arrays.asList(nextLine[3].split("\\|"));
				}
				person.setAliases(aliases);
				if (nextLine[3].length() > 1) {
					List<String> dates_row = Arrays.asList(nextLine[5].split("\n"));
					for (int i = 0; i < dates_row.size(); i++) {
						if (dates_row.get(i).length() > 0) {
							dates.add(dates_row.get(i));
						}
					}
				}
				person.setDates(dates);
				ehriCBs.add(person);	
			}
		}
		reader.close();
		return ehriCBs;
	}

	
	
}
