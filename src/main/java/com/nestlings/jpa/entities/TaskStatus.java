/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nestlings.jpa.entities;

import lombok.Getter;

@Getter
public enum TaskStatus {
    PENDING("Pending"),
    COMPLETED("Completed");
    
    private final String status;
 
    private TaskStatus(String status) {
        this.status = status;
    }
}