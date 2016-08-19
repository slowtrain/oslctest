package com.cafelivro.etc;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Iterator;

import javax.net.ssl.HttpsURLConnection;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;

public class HTTPCallTest {
	public static void main(String[] args) {
		try {
			//queryAsset();
			//createAsset();
			updateAsset();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void createAsset() {
		try {
			String oslcUrl="http://ayme:7001/maximo/oslc/os/assetoslc";
			
			
		    URL url = new URL(oslcUrl);  
		    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		    
		    String maxauth=Base64.getUrlEncoder().encodeToString("maxadmin:maxadmin".getBytes());
		    urlConnection.setRequestMethod("POST");  
		    urlConnection.setRequestProperty("Content-Type","application/json");   
		    urlConnection.setRequestProperty("MAXAUTH", maxauth);
		    urlConnection.setDoOutput(true);   
//		    urlConnection.setUseCaches(false);  
//		    urlConnection.setConnectTimeout(10000);  
//		    urlConnection.setReadTimeout(10000);

		    urlConnection.connect();  

		    //Create JSONObject here
		    JSONObject asset = new JSONObject();
		    asset.put("spi:assetnum", "oslc1006");
		    asset.put("spi:description", "oslc1006 test");
		    asset.put("spi:siteid", "BEDFORD");

		    OutputStreamWriter out = new   OutputStreamWriter(urlConnection.getOutputStream());
		    out.write(asset.toString());
		    out.close(); 
			
		    
			int responseCode = urlConnection.getResponseCode();

			
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
				response.append("\n");
				
			}
			in.close();
			System.out.println(response.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void updateAsset() {
		try {
			String oslcUrl="http://ayme:7001/maximo/oslc/os/assetoslc/_MTAwNC9CRURGT1JE";
			
			
		    URL url = new URL(oslcUrl);  
		    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		    
		    String maxauth=Base64.getUrlEncoder().encodeToString("maxadmin:maxadmin".getBytes());
		    urlConnection.setRequestMethod("POST");  
		    urlConnection.setRequestProperty("Content-Type","application/json");   
		    urlConnection.setRequestProperty("x-method-override","PATCH");
		    urlConnection.setRequestProperty("patchtype","MERGE");
		    urlConnection.setRequestProperty("MAXAUTH", maxauth);
		    urlConnection.setDoOutput(true);   
//		    urlConnection.setUseCaches(false);  
//		    urlConnection.setConnectTimeout(10000);  
//		    urlConnection.setReadTimeout(10000);

		    urlConnection.connect();  

		    //Create JSONObject here
		    JSONObject asset = new JSONObject();

		    asset.put("spi:changeby", "MAXADMIN");
		    asset.put("spi:description", "1004 update 2222");
		    asset.put("spi:status", "ACTIVE");


		    JSONObject assetMeter = new JSONObject();
		    assetMeter.put("spi:metername","TEMP-F");
//		    assetMeter.put("spi:linearassetmeterid", 0);
//		    assetMeter.put("spi:newreading", "29");
		    assetMeter.put("spi:_action", "Add");
		    
		    
		    
		    JSONArray assetMeterSet= new JSONArray();
		    assetMeterSet.add(assetMeter);

		    
		    asset.put("spi:assetmeter", assetMeterSet);
		    

		    OutputStreamWriter out = new   OutputStreamWriter(urlConnection.getOutputStream());
		    out.write(asset.toString());
		    out.close(); 
			
		    
			int responseCode = urlConnection.getResponseCode();

			
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
			BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
				response.append("\n");
				
			}
			in.close();
			System.out.println(response.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

	// HTTP GET request
	public static void queryAsset() throws Exception {
		

		String oslcUrl="http://ayme:7001/maximo/oslc/os/assetoslc";
		String oslcWhere="oslc.where=spi:siteid=\"BEDFORD\" and spi:assetnum=\"1004\"";
		String oslcSelect="oslc.select=spi:assetnum,spi:description";
		
		String url=oslcUrl+"?"+oslcWhere+"&"+oslcSelect;
		//String url="http://localhost:7001/maximo/oslc/os/assetoslc/_QTc4MDUvQkVERk9SRA--";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");
		
		
		
		String maxauth=Base64.getUrlEncoder().encodeToString("maxadmin:maxadmin".getBytes());
		
		
		
		// add request header
		con.setRequestProperty("MAXAUTH", maxauth);


		
		
		
		int responseCode = con.getResponseCode();

		System.out.println(con.getContentType());
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
			response.append("\n");
			
		}
		in.close();
		String json=response.toString();
		
		
		
		//new FileOutputStream("C:\\Temp\\assetloc.json").write(json.getBytes());
		// print result
		System.out.println(response.toString());
		
	

		JSONObject jsonobject =new JSONObject().parse(json);
		
		
		
		Iterator it =jsonobject.keySet().iterator();
		
		while (it.hasNext()) {
			Object ob= it.next();
			System.out.println(ob.getClass().getSimpleName());
			System.out.println(ob.toString());
			
		}
		
		
		
		JSONArray assetSet=(JSONArray)jsonobject.get("rdfs:member");
		
		
		JSONObject asset = (JSONObject)assetSet.get(0);
		System.out.println("assetnum    : "+asset.get("spi:assetnum"));
		System.out.println("description : "+asset.get("spi:description"));

	}
	
	private final String USER_AGENT = "Mozilla/5.0";

	// HTTP POST request
	private void sendPost() throws Exception {

		String url = "https://selfsolve.apple.com/wcResults.do";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());

	}
	
	
}
