package com.caretronics.genericrest;

public abstract class GenericDataResource<T extends GenericModel> {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        Query query = em.createNamedQuery(modelClass.getSimpleName()+".findAll");
        List<T> list = query.getResultList();
        return Response.ok(new GenericEntity<List<T>>(list) {}).build();
    }
}