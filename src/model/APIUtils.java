package model;

import com.clarifai.api.ClarifaiClient;

public class APIUtils {

	private static final String id = "MC1Psq3mFwSriro3bn6tcOu2IKyvHCcQ29Rqya4W";
	private static final String secret = "tRAymNmwEuis04Q7m9TccbhgGqvZRUX3VstWbGO7";
	
	public APIUtils() {
		ClarifaiClient clarifai = new ClarifaiClient(id, secret);
	}
}
