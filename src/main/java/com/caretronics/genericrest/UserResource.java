package com.caretronics.genericrest;

@Path("users")
public class UserResource extends GenericDataResource<User> {

    public UserResource() {
        super(User.class);
    }
}