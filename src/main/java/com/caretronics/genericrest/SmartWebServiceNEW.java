package com.caretronics.genericrest;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;

import com.sun.mail.iap.Response;

public abstract class SmartWebServiceNEW<R extends AbstractRest<T>> {

    @GET
    @Produces({MediaType.APPLICATION_XML})
    public Response findAll() {
        List<T> lista = getDelegate().findAll();
        if (lista == null || lista.isEmpty()) {
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        List<R> retorno = new ArrayList<R>();
        for (T it : lista) {
            retorno.add(toRest(it));
        }
        GenericEntity entity = listToGenericEntity(retorno);
        return Response.ok(entity).build();
    }

    protected abstract GenericEntity listToGenericEntity(List<R> restList);   
}