/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDAO;
import entities.Region;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author iqbael17
 */
public class RegionController implements RegionInterfaceController {

    //private Connection connection;
    private RegionDAO regionDAO;

    public RegionController() {

    }

    public RegionController(Connection connection) {
       this.regionDAO = new RegionDAO(connection);
    }

    @Override
    public boolean save(String regionId, String regionName) {
        Region region = new Region(Integer.parseInt(regionId),regionName);
       // region.setRegionId();
       // region.setRegionName(regionName);
        return this.regionDAO.insert(region);
    }

    @Override
    public boolean edit(String regionId, String regionName) {
        Region region = new Region(Integer.parseInt(regionId),regionName);
        //region.setRegionId();
        //region.setRegionName(regionName);
        return this.regionDAO.update(region);

    }

    @Override
    public boolean drop(int id) {
        return this.regionDAO.delete(id);
    }

    @Override
    public List<Region> binding() {
        return this.regionDAO.getAll();
    }

    @Override
    public List<Region> bindingsort(String category, String sort) {
        return this.regionDAO.getAll(category, sort);
    }

    @Override
    public List<Region> find(String category, String Data) {
        return this.regionDAO.search(category, Data);
    }

    @Override
    public Region findbyId(int id) {
        return this.regionDAO.getById(id);
    }

}
