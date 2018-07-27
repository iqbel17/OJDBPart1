/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Region;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iqbael17
 */
public class RegionDAO implements RegionInterfaceDAO {

    private Connection connection;

    public RegionDAO() {

    }

    public RegionDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * insert dalam tbl region
     *
     * @param region
     * @return
     */
    @Override
    public boolean insert(Region region) {
        boolean flag = false;
        String query = "INSERT INTO Regions VALUES(?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, region.getRegionId());
            preparedStatement.setString(2, region.getRegionName());
            preparedStatement.executeUpdate();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public boolean update(Region region) {
        try {
            String query = "UPDATE Regions SET region_name=? WHERE region_id=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, region.getRegionName());
            preparedStatement.setInt(2, region.getRegionId());
            preparedStatement.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * delete region id pada tabel regions
     *
     * @param id bertipe int
     * @return boolean
     */
    @Override
    public boolean delete(int id) {
        try {
            String query = "DELETE FROM Regions Where region_id=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Region> getAll() {
        List<Region> datas = new ArrayList<>();
        String query = "SELECT *From Regions";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Region region = new Region();
                region.setRegionId(rs.getInt(1));
                region.setRegionName(rs.getString(2));
                datas.add(region);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datas;
    }

    /**
     *
     * @param category
     * @param sort
     * @return
     */
    @Override
    public List<Region> getAll(String category, String sort) {
        List<Region> datas = new ArrayList<>();
        String query = "SELECT *FROM Regions ORDER BY " + category + " " + sort;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Region region = new Region();
                region.setRegionId(rs.getInt(1));
                region.setRegionName(rs.getString(2));
                datas.add(region);
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public List<Region> search(String category, String data) {

        List<Region> datas = new ArrayList<>();
        String query = "SELECT *FROM Regions WHERE " + category + " " + " like '%" + data + "%'";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Region region = new Region();
                region.setRegionId(rs.getInt(1));
                region.setRegionName(rs.getString(2));
                datas.add(region);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }

    @Override
    public Region getById(int id) {
        Region region = new Region();
        String query = "SELECT *FROM Regions WHERE region_id = " + id + "'";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                region.setRegionId(rs.getInt(1));
                region.setRegionName(rs.getString(2));
            }
        } catch (Exception ex) {
            Logger.getLogger(RegionDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return region;
    }

}
