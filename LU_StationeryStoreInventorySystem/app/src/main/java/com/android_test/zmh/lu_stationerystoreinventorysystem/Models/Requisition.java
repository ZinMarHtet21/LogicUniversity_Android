package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by student on 4/3/15.
 */
<<<<<<< HEAD
public class Requisition implements Serializable {
=======
public class Requisition {
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
    private String id;
    private String madeBy;
    private Date date;
    private String departmentName;
    private String status;
    private String remark;
    private String approvedBy;
    private Date processDate;
    private List<RequisitionDetail> requisitionDetails = new ArrayList<RequisitionDetail>();

<<<<<<< HEAD
    public  Requisition(){

    }

    public Requisition(String id, String madeBy, Date date, String departmentName, String status, String remark, String approvedBy, Date processDate) {
        this.id = id;
        this.madeBy = madeBy;
        this.date = date;
        this.departmentName = departmentName;
        this.status = status;
        this.remark = remark;
        this.approvedBy = approvedBy;
        this.processDate = processDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public List<RequisitionDetail> getRequisitionDetails(){
        return requisitionDetails;
    }

    public void setRequisitionDetails(List<RequisitionDetail> requisitionDetails){
        this.requisitionDetails = requisitionDetails;
    }

    @Override
    public String toString() {
        return "Requisition{" +
                "id='" + id + '\'' +
                ", madeBy='" + madeBy + '\'' +
                ", date=" + date +
                ", departmentName='" + departmentName + '\'' +
                ", status='" + status + '\'' +
                ", remark='" + remark + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                ", processDate=" + processDate +
                ", requisitionDetails=" + requisitionDetails +
                '}';
    }
=======
    private String getID(){
        return id;
    }

    private void setID(String id){
        this.id = id;
    }

    private String getMadeBy(){
        return madeBy;
    }

    private void setMadeBy(String madeBy){
        this.madeBy = madeBy;
    }

    private Date getDate(){
        return date;
    }

    private void setDate(Date date){
        this.date = date;
    }

    private String getDepartmentName(){
        return departmentName;
    }

    private void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
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

    private String getApprovedBy(){
        return approvedBy;
    }

    private void setApprovedBy(String approvedBy){
        this.approvedBy = approvedBy;
    }

    private Date getProcessDate(){
        return processDate;
    }

    private void setProcessDate(Date processDate){
        this.processDate = processDate;
    }

    private List<RequisitionDetail> getRequisitionDetails(){
        return requisitionDetails;
    }

    private void setRequisitionDetails(List<RequisitionDetail> requisitionDetails){
        this.requisitionDetails = requisitionDetails;
    }
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
}
