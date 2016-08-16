package com.cafelivro.oslc;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Iterator;

import javax.json.JsonObject;
import javax.net.ssl.HttpsURLConnection;
import javax.security.auth.callback.TextOutputCallback;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;
import com.ibm.maximo.oslc.OslcException;

public class HTTPToMaximo {
	
	
	public static final String HTTP_METHOD_POST = "POST";
	public static final String HTTP_METHOD_GET = "GET";
	public static final String HTTP_METHOD_PATCH = "PATCH";
	public static final String HTTP_METHOD_MERGE = "MERGE";
	public static final String HTTP_METHOD_DELETE = "DELETE";
	public static final String HTTP_METHOD_BULK = "BULK";
	public static final String HTTP_METHOD_SYNC = "SYNC";
	public static final String HTTP_METHOD_MERGESYNC = "MERGESYNC";
	
	
	private String basicUri;
	private String maxauth;
	
	public HTTPToMaximo(String basicUri,String user,String password) {
		this.basicUri=basicUri;
		this.maxauth=Base64.getUrlEncoder().encodeToString(new String(user+":"+password).getBytes());
	}
	
	public HTTPToMaximo(String protocol,String host,String port ,String user,String password) {
		String basicUri=protocol+"://"+host+":"+port+"/maximo/oslc/os";
		this.basicUri=basicUri;
		this.maxauth=Base64.getUrlEncoder().encodeToString(new String(user+":"+password).getBytes());
	}
	
	public String getBasicUri(){
		return basicUri;
	}
	
	/*
	protected HttpURLConnection setMethod(HttpURLConnection con, String method, String... properties)
			throws IOException, OslcException {
		this.httpMethod = method;		
		if (this.isGET()) {
			con.setRequestMethod(HTTP_METHOD_GET);
			con.setRequestProperty("accept", "application/json");
			con.setUseCaches(false);
			con.setAllowUserInteraction(false);
			con.setRequestProperty("x-public-uri", url);
		} else if (this.isPOST()) {
			con.setRequestMethod(HTTP_METHOD_POST);
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			con.setRequestProperty("x-public-uri", url);
		} else if (this.isPATCH()) {
			con.setRequestMethod(HTTP_METHOD_POST);
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			con.setRequestProperty("x-public-uri", url);
			con.setRequestProperty("x-method-override", HTTP_METHOD_PATCH);
		} else if (this.isMERGE()) {
			con.setRequestMethod(HTTP_METHOD_POST);
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			con.setRequestProperty("x-public-uri", url);
			con.setRequestProperty("x-method-override", HTTP_METHOD_PATCH);
			con.setRequestProperty("patchtype",HTTP_METHOD_MERGE);
		} else if (this.isBULK()) {
			con.setRequestMethod(HTTP_METHOD_POST);
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			con.setRequestProperty("x-public-uri", url);
			con.setRequestProperty("x-method-override", HTTP_METHOD_BULK);
		} else if (this.isSYNC()) {
			con.setRequestMethod(HTTP_METHOD_POST);
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			con.setRequestProperty("x-public-uri", url);
			con.setRequestProperty("x-method-override", HTTP_METHOD_SYNC);
		} else if (this.isMERGESYNC()) {
			con.setRequestMethod(HTTP_METHOD_POST);
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			con.setRequestProperty("x-public-uri", url);
			con.setRequestProperty("x-method-override", HTTP_METHOD_SYNC);
			con.setRequestProperty("patchtype",HTTP_METHOD_MERGE);
		} else if (this.isDELETE()) {
			con.setRequestMethod(HTTP_METHOD_DELETE);
			con.setRequestProperty("accept", "application/json");
			con.setUseCaches(false);
			con.setAllowUserInteraction(false);
			con.setRequestProperty("x-public-uri", url);
		}
		
		for (String property : properties) {
			con.setRequestProperty("Properties", property);
		}
		
		return con;
	}
	*/
	public JSONObject query(String objectStructure) {
		return query(objectStructure, null);
	}
	
	public JSONObject query(String objectStructure,String oslcWhere) {
		return query(objectStructure, oslcWhere, null);
	}
	
	public JSONObject query(String objectStructure,String oslcWhere,String oslcSelect) {
		return query(objectStructure, oslcWhere, oslcSelect, null);
	}
	
	public JSONObject query(String objectStructure,String oslcWhere,String oslcSelect,String oslcOrderBy) {
		//String oslcWhere   = "oslc.where=spi:siteid=\"BEDFORD\" and spi:assetnum in [\"1004\",\"1005\"]";
		//String oslcSelect  = "oslc.select=spi:assetnum,spi:description";
		//String oslcOrderBy = "oslc.orderBy=spi:assetnum";
		
		JSONObject result=null;
		try {
			String requestUri=basicUri+"/"+objectStructure;
			requestUri=addUriOption(requestUri, oslcWhere);
			requestUri=addUriOption(requestUri, oslcSelect);
			requestUri=addUriOption(requestUri, oslcOrderBy);

			
		    URL httpUrl = new URL(requestUri);  
		    HttpURLConnection urlConnection = (HttpURLConnection)httpUrl.openConnection();

		    urlConnection.setRequestMethod(HTTP_METHOD_GET);
		    //urlConnection.setRequestProperty("accept", "application/json");
		    urlConnection.setRequestProperty("x-public-uri", basicUri);
		    urlConnection.setRequestProperty("MAXAUTH", maxauth);
		    urlConnection.setUseCaches(false);  
		    urlConnection.setAllowUserInteraction(false);		    
		    
		    urlConnection.connect();  

			int responseCode = urlConnection.getResponseCode();
			System.out.println("Query Request to URL : " + requestUri);
			System.out.println("Response Code  : " + responseCode);
			System.out.println("Response message  : " + urlConnection.getResponseMessage());
			
			if(responseCode<400){
				BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
				StringBuffer response = new StringBuffer();
				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
					response.append("\n");
				}
				in.close();
				System.out.println("response body  : ");
				System.out.println(response.toString());
				result=JSONObject.parse(response.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;	
	}
	
	public JSONObject querySavedQuery(String objectStructure,String savedQueryName) {
		return querySavedQuery(objectStructure, savedQueryName, null);
	}
	
	public JSONObject querySavedQuery(String objectStructure,String savedQueryName,String savedQuerySelect) {
		return querySavedQuery(objectStructure,savedQueryName,savedQuerySelect,null);
	}
	
	private String addUriOption(String uri,String uriOption){
		if(uriOption!=null){
			uri=uri.contains("?")?uri+"&":uri+"?";
			uri=uri+uriOption;
		}
		return uri;
	}
	
	public JSONObject querySavedQuery(String objectStructure,String savedQueryName,String savedQuerySelect,String savedQueryWhere) {
	
		JSONObject result=null;
		try {
			String requestUri=basicUri+"/"+objectStructure;
			requestUri=addUriOption(requestUri, "savedQuery="+savedQueryName);
			requestUri=addUriOption(requestUri, savedQuerySelect);
			requestUri=addUriOption(requestUri, savedQueryWhere);
		   
			URL httpUrl = new URL(requestUri);  
		    HttpURLConnection urlConnection = (HttpURLConnection) httpUrl.openConnection();

		    urlConnection.setRequestMethod(HTTP_METHOD_GET);
		    urlConnection.setRequestProperty("accept", "application/json");
		    urlConnection.setRequestProperty("x-public-uri", basicUri);
		    urlConnection.setRequestProperty("MAXAUTH", maxauth);
		    urlConnection.setUseCaches(false);  
		    urlConnection.setAllowUserInteraction(false);		    
		    
		    urlConnection.connect();  

			int responseCode = urlConnection.getResponseCode();
			System.out.println("QuerySavedQuery Request to URL : " + requestUri);
			System.out.println("Response Code  : " + responseCode);
			System.out.println("Response Message : "+urlConnection.getResponseMessage());
			
			if(responseCode<400){
				BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
				StringBuffer response = new StringBuffer();
				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
					response.append("\n");
				}
				in.close();
				System.out.println("response body  : ");
				System.out.println(response.toString());
				result=JSONObject.parse(response.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;	
	}
	
	
	/**
	 * @param objectStructure
	 * @param json
	 * @return Integer 201 OK
	 */
	public Integer add(String objectStructure,JSONObject json) {
		int responseCode =-1;
		try {
			String requestUri=basicUri+"/"+objectStructure;
		    URL httpUrl = new URL(requestUri);  
		    HttpURLConnection urlConnection = (HttpURLConnection) httpUrl.openConnection();
		    
		    urlConnection.setRequestMethod(HTTP_METHOD_POST);
		    urlConnection.setRequestProperty("Content-Type", "application/json");
		    urlConnection.setRequestProperty("x-public-uri", basicUri);
		    urlConnection.setRequestProperty("MAXAUTH", maxauth);
		    urlConnection.setDoOutput(true);
//		    urlConnection.setUseCaches(false);  
//		    urlConnection.setConnectTimeout(10000);  
//		    urlConnection.setReadTimeout(10000);
		    
		    urlConnection.connect();  

		    OutputStreamWriter writer= new OutputStreamWriter(urlConnection.getOutputStream());
		    writer.write(json.toString());
		    writer.flush();
		    writer.close(); 
			
			responseCode = urlConnection.getResponseCode();
			System.out.println("Add request to URL : " + requestUri);
			System.out.println("Response Code  : " + responseCode);
			System.out.println("Response Message : "+urlConnection.getResponseMessage());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseCode;
	}
	
	/**
	 * @param objectStructure
	 * @param json
	 * @return Integer 201 OK
	 */
	public Integer addAttachment(String resourceIdentifier) {
		int responseCode =-1;
		try {
			String requestUri=resourceIdentifier;
		    URL httpUrl = new URL(requestUri);  
		    HttpURLConnection urlConnection = (HttpURLConnection) httpUrl.openConnection();
		    
		    String slug="test.txt";
		    String desc="테스트 파일";
		    String encslug=Base64.getUrlEncoder().encodeToString(slug.getBytes());
		    String encdesc=Base64.getUrlEncoder().encodeToString(desc.getBytes());
		    urlConnection.setRequestMethod("POST");
		    urlConnection.setRequestProperty("MAXAUTH", maxauth);
		    urlConnection.setRequestProperty("x-public-uri", basicUri);
		    urlConnection.setRequestProperty("slug", slug);
		    urlConnection.setRequestProperty("encslug", encslug);
		    urlConnection.setRequestProperty("Content-Type", "text/plain");
		    urlConnection.setRequestProperty("x-document-meta", "text");
		    urlConnection.setRequestProperty("x-document-description", desc);
		    urlConnection.setRequestProperty("x-document-encdescription", encdesc);
		    urlConnection.setRequestProperty("custom-encoding", "base64");

		    urlConnection.setDoOutput(true);

		    
		    urlConnection.connect();  
		    
		    JSONObject doclink=new JSONObject();
		    JSONObject href=new JSONObject();
		    href.put("href", "requestUri/doclinks");
		    doclink.put("doclinks",href);
		    
		    
		    InputStream is=new FileInputStream(new File("C:\\Temp\\test.txt"));
		    OutputStream os =urlConnection.getOutputStream();

		    OutputStreamWriter osw = new OutputStreamWriter(os);
		    osw.write(doclink.toString());
//		    byte[] buffer = new byte[1024]; // Adjust if you want
//		    int bytesRead;
//		    while ((bytesRead = is.read(buffer)) != -1){
//		    	os.write(buffer, 0, bytesRead);
//		    }
		    
		    os.flush();
		    os.close();
		    is.close();

		   			
			responseCode = urlConnection.getResponseCode();
			System.out.println("Add request to URL : " + requestUri);
			System.out.println("Response Code  : " + responseCode);
			System.out.println("Response Message : "+urlConnection.getResponseMessage());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseCode;
	}
	
	
	
	/**
	 * @param resourceIdentifier
	 * @param json
	 * @return Integer 204 OK
	 */
	public Integer update(String resourceIdentifier,JSONObject json) {
		Integer responseCode=-1;
		try {
			
			String requestUri=resourceIdentifier;
			
		    URL url = new URL(requestUri); 
		    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		    		    		    
		    urlConnection.setRequestMethod("POST");  
		    urlConnection.setRequestProperty("Content-Type","application/json");   
		    urlConnection.setRequestProperty("x-method-override",HTTP_METHOD_PATCH);
		    urlConnection.setRequestProperty("patchtype",HTTP_METHOD_MERGE);
		    urlConnection.setRequestProperty("MAXAUTH", maxauth);
		    urlConnection.setDoOutput(true);   
//		    urlConnection.setUseCaches(false);  
//		    urlConnection.setConnectTimeout(10000);  
//		    urlConnection.setReadTimeout(10000);

		    urlConnection.connect();  

		    OutputStreamWriter writer = new   OutputStreamWriter(urlConnection.getOutputStream());
		    writer.write(json.toString());
		    writer.flush();
		    writer.close(); 
			
			responseCode = urlConnection.getResponseCode();

			System.out.println("Update Request to URL : " + requestUri);
			System.out.println("Response Code : " + responseCode);
			System.out.println("Response Message : "+urlConnection.getResponseMessage());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseCode;
	}
	
	
	/**
	 * @param resourceIdentifier
	 * @param json
	 * @return Integer 204 OK
	 */
	public Integer delete(String resourceIdentifier) {
		Integer responseCode=-1;
		try {
			
			String requestUrl=resourceIdentifier;
			
		    URL url = new URL(requestUrl); 
		    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		    		    		    
		    urlConnection.setRequestMethod(HTTP_METHOD_DELETE);
		    urlConnection.setRequestProperty("accept", "application/json");
		    urlConnection.setUseCaches(false);
		    urlConnection.setAllowUserInteraction(false);
		    urlConnection.setRequestProperty("x-public-uri", requestUrl);
		    urlConnection.setRequestProperty("MAXAUTH", maxauth);
  
		    urlConnection.connect();  
			
			responseCode = urlConnection.getResponseCode();

			System.out.println("Delete Request to URL : " + requestUrl);
			System.out.println("Response Code : " + responseCode);
			System.out.println("Response Message : "+urlConnection.getResponseMessage());

			
//			BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//			StringBuffer response = new StringBuffer();
//			String inputLine;
//			while ((inputLine = in.readLine()) != null) {
//				response.append(inputLine);
//				response.append("\n");
//			}
//			in.close();
//			System.out.println("response body  : ");
//			System.out.println(response.toString());
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseCode;
	}
	
	
}
