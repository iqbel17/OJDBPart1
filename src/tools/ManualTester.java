/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.RegionController;
import entities.Region;
import java.sql.Connection;

/**
 *
 * @author iqbael17
 */
public class ManualTester {

    public static void main(String[] args) {
        //System.out.println(new MyConnection().getConnection());
        Connection connection = new MyConnection().getConnection();
       //String regionId = "16";
     //  String regionName = "tes";
      //  RegionController regionController = new RegionController(connection);
        //System.out.println(regionController.save(regionId, regionName));
        // System.out.println(regionController.edit(regionId,regionName));
      //  System.out.println(regionController.drop(Integer.parseInt(regionId)));
      //  for(Region region :regionController.binding()){
       //     System.out.println(region.getRegionId()+"-"+region.getRegionName());
       // }
    // System.out.println("pakai sort");
      //     regionController.bindingsort("region_id","desc").forEach((region)->{
    //    System.out.println(region.getRegionId()+""+region.getRegionName());
  //  });
      //  regionController.find("region_id","e").forEach((region)->{
   //    System.out.println(region.getRegionId()+""+region.getRegionName());
 //  });
        
    }
}
