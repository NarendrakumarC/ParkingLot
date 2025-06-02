package dtos;

import enums.VehicalType;

public class IssueTicketRequestDTO {
    private VehicalType vehicalType;
    private String vehicalNumber;
    private String vehicalOwnerName;
    private Long gateId;
    private Long parkingLotId;

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public VehicalType getVehicalType() {
        return vehicalType;
    }

    public void setVehicalType(VehicalType vehicalType) {
        this.vehicalType = vehicalType;
    }

    public String getVehicalNumber() {
        return vehicalNumber;
    }

    public void setVehicalNumber(String vehicalNumber) {
        this.vehicalNumber = vehicalNumber;
    }

    public String getVehicalOwnerName() {
        return vehicalOwnerName;
    }

    public void setVehicalOwnerName(String vehicalOwnerName) {
        this.vehicalOwnerName = vehicalOwnerName;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
}
