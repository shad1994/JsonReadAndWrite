package ReadAndWriteFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadFromFile {
	
	 @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
	        JSONParser parser = new JSONParser();
	 
	        try {
	 
	            Object obj = parser.parse(new FileReader(
	                    "/home/qainfotech/workspace/db.json"));
	 
	            JSONObject jsonObject = (JSONObject) obj;
	            
	            //System.out.println(jsonObject);
	            
	            JSONArray jsonArray=(JSONArray) jsonObject.get("individuals");
	           
	            
	           // String individual=(String) jsonObject.get("individual");
	            
	            //System.out.println(jsonArray.toString());
	            
	            
	            
	            JSONObject first=(JSONObject) jsonArray.get(0);
	            System.out.println(first.get("name"));
	            
	          
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
