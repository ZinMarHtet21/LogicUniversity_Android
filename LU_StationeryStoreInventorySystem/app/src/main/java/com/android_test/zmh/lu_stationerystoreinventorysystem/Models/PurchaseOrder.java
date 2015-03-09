package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;



import java.util.Date;
import java.util.List;

/**
 * Created by student on 4/3/15.
 */
public class PurchaseOrder {
    private String id;
    private String number;
    private Date date;
    private String supplierName;
    private String orderBy;
    private String approvedBy;
    private String status;
    private List<PurchaseOrderDetail> purchaseOrderDetail;

<<<<<<< HEAD
    public PurchaseOrder() {
    }

    public PurchaseOrder(String id, String number, Date date, String supplierName, String orderBy, String approvedBy, String status) {
        this.id = id;
        this.number = number;
        this.date = date;
        this.supplierName = supplierName;
        this.orderBy = orderBy;
        this.approvedBy = approvedBy;
        this.status = status;
    }

    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getSupplierName(){
        return supplierName;
    }

    public void setSupplierName(String supplierName){
        this.supplierName = supplierName;
    }

    public String getOrderBy(){
        return orderBy;
    }

    public void setOrderBy(String orderBy){
        this.orderBy = orderBy;
    }

    public String getApprovedBy(){
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy){
        this.approvedBy = approvedBy;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public List<PurchaseOrderDetail> getDeliveryOrderDetail(){
        return purchaseOrderDetail;
    }

    public void setDeliveryOrderDetail(List<PurchaseOrderDetail> purchaseOrderDetail){
        this.purchaseOrderDetail = purchaseOrderDetail;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", date=" + date +
                ", supplierName='" + supplierName + '\'' +
                ", orderBy='" + orderBy + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                ", status='" + status + '\'' +
                ", purchaseOrderDetail=" + purchaseOrderDetail +
                '}';
    }
=======
    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private String getNumber(){
        return number;
    }

    private void setNumber(String number){
        this.number = number;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }

    private String getSupplierName(){
        return supplierName;
    }

    private void setSupplierName(String supplierName){
        this.supplierName = supplierName;
    }

    private String getOrderBy(){
        return orderBy;
    }

    private void setOrderBy(String orderBy){
        this.orderBy = orderBy;
    }

    private String getApprovedBy(){
        return approvedBy;
    }

    private void setApprovedBy(String approvedBy){
        this.approvedBy = approvedBy;
    }

    private String getStatus(){
        return status;
    }

    private void setStatus(String status){
        this.status = status;
    }

    private List<PurchaseOrderDetail> getDeliveryOrderDetail(){
        return purchaseOrderDetail;
    }

    private void setDeliveryOrderDetail(List<PurchaseOrderDetail> purchaseOrderDetail){
        this.purchaseOrderDetail = purchaseOrderDetail;
    }
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
}
