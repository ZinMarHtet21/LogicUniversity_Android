package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.util.Date;

/**
 * Created by student on 5/3/15.
 */
public class StockAdjustment {
    private String id;
    private String voucherId;
    private String itemName;
    private int qty;
    private double price;
    private String status;
    private String reason;
    private Date date;

<<<<<<< HEAD
    public StockAdjustment() {
    }

    public StockAdjustment(String id, String voucherId, String itemName, int qty, double price, String status, String reason, Date date) {
        this.id = id;
        this.voucherId = voucherId;
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
        this.status = status;
        this.reason = reason;
        this.date = date;
    }

    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }

    public String getVoucherId(){
        return voucherId;
    }

    public void setVoucherId(String voucherId){
        this.voucherId = voucherId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
=======
    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private String getVoucherId(){
        return voucherId;
    }

    private void setVoucherId(String voucherId){
        this.voucherId = voucherId;
    }

    private String getItemName() {
        return itemName;
    }

    private void setItemName(String itemName) {
        this.itemName = itemName;
    }

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
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getReason(){
        return reason;
    }

    public void setReason(String reason){
        this.reason = reason;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public String toString() {
        return "StockAdjustment{" +
                "id='" + id + '\'' +
                ", voucherId='" + voucherId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                ", date=" + date +
                '}';
    }
=======
    private String getStatus(){
        return status;
    }

    private void setStatus(String status){
        this.status = status;
    }

    private String getReason(){
        return reason;
    }

    private void setReason(String reason){
        this.reason = reason;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
}
