package com.yehia.reda.countrycodepicker;

import android.util.Log;

public class Country {
    private final String iso;
    private final String phoneCode;
    private final String name;
    private final String image;

    public Country(String iso, String phoneCode, String name) {
        this.iso = iso;
        this.phoneCode = phoneCode;
        this.name = name;
        this.image = "";
    }

    public Country(String iso, String phoneCode, String name, String image) {
        this.iso = iso;
        this.phoneCode = phoneCode;
        this.name = name;
        this.image = image;
    }

    public String getIso() {
        return iso;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    /**
     * If country have query word in name or name code or phone code, this will return true.
     */
    boolean isEligibleForQuery(String query) {
        query = query.toLowerCase();
        Log.i("getFilteredCountries", "isEligibleForQuery: " + getName());
        return getName().toLowerCase().contains(query)
                || getIso().toLowerCase().contains(query)
                || getPhoneCode().toLowerCase().contains(query);
    }
}
