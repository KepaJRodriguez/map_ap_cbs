package il.org.yadvashem.map_ap_cbs;

import java.io.IOException;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
		String ehriTable = args[0];
		String apTable = args[1];
		
		List<CorporateBody> ehriPersonalities = ParseCBTable.parseCBsTable(ehriTable);
		List<String> accessPoints = ParseAccessPointsTable.readAccessPointsTable(apTable);
		ListMatches.listMatches(accessPoints, ehriPersonalities);
		
				
    }
}
