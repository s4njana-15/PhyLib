package tx.copp.oak.balu.phy;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteElements {
	
	public void writeChems(String fileName) throws IOException {// throws over hereeee
		
		Date currentDate = new Date();
        SimpleDateFormat spf = new SimpleDateFormat("yyyy_MM_dd");
        String formattedDate = spf.format(currentDate);
        
        fileName = fileName + "_" + formattedDate;
        
        System.err.println(fileName);
		
		FileWriter ft = new FileWriter(fileName);
		
		ft.write("Darling please cook me some pav bhaji and rice \n");
		ft.write("Darling don't forget forget about Gulab Jamun and Falooda \n");
		ft.write("Allah bless you!!! \n");
		ft.close();
		
		
		}
	
}
