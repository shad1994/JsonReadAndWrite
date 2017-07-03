package ReadAndWriteFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WriteToFile {
	
	 static JSONParser parser = new JSONParser();
	 
	
	 public static void main(String[] args) throws IOException {
		 
		JSONObject jsonObject = new JSONObject();
		 
		 jsonObject.put("id", 1);
		 jsonObject.put("name", "shadab");
		 jsonObject.put("active", "true");
		 
		 JSONObject obj2=new JSONObject();
		 obj2.put("id", 2);
		 obj2.put("name", "hey");
		 obj2.put("active", "false");
		 
		 System.out.println(jsonObject.toString());
		 
		 JSONArray individual=new JSONArray();
		 individual.add(jsonObject);
		 individual.add(obj2);
		 
		 JSONObject obj1=new JSONObject();
		 obj1.put("individuals", individual);
		 
		 
		 try (FileWriter file = new FileWriter("/home/qainfotech/workspace/db.json")) {

		        file.write(obj1.toJSONString());
		        file.flush();

		    } catch (IOException e) {
		        e.printStackTrace();
		    }

          
           
	 }

}
