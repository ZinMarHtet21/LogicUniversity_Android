package com.android_test.zmh.lu_stationerystoreinventorysystem.Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by student on 7/3/15.
 */
public class DisbursementDepartment extends HashMap<String,String> {

   public DisbursementDepartment(String ID, String name, String representative, String collectionpoint ) {
       put("ID", ID);
       put("name", name);
       put("representative", representative);
       put("collectionpoint", collectionpoint);
   }

       public static List<DisbursementDepartment> parseJSONArray(JSONArray ja){

           List<DisbursementDepartment> list = new ArrayList<DisbursementDepartment>();
           for (int i = 0; i<ja.length();i++){
               try {
                   JSONObject jo = ja.getJSONObject(i);
                   list.add(new DisbursementDepartment(jo.getString("id"),jo.getString("server"),jo.getString("server"),jo.getString("server")));
               } catch (JSONException e) {
                   e.printStackTrace();
               }
           }
           return list;


   }
}
