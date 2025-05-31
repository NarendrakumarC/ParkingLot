package model;

import enums.VehicalType;

public class Vehical extends BaseModel{
    private String vehicalNo;
    private Owner owner;
    private VehicalType vehicalType;

    public String getVehicalNo() {
        return vehicalNo;
    }

    public void setVehicalNo(String vehicalNo) {
        this.vehicalNo = vehicalNo;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public VehicalType getVehicalType() {
        return vehicalType;
    }

    public void setVehicalType(VehicalType vehicalType) {
        this.vehicalType = vehicalType;
    }
}
