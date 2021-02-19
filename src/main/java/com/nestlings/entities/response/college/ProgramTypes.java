package com.nestlings.entities.response.college;

import com.nestlings.entities.programs.ProgramDates;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
public class ProgramTypes {
    private Long degreeId;
    private String degreeType;
    private String secondLanguage;
    private BigDecimal fees;
    private List<ProgramDates> startdates;
}
