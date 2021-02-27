package com.nestlings.entities.enums;

public enum  DegreeTypes {

    ASSOCIATE(1,"Associate's"),
    BACHELOR(2,"Bachelor's"),
    MASTERS(3,"Master's"),
    OTHER(4,"Other");

    private final Integer id;
    private final String type;

    DegreeTypes(Integer id, String type) {
        this.id=id;
        this.type=type;
    }

    public String getType() {
        return this.type;
    }

    public Integer getId() {
        return id;
    }
}
