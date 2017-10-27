package edu.pcc.cis233j.countries;


/**
 * A country in the world
 * @author Your Name & Cara Tang
 */
public class CountryLanguages {
    private int Contryid;
    private String language;

    /**
     * Create a Country object with the given properties
     */
    public CountryLanguages(int Contryid, String language) {
        this.Contryid = Contryid;
        this.language = language;

    }

    public int getContryid() {
        return Contryid;
    }

    public String getlanguage() {
        return language;
    }

}