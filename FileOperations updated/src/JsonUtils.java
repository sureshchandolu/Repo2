import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtils {

 static	ObjectMapper objectMapper = new ObjectMapper();
static	String json;
	public static String objectToJson(Employee employee) {
		try {
			json = objectMapper.writeValueAsString(employee);
			
		} catch (Exception e) {

		}

		return json;

	}

}
