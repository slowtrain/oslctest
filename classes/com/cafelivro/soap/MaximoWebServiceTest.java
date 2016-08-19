package com.cafelivro.soap;

import com.ibm.www.maximo.CreateMXWOResponseType;
import com.ibm.www.maximo.CreateMXWOType;
import com.ibm.www.maximo.MXBooleanType;
import com.ibm.www.maximo.MXDomainType;
import com.ibm.www.maximo.MXPERSON_EMAILType;
import com.ibm.www.maximo.MXPERSON_PERSONType;
import com.ibm.www.maximo.MXStringType;
import com.ibm.www.maximo.MXWO_WORKORDERType;
import com.ibm.www.maximo.SyncMXPERSONType;
import com.ibm.www.maximo.SyncMXWOResponseType;
import com.ibm.www.maximo.SyncMXWOType;
import com.ibm.www.maximo.WORKORDERKeyType;
import com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONPortType;
import com.ibm.www.maximo.wsdl.MXPERSON.MXPERSONPortTypeProxy;
import com.ibm.www.maximo.wsdl.MXWO.MXWOPortType;
import com.ibm.www.maximo.wsdl.MXWO.MXWOPortTypeProxy;

public class MaximoWebServiceTest {
	public static void main(String[] args) {
		try {

			// createWO();
			// syncWO();
			syncPerson();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void syncPerson() throws Exception {
		// MXPERSONSOAP11BindingStub stub = new MXPERSONSOAP11BindingStub(new
		// URL("http://ayme:7001/meaweb/services/MXPERSON"),null);

		MXPERSONPortType stub = new MXPERSONPortTypeProxy();
		SyncMXPERSONType paramters = new SyncMXPERSONType();

		MXPERSON_PERSONType person = new MXPERSON_PERSONType();
		person.setPERSONID(new MXStringType("TESTPERSON"));
		person.setDISPLAYNAME(new MXStringType("테스트!!!!!!!!!!!@@@@@@@@@"));

		MXPERSON_EMAILType email = new MXPERSON_EMAILType();
		email.setEMAILADDRESS(new MXStringType("testPrimary@gmail.com"));
		email.setISPRIMARY(new MXBooleanType(true));
		email.setTYPE(new MXStringType("WORK"));

		MXPERSON_EMAILType email2 = new MXPERSON_EMAILType();
		email2.setEMAILADDRESS(new MXStringType("testSecond@gmail.com"));
		email2.setISPRIMARY(new MXBooleanType(false));
		email2.setTYPE(new MXStringType("WORK"));
		person.setEMAIL(new MXPERSON_EMAILType[] { email, email2 });

		MXPERSON_PERSONType[] mxPersonSet = { person };
		paramters.setMXPERSONSet(mxPersonSet);
		stub.syncMXPERSON(paramters);

	}

	private static void syncWO() throws Exception {

		// MXWOSOAP11BindingStub stub = new MXWOSOAP11BindingStub(new
		// URL("http://ayme:7001/meaweb/services/MXWO"),null);
		MXWOPortType stub = new MXWOPortTypeProxy();
		
		SyncMXWOType parameters = new SyncMXWOType();

		MXStringType wo1 = new MXStringType();
		wo1.set_value("TESTWO1");
		MXDomainType status1 = new MXDomainType();
		status1.set_value("WAPPR");

		MXStringType siteid = new MXStringType();
		siteid.set_value("BEDFORD");
		MXWO_WORKORDERType workorder1 = new MXWO_WORKORDERType();
		workorder1.setWONUM(wo1);
		workorder1.setSTATUS(status1);
		workorder1.setSITEID(siteid);

		/*
		 * MXWO_WORKORDERType workorder2 =new MXWO_WORKORDERType();
		 * workorder2.setWONUM(new MXStringType("TESTWO03"));
		 * workorder2.setSTATUS(new MXDomainType("APPR"));
		 * workorder2.setSITEID(siteid);
		 */
		MXWO_WORKORDERType[] types = { workorder1 };

		parameters.setMXWOSet(types);

		SyncMXWOResponseType res = stub.syncMXWO(parameters);
		System.out.println(res.getMessageID());

	}

	private static void createWO() throws Exception {
		//MXWOSOAP11BindingStub stub = new MXWOSOAP11BindingStub(new URL("http://ayme:7001/meaweb/services/MXWO"), null);
		MXWOPortType stub = new MXWOPortTypeProxy();
		CreateMXWOType parameters = new CreateMXWOType();

		MXStringType wo1 = new MXStringType();
		wo1.set_value("TESTWO001");
		MXDomainType status1 = new MXDomainType();
		status1.set_value("APPR");

		MXStringType siteid = new MXStringType();
		siteid.set_value("BEDFORD");
		MXWO_WORKORDERType workorder1 = new MXWO_WORKORDERType();
		workorder1.setWONUM(wo1);
		workorder1.setSTATUS(status1);
		workorder1.setSITEID(siteid);

		MXWO_WORKORDERType workorder2 = new MXWO_WORKORDERType();
		workorder2.setWONUM(new MXStringType("TESTWO002"));
		workorder2.setSTATUS(new MXDomainType("APPR"));
		workorder2.setSITEID(siteid);
		MXWO_WORKORDERType[] types = { workorder1, workorder2 };
		parameters.setMXWOSet(types);

		CreateMXWOResponseType retpar = stub.createMXWO(parameters);

		WORKORDERKeyType[] wonum1 = retpar.getWORKORDERMboKeySet();

		System.out.println(wonum1.length);
		for (int i = 0; i < wonum1.length; i++) {
			System.out.println(wonum1[i].getWONUM() + " - " + wonum1[i].getSITEID());
		}

	}
}
