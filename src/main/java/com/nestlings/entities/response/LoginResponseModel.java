package com.nestlings.entities.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nestlings.entities.agent.AgentSignUpDetails;
import com.nestlings.entities.response.college.CollegeDetailsForUniversity;
import com.nestlings.entity.user.domain.UserModel;
import com.nestlings.member.MemberDetails;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginResponseModel {
    private UserModel authDetails;
    private MemberDetails userDetails;
    private CollegeDetailsForUniversity collegeDetails;
    private AgentSignUpDetails agentSignUpDetails;
}
