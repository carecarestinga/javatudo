package com.caretronics.genericrest;

@XmlRootElement
public abstract class AbstractRest<T extends IEntity> {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

