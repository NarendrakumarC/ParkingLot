package model;

import enums.GateStatus;
import enums.GateType;

public class Gate extends BaseModel{
    private Long gateNo;
    private Operator operator;
    private GateStatus gateStatus;
    private GateType gateType;
    private ParkingFloor parkingFloor;

    public Gate(Long gateNo, Operator operator, GateStatus gateStatus) {
        this.gateNo = gateNo;
        this.operator = operator;
        this.gateStatus = gateStatus;
    }

    public Long getGateNo() {
        return gateNo;
    }

    public void setGateNo(Long gateNo) {
        this.gateNo = gateNo;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
