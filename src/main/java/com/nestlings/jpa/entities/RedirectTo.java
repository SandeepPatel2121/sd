package com.nestlings.jpa.entities;

public enum RedirectTo {

    SAVE_UNIVERSITY("Save University"),
    MY_PREFERENCE("My Preference");

    private String value;

    private RedirectTo(String value) {
        this.value = value;
    }
}
