package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

/**
 * Created by student on 5/3/15.
 */
public class PurchaseOrderDetail {
    private String id;
    private String itemName;
    private int qty;
    private double price;

<<<<<<< HEAD
    public PurchaseOrderDetail() {
    }

    public PurchaseOrderDetail(String id, String itemName, int qty, double price) {
        this.id = id;
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
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
=======
    private int getQty() {
        return qty;
    }

    private void setQty(int qty) {
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
        this.qty = qty;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "PurchaseOrderDetail{" +
                "id='" + id + '\'' +
                ", itemName='" + itemName + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
=======
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
}
