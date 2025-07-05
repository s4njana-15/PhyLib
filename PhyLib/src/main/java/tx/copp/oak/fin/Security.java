package tx.copp.oak.fin;

public class Security {
	
	private String cusip;
	private String isin;
	private String ticker;
	private double price;
	private String sector;
	private Company company;
	
	
	public String getCusip() {
		return cusip;
	}


	public void setCusip(String cusip) {
		this.cusip = cusip;
	}


	public String getIsin() {
		return isin;
	}


	public void setIsin(String isin) {
		this.isin = isin;
	}


	public String getTicker() {
		return ticker;
	}


	public void setTicker(String ticker) {
		this.ticker = ticker;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}
	

	
	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Security [cusip=" + cusip + ", isin=" + isin + ", ticker=" + ticker + ", price=" + price + ", sector="
				+ sector + ", company=" + company + "]";
	}


}
