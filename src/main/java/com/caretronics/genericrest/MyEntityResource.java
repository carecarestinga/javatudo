package com.caretronics.genericrest;

@Path("/something")
@RequestScoped
public class MyEntityResource extends SmartWebServiceNEW<MyEntityExtendingAbstractRest> {

 @Override
    protected GenericEntity listToGenericEntity(List<MyEntityExtendingAbstractRest> restList) {
        return new GenericEntity<List<MyEntityExtendingAbstractRest>>(restList) {
        };
    }

}