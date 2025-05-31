package model;

import enums.PaymentMode;
import enums.PaymentStatus;

import java.util.Date;

public class Payment extends BaseModel{
    private Double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private String refNo;
    private Date tnxMadeAt;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public Date getTnxMadeAt() {
        return tnxMadeAt;
    }

    public void setTnxMadeAt(Date tnxMadeAt) {
        this.tnxMadeAt = tnxMadeAt;
    }
}
