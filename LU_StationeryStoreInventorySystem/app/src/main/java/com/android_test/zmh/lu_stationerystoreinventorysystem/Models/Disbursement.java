package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by student on 4/3/15.
 */
<<<<<<< HEAD
public class Disbursement implements Serializable {
=======
public class Disbursement implements Serializable{
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
    private String id;
    private Date date;
    private String itemName;
    private String departmentName;
    private int qty;
    private int actualQty;

<<<<<<< HEAD
    public Disbursement() {
    }

    public Disbursement(String id, Date date, String itemName, String departmentName, int qty, int actualQty) {
        this.id = id;
        this.date = date;
        this.itemName = itemName;
        this.departmentName = departmentName;
        this.qty = qty;
        this.actualQty = actualQty;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
=======
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
        this.date = date;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getActualQty() {
        return actualQty;
    }

    public void setActualQty(int actualQty) {
        this.actualQty = actualQty;
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return "Disbursement{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", itemName='" + itemName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", qty=" + qty +
                ", actualQty=" + actualQty +
                '}';
    }
=======
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
}
