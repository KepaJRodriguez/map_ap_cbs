package il.org.yadvashem.map_ap_cbs;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class ParseAccessPointsTable {
	public static List<String> readAccessPointsTable(String tablename) throws IOException {
		List<String> namesOfCBs = new ArrayList<String>();

		CSVReader reader = new CSVReader(new FileReader(tablename));
		String[] nextLine;

		while ((nextLine = reader.readNext()) != null) {

			namesOfCBs.add(nextLine[0]);

		}
		reader.close();
		return namesOfCBs;
	}

}
