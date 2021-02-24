/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nestlings.jpa.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
@MappedSuperclass
public class AbstractDomain implements Serializable{
    
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createdAt;

    private Long createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar updatedAt;

    private Long updatedBy;

    private boolean status=true;
    
    @PrePersist
    public void updateCreatedDate() {
        createdAt = updatedAt = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    @PreUpdate
    public void updateUpdatedDate() {
        updatedAt = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

}
