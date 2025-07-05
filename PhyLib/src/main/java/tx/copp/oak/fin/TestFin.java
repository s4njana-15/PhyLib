package tx.copp.oak.fin;

public class TestFin {

	public static void main(String[] args) {
		
		Portfolio Sanjana = new Portfolio();
		Sanjana.setName("Cooked");
		Sanjana.setId("ZZTOP1211212121");
		
		
		Holding h1 = new Holding();
		Holding h2 = new Holding();
		Holding h3 = new Holding();
		Holding h4 = new Holding();
		Holding h5 = new Holding();
		
		
		
		Company ibmc = new Company();
		
		ibmc.setName("International Business Machines");
		ibmc.setCountrycode("US");
		ibmc.setNumberofemployees(5000);
		ibmc.setOutstandingshares(5000000);
		ibmc.setSector("Information Technology");
		ibmc.setType("Public");
		
		
		
		Security ibm = new Security();
		ibm.setCusip("459200101");
		ibm.setIsin("US4592001014");
		ibm.setPrice(250);
		ibm.setSector("Technology and Consulting Services");
		ibm.setTicker("IBM");
		ibm.setCompany(ibmc);
		
		h1.setStock(ibm);
		h1.setNumberofshares(1300);
		
		
		Company xomc = new Company();
		xomc.setName("Exxon Mobile");
		xomc.setCountrycode("US");
		xomc.setNumberofemployees(50000);
		xomc.setOutstandingshares(600000);
		xomc.setSector("Oil and Natural Gas");
		xomc.setType("Public");
		
		Security xom = new Security();
		xom.setCusip("30231G102");
		xom.setIsin("US30231G1022");
		xom.setPrice(120);
		xom.setSector("Oil and Natural Gas");
		xom.setTicker("XOM");
		
		h2.setStock(xom);
		h1.setNumberofshares(1460);
		
		Company nvdac = new Company ();
		nvdac.setName("NVIDIA Corp");
		nvdac.setCountrycode("US");
		nvdac.setNumberofemployees(40000);
		nvdac.setOutstandingshares(4000000);
		nvdac.setSector("Technology and Semiconductors");
		nvdac.setType("Public");
		
		Security nvda = new Security();
		nvda.setCusip("67066G104");
		nvda.setIsin("US67066G1040");
		nvda.setPrice(300);
		nvda.setSector("Technology and Semiconductor");
		nvda.setTicker("NVDA");
		
		h3.setStock(nvda);
		h3.setNumberofshares(2550);
		
		Company aaplc = new Company();
		aaplc.setName("Apple");
		aaplc.setCountrycode("US");
		aaplc.setNumberofemployees(500000);
		aaplc.setOutstandingshares(60000000);
		aaplc.setSector("Information Technology");
		aaplc.setType("Public");
		
		Security aapl = new Security();
		aapl.setCusip("037833100");
		aapl.setIsin("US0378331005");
		aapl.setPrice(250);
		aapl.setSector("Information Technology");
		aapl.setTicker("AAPL");
		
		h4.setStock(aapl);
		h4.setNumberofshares(1000);
		
		Company tslac = new Company();
		tslac.setName("Tesla Inc");
		tslac.setCountrycode("US");
		tslac.setNumberofemployees(400000);
		tslac.setSector("Automobiles and Energy");
		tslac.setType("Public");
		
		Security tsla = new Security();
		tsla.setCusip("88160R101");
		tsla.setIsin("US88160R1014");
		tsla.setPrice(0);
		tsla.setSector("Automotive and Energy");
		tsla.setTicker("TSLA");
		
		h5.setStock(tsla);
		h5.setNumberofshares(1560);
		
		Sanjana.addHolding(h1);
		Sanjana.addHolding(h2);
		Sanjana.addHolding(h3);
		Sanjana.addHolding(h4);
		Sanjana.addHolding(h5);
		
		
		
		
		System.out.println("My Final Portfolio: " + Sanjana);
		
		System.out.println(Sanjana.getTotalMKTValue());

	}

}
