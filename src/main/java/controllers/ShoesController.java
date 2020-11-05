package controllers;

import domain.MyList;
import domain.models.Category;
import domain.models.Shoes;
import services.ShoesService;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("shoes")
public class ShoesController {
    private ShoesService sh;

    public ShoesController() {
        sh = new ShoesService();
    }
    @GET
    public String hello(){
        return "Hello";
    }


    @GET
    @Path("/categories")
    public Response getCategories(){
        List<Category> categories=sh.categories();
        return Response.status(200).entity(categories).build();
    }

    @GET
    @Path("/category/{category_id}")
    public Response getCategoryByID(@PathParam("category_id") long id){
        List<Shoes> shoes= (List<Shoes>) sh.getCategory(id);
        MyList myList;
        return Response.status(200).entity(shoes).build();

    }



}
