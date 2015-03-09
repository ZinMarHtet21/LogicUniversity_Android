package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 4/3/15.
 */
<<<<<<< HEAD
public class Department {
=======
public class Department implements Serializable {
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
    private String id;
    private String code;
    private String name;
    private String contactNumber;
    private String fax;
<<<<<<< HEAD

    public Department() {
    }

    public Department(String id, String code, String name, String contactNumber, String fax) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.contactNumber = contactNumber;
        this.fax = fax;
    }
=======
    private String representative;
    private String collectionPoint;
>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContactNumber(){
        return contactNumber;
    }

    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public String getFax(){
        return fax;
    }

    public void setFax(String fax){
        this.fax = fax;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", fax='" + fax + '\'' +
                '}';
    }
=======
    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getCollectionPoint() {
        return collectionPoint;
    }

    public void setCollectionPoint(String collectionPoint) {
        this.collectionPoint = collectionPoint;
    }


>>>>>>> 5bd12ef156bb06eb99dc19d6f1faaeba8c8b7dcd
}
