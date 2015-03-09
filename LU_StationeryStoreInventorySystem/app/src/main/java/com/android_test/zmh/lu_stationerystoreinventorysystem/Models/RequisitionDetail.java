package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

<<<<<<< HEAD
import java.io.Serializable;

/**
 * Created by student on 5/3/15.
 */
public class RequisitionDetail implements Serializable{
=======
/**
 * Created by student on 5/3/15.
 */
public class RequisitionDetail {
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
    private String id;
    private String itemName;
    private int qty;
    private int actualQty;

<<<<<<< HEAD
    public RequisitionDetail() {
    }

    public RequisitionDetail(String id, String itemName, int qty, int actualQty) {
        this.id = id;
        this.itemName = itemName;
        this.qty = qty;
        this.actualQty = actualQty;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
=======
    private String getID() {
        return id;
    }

    private void setID(String id) {
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
        this.id = id;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

<<<<<<< HEAD
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

    @Override
    public String toString() {
        return "RequisitionDetail{" +
                "id='" + id + '\'' +
                ", itemName='" + itemName + '\'' +
                ", qty=" + qty +
                ", actualQty=" + actualQty +
                '}';
    }
=======
    private int getQty() {
        return qty;
    }

    private void setQty(int qty) {
        this.qty = qty;
    }

    private int getActualQty() {
        return actualQty;
    }

    private void setActualQty(int actualQty) {
        this.actualQty = actualQty;
    }
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
}
