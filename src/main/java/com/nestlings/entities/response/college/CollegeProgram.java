package com.nestlings.entities.response.college;

import com.nestlings.entities.programs.ProgramDates;
import com.nestlings.entities.programs.ProgramLanguage;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class CollegeProgram {

    private Integer unitid;
    private float cipcode;
    private Integer majornum;
    private String name;
    private String degreeTypes;
    private BigDecimal fees;
    private List<ProgramDates> startdates;
    private List<ProgramLanguage> languages;
}
