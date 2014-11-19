package Parameters;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class ParameterSpec {
	
	private Map properties;
  
	public ParameterSpec(Map properties) {
		if (properties == null) {
			this.properties = new HashMap();
		} else {
			this.properties = new HashMap(properties);
		}
	}

	public void addProperty(String propertyName, String property) {
		properties.put(propertyName, property);
	}

	public void setProperties(Map properties) {
		this.properties = properties;
	}
  
	public Object getProperty(String propertyName) {
		return properties.get(propertyName);
	}

	public Map getProperties() {
		return properties;
	}
}