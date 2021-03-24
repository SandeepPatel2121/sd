package com.nestlings.entities.request;

import com.nestlings.user.device.UserDeviceModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UniversityRegistrationRequest extends RegistrationRequest{

    private String universityName;
    private String universityPhone;
    private String websiteUrl;
    private String facebookUrl;
    private String linkedInUrl;
    private String instagramUrl;
    private String twitterUrl;
}
