package edu.pcc.cis233j.countries;

import java.util.List;

/**
 * Read from the Country database and print data on the countries
 * @author Sam Shokrollahi
 */
public class Main {
	public static void main(String[] args) {
		CountryDB cdb = new CountryDB();
		List<Country> countries = cdb.getCountries();

		List<CountryLanguages> Country_Languages = cdb.getCountry_Languages();

		int numberOfCountries = countries.size();
		for (int i=0; i < numberOfCountries -1 ; i++){
			Country country = countries.get(i);

			CountryLanguages countryLanguages = Country_Languages.get(i);


			System.out.println("countryLanguages:");
    		System.out.println("CountryID: " + countryLanguages.getContryid()
				           + "  CountryLanguage: " + countryLanguages.getlanguage()
				           );

			System.out.println("Country:" );

			System.out.println("countryID: " + country.getId() + "   Name: " + country.getName()
					+ "  Population: " + country.getPopulation()
					+ "  Median Age: " + country.getMedianAge());
     	}




	}
}
