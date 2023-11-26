/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pe.company.dbase.ConexionDb;
import pe.company.vo.PromocionVo;


/**
 *
 * @author jc_va
 */
public class PromocionDao {
     private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;    
    

    public PromocionDao() {}   
    
    public void insert(PromocionVo promocion)
    {
        try
        {
            conn=ConexionDb.MySQL();
            ps=conn.prepareStatement("insert into promociones(despro,fchaini,fchafin) values(?,?,?,?,?)");
            
            ps.setString(1,promocion.getDespromo());
            ps.setString(2, promocion.getFchaini());
            ps.setString(3,promocion.getFchafin());
            
            int rows=ps.executeUpdate();
            if(rows!=1)
                throw new Exception("Error!");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    
    public Collection<PromocionVo> findAll() 
    {
        List<PromocionVo> list=new ArrayList<>();

        try
        {
            conn=ConexionDb.MySQL();
            
            ps=conn.prepareStatement("select * from promociones");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                PromocionVo promocion=new PromocionVo();
                
                promocion.setIdpromo(rs.getInt("idpromo"));
                promocion.setDespromo(rs.getString("despromo"));
                promocion.setFchaini(rs.getString("fchaini"));
                promocion.setFchafin(rs.getString("fchafin"));
          
     
        list.add(promocion);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return list;
    }


    
   
    }