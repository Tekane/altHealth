package com.bharath.flightreservation.entities;

import javax.persistence.*;


@Entity
@Table(name = "supplements")
public class Supplements  {

    @Id
    private String id;


    private String Suppl_Description;


    private String Cost_excl;


    private String Perc_inc;


    private String Min_levels;


    private String Stock_levels;


    private String Nappi_code;


    @OneToOne
    private SupplierIfno supplierIfno;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSuppl_Description() {
        return Suppl_Description;
    }

    public void setSuppl_Description(String suppl_Description) {
        Suppl_Description = suppl_Description;
    }

    public String getCost_excl() {
        return Cost_excl;
    }

    public void setCost_excl(String cost_excl) {
        Cost_excl = cost_excl;
    }

    public String getPerc_inc() {
        return Perc_inc;
    }

    public void setPerc_inc(String perc_inc) {
        Perc_inc = perc_inc;
    }

    public String getMin_levels() {
        return Min_levels;
    }

    public void setMin_levels(String min_levels) {
        Min_levels = min_levels;
    }

    public String getStock_levels() {
        return Stock_levels;
    }

    public void setStock_levels(String stock_levels) {
        Stock_levels = stock_levels;
    }

    public String getNappi_code() {
        return Nappi_code;
    }

    public void setNappi_code(String nappi_code) {
        Nappi_code = nappi_code;
    }

    public SupplierIfno getSupplierIfno() {
        return supplierIfno;
    }

    public void setSupplierIfno(SupplierIfno supplierIfno) {
        this.supplierIfno = supplierIfno;
    }
}