package com.bharath.flightreservation.entities;

import javax.persistence.*;


@Entity
@Table(name = "SupplierIfno")
public class SupplierIfno {


    @Id
   // @Column(name = "id")
    private String id;

  //  @Column(name = "Contact_Person")
    private String Contact_Person;

  //  @Column(name = "Supplier_Tell")
    private String Supplier_Tell;

  //  @Column(name = "Supplier_Cell")
    private String Supplier_Cell;

  //  @Column(name = "Supplier_Fax")
    private String Supplier_Fax;

  //  @Column(name = "Supplier_Email")
    private String Supplier_Email;

  //  @Column(name = "Bank")
    private String Bank;

  //  @Column(name = "Bank_Code")
    private String Bank_Code;

  //  @Column(name = "Supplier_BankNum")
    private String Supplier_BankNum;

  //  @Column(name = "Supplier_Typle_Bank_Account")
    private String Supplier_Typle_Bank_Account;

  //  @Column(name = "Comments")
    private String Comments;


    public String getSupplierId() {
        return id;
    }

    public void setSupplierId(String supplierId) {
        this.id = supplierId;
    }

    public String getContact_Person() {
        return Contact_Person;
    }

    public void setContact_Person(String contact_Person) {
        Contact_Person = contact_Person;
    }

    public String getSupplier_Tell() {
        return Supplier_Tell;
    }

    public void setSupplier_Tell(String supplier_Tell) {
        Supplier_Tell = supplier_Tell;
    }

    public String getSupplier_Cell() {
        return Supplier_Cell;
    }

    public void setSupplier_Cell(String supplier_Cell) {
        Supplier_Cell = supplier_Cell;
    }

    public String getSupplier_Fax() {
        return Supplier_Fax;
    }

    public void setSupplier_Fax(String supplier_Fax) {
        Supplier_Fax = supplier_Fax;
    }

    public String getSupplier_Email() {
        return Supplier_Email;
    }

    public void setSupplier_Email(String supplier_Email) {
        Supplier_Email = supplier_Email;
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = bank;
    }

    public String getBank_Code() {
        return Bank_Code;
    }

    public void setBank_Code(String bank_Code) {
        Bank_Code = bank_Code;
    }

    public String getSupplier_BankNum() {
        return Supplier_BankNum;
    }

    public void setSupplier_BankNum(String supplier_BankNum) {
        Supplier_BankNum = supplier_BankNum;
    }

    public String getSupplier_Typle_Bank_Account() {
        return Supplier_Typle_Bank_Account;
    }

    public void setSupplier_Typle_Bank_Account(String supplier_Typle_Bank_Account) {
        Supplier_Typle_Bank_Account = supplier_Typle_Bank_Account;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }
}
