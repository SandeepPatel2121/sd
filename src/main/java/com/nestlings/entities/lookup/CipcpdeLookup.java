package com.nestlings.entities.lookup;

/**
 * Created by fatih on 21/5/18.
 */
public class CipcpdeLookup {

    private Integer cipcodeLookupID;
    private String cipcode;
    private String name;

    public Integer getCipcodeLookupID() {
        return cipcodeLookupID;
    }

    public void setCipcodeLookupID(Integer cipcodeLookupID) {
        this.cipcodeLookupID = cipcodeLookupID;
    }

    public String getCipcode() {
        return cipcode;
    }

    public void setCipcode(String cipcode) {
        this.cipcode = cipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
