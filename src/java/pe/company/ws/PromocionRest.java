/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.ws;

import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pe.company.dao.PromocionDao;
import pe.company.vo.PromocionVo;
import pe.company.vo.UsuarioVo;

/**
 * REST Web Service
 *
 * @author jc_va
 */
@Path("promocion")
public class PromocionRest {

    @Context
    private UriInfo context;

    private PromocionDao promocionDao=new PromocionDao();
    
    public PromocionRest() {
    }

   
  @Path("/agregar")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response agregar(PromocionVo promociones) 
    {
        promocionDao.insert(promociones);
        return Response.ok().entity(promociones).build();
    }
    
    @Path("/listar")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<PromocionVo> listar() {
        return promocionDao.findAll();
    }
    
}