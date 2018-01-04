package il.org.yadvashem.map_ap_cbs;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class ParseAccessPointsTable {
	public static List<AccessPoint> readAccessPointsTable(String tablename) throws IOException {
		List<AccessPoint> namesOfCBs = new ArrayList<AccessPoint>();

		CSVReader reader = new CSVReader(new FileReader(tablename));
		String[] nextLine;

		while ((nextLine = reader.readNext()) != null) {
			AccessPoint ap = new AccessPoint();
			ap.setName(nextLine[0]);
			ap.setSource(nextLine[1]);
			ap.setAuthFileNumber(nextLine[2]);
			
			namesOfCBs.add(ap);

		}
		reader.close();
		return namesOfCBs;
	}

}
