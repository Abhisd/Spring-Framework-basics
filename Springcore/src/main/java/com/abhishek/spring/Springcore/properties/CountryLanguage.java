package com.abhishek.spring.Springcore.properties;

import java.util.Properties;

public class CountryLanguage {
	private Properties countryAndLang;

	public Properties getCountryAndLang() {
		return countryAndLang;
	}

	public void setCountryAndLang(Properties countryAndLang) {
		this.countryAndLang = countryAndLang;
	}

	@Override
	public String toString() {
		return "CountryLanguage [countryAndLang=" + countryAndLang + "]";
	}
	

}
