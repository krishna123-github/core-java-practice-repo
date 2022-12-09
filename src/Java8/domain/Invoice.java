/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8.domain;

import java.util.Objects;

/**
 *
 * @author krishna
 */

public class Invoice implements Comparable<Invoice>{
    String invoiceNo;
    String userName;
    Double amount;

    public Invoice(String invoiceNo, String userName, Double amount) {
        this.invoiceNo = invoiceNo;
        this.userName = userName;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceNo=" + invoiceNo + ", userName=" + userName + ", amount=" + amount + '}';
    }
    
    

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Invoice t) {
        return invoiceNo.compareTo(t.getInvoiceNo());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Invoice other = (Invoice) obj;
        return Objects.equals(this.invoiceNo, other.invoiceNo);
    }

}
