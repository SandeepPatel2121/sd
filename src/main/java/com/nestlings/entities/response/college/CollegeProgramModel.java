package com.nestlings.entities.response.college;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CollegeProgramModel {
    private Integer unitid;
    private float cipcode;
    private Integer majornum;
    private String name;
    private String degreeTypes;
}
