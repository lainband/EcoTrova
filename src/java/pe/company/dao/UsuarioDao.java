package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pe.company.dbase.ConexionDb;

import pe.company.vo.UsuarioVo;

public class UsuarioDao 
{
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;    
    

    public UsuarioDao() {}   
    
    public void insert(UsuarioVo usuarios)
    {
        try
        {
            conn=ConexionDb.MySQL();
            ps=conn.prepareStatement("insert into usuarios(usuario,contrasenia,nombre) values(?,?,?,?,?)");
            
            ps.setString(1,usuarios.getUsuario());
            ps.setString(2,usuarios.getContrasenia());
            ps.setString(3,usuarios.getNombre());
            
            int rows=ps.executeUpdate();
            if(rows!=1)
                throw new Exception("Error!");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    
    public Collection<UsuarioVo> findAll() 
    {
        List<UsuarioVo> list=new ArrayList<>();

        try
        {
            conn=ConexionDb.MySQL();
            
            ps=conn.prepareStatement("select * from usuarios");
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                UsuarioVo usuarios=new UsuarioVo();
                
                usuarios.setIdusu(rs.getInt("idusu"));
                usuarios.setUsuario(rs.getString("usuario"));
                usuarios.setContrasenia(rs.getString("contrasenia"));
                usuarios.setNombre(rs.getString("nombre"));
          
     
        list.add(usuarios);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return list;
    }


    
   
    }
    
    
