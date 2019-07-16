package com.company.BooleanM6Summative.dto;

import java.util.Objects;

public class Invoice {

    private Integer invoiceId;
    private Integer customerId;
    private String orderDate;
    private String pickupDate;
    private String returnDate;
    private double lateFee;

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Double.compare(invoice.getLateFee(), getLateFee()) == 0 &&
                Objects.equals(getInvoiceId(), invoice.getInvoiceId()) &&
                Objects.equals(getCustomerId(), invoice.getCustomerId()) &&
                Objects.equals(getOrderDate(), invoice.getOrderDate()) &&
                Objects.equals(getPickupDate(), invoice.getPickupDate()) &&
                Objects.equals(getReturnDate(), invoice.getReturnDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvoiceId(), getCustomerId(), getOrderDate(), getPickupDate(), getReturnDate(), getLateFee());
    }
}
