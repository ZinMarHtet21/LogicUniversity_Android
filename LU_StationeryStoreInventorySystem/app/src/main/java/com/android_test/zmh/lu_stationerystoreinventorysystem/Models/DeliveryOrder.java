package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by student on 4/3/15.
 */
public class DeliveryOrder {
    private String id;
    private String number;
    private Date date;
    private String status;
    private String remark;
    private List<DeliveryOrderDetail> deliveryOrderDetail = new ArrayList<DeliveryOrderDetail>();
<<<<<<< HEAD
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

    private String getStatus(){
        return status;
    }

    private void setStatus(String status){
        this.status = status;
    }

    private String getRemark(){
        return remark;
    }

    private void setRemark(String remark){
        this.remark = remark;
    }

    private List<DeliveryOrderDetail> getDeliveryOrderDetail(){
        return deliveryOrderDetail;
    }

    private void setDeliveryOrderDetail(List<DeliveryOrderDetail> deliveryOrderDetail){
        this.deliveryOrderDetail = deliveryOrderDetail;
    }
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd

    public DeliveryOrder() {
    }

    public DeliveryOrder(String id, String number, Date date, String status, String remark, List<DeliveryOrderDetail> deliveryOrderDetail) {
        this.id = id;
        this.number = number;
        this.date = date;
        this.status = status;
        this.remark = remark;
        this.deliveryOrderDetail = deliveryOrderDetail;
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

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getRemark(){
        return remark;
    }

    public void setRemark(String remark){
        this.remark = remark;
    }

    public List<DeliveryOrderDetail> getDeliveryOrderDetail(){
        return deliveryOrderDetail;
    }

    public void setDeliveryOrderDetail(List<DeliveryOrderDetail> deliveryOrderDetail){
        this.deliveryOrderDetail = deliveryOrderDetail;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", remark='" + remark + '\'' +
                ", deliveryOrderDetail=" + deliveryOrderDetail +
                '}';
    }
}
