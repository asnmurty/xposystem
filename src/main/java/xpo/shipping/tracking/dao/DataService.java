package xpo.shipping.tracking.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;

@Repository
public class DataService {

	public String getData(String resource){
		Object obj ="";
		 try {     
			  JSONParser parser = new JSONParser();
	             obj = parser.parse(new FileReader("E:\\SampleJosns\\sampleJson.json"));

	            JSONObject jsonObject =  (JSONObject) obj;

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		return obj.toString();
	}
}
