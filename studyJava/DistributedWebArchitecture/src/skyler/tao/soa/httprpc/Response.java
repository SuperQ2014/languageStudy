package skyler.tao.soa.httprpc;

public class Response {

	/**
	 * encode
	 */
	private byte encode;
	
	/**
	 * response length
	 */
	private int responseLength;
	
	/**
	 * response
	 */
	private String response;

	public byte getEncode() {
		return encode;
	}

	public void setEncode(byte encode) {
		this.encode = encode;
	}

	public int getResponseLength() {
		return responseLength;
	}

	public void setResponseLength(int responseLength) {
		this.responseLength = responseLength;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
}
