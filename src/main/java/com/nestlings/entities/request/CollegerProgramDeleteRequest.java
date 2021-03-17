package com.nestlings.entities.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CollegerProgramDeleteRequest {
    private Integer unitid;
    private Float cipcode;
    private Integer majornum;
}
