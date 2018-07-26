/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Region;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public interface RegionInterfaceController {
   
    public boolean save(String regionId, String regionName);
    public boolean edit(String regionId, String regionName);
    public boolean drop (int id);
    public List<Region> binding();
    public List<Region> bindingsort(String category, String sort);
    public List<Region> find(String category, String Data);
    public Region findbyId(int id);
    
    
   
}
