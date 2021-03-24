package com.nestlings.entities.response;

import com.nestlings.entities.response.college.CollegeDetails;
import com.nestlings.entities.response.college.CollegeDetailsForUniversity;
import com.nestlings.entity.user.domain.UserModel;
import com.nestlings.member.MemberDetails;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginResponseModel {
    private UserModel authDetails;
    private MemberDetails userDetails;
    private CollegeDetailsForUniversity collegeDetails;
}
