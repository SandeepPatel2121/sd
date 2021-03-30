package com.nestlings.entities.response.college;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentsForUniversity {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String gender;
    private String currentCountry;
    private String profileImageUrl;
}
