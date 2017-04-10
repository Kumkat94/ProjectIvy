
package example;

import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang.WordUtils;
import com.opencsv.*;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));

        int monmax=0;
        CSVReader reader = new CSVREADER(new FileReader("data.csv"));
        List<String[]> myEntries=reader.readAll();

        for(String[] line: myEntries){
        	for(String val: line){
        		
        		if (Integer.parseInt(val) > monmax){
        			monmax = Integer.parseInt(val);
        		}
        	}
        }
        System.println("Le Max est:"+monmax);

    }
}
        