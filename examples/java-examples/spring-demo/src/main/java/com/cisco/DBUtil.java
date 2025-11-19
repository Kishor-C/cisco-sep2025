package com.cisco;

public class DBUtil {
	
	private Datasource datasource;

	public DBUtil(Datasource datasource) {
		super();
		this.datasource = datasource;
	}

	public DBUtil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Datasource getDatasource() {
		return datasource;
	}

	public void setDatasource(Datasource datasource) {
		this.datasource = datasource;
	}
	
	public void connect() {
		System.out.println("Connected with "+datasource.getUrl()+" and user is "+datasource.getUsername());
	}
}
