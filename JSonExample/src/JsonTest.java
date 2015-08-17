import org.json.JSONException;
import org.json.JSONObject;
public class JsonTest {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		JSONObject obj1 = new JSONObject();
	obj.append("user1", obj1);
	
	obj1.append("name", "Aditya");
	obj1.append("Account no", "1023040");
	obj1.append("Outstanding amount", new Float("12342.34"));
	obj1.append("Bill Cycle Date", "17/08/2015");
	System.out.println(obj.toString());
	}

}
