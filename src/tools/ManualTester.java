/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import com.sun.javafx.scene.text.HitInfo;
import controllers.EmployeeController;
import controllers.RegionController;
import entities.Employee;
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
      // String  regionId= "16";
      // String regionName = "tes";
        
        EmployeeController employeeController = new EmployeeController(connection);
   //  System.out.println(EmployeeController.save(regionId, regionName));
        
        
     //  RegionController regionController = new RegionController(connection);
        //System.out.println(regionController.save(regionId, regionName));
        // System.out.println(regionController.edit(regionId,regionName));
        //  System.out.println(regionController.drop(Integer.parseInt(regionId)));
      //  for(Region region :regionController.binding()){
       //    System.out.println(region.getRegionId()+"-"+region.getRegionName());
        // }
        // System.out.println("pakai sort");
        //     regionController.bindingsort("region_id","desc").forEach((region)->{
        //    System.out.println(region.getRegionId()+""+region.getRegionName());
        //  });
        //  regionController.find("region_id","e").forEach((region)->{
        //    System.out.println(region.getRegionId()+""+region.getRegionName());
        //  });
        
        //  for(Employee employee :employeeController.binding()){
        //    System.out.println(employee.getEmployeeId()+"-"+employee.getHireDate());
        //  }
     String  employeeID= "934";
     String firstName="ad";
     String lastName="asdg";
     String Email="asdasd";
     String Phone="23532";
     String hiredate = "2004-10-01";
     String job_id="FI_ACCOUNT";
     String salary= "4244";
     String  comision="0.2";
     String managerid="108";
     String departmentid="100";
     //    System.out.println(regionController.save(regionId));
       //System.out.println(employeeController.save(employeeID,firstName,lastName,Email,Phone,hiredate,job_id,salary,comision,managerid,departmentid));
   System.out.println(employeeController.drop(Integer.parseInt(employeeID)));
    }
}
