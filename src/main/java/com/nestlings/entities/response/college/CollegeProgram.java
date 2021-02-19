package com.nestlings.entities.response.college;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CollegeProgram {

    private Integer unitid;
    private float cipcode;
    private Integer majornum;
    private String programName;
    private List<ProgramTypes> subTypes;
}
