package com.nestlings.entities.agent;

import com.nestlings.jpa.entities.AbstractDomain;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Entity(name = "agent_details")
@Getter
@Setter
@NoArgsConstructor
public class AgentSignUpDetails extends AbstractDomain implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agentId")
    private Long id;
    
    private Integer userId;
    
    private String companyName;
    private String ownerName;
    private String email;
    private String contactnumber;
    private String webSite;
    private String facebookLink;
    private String instagramLink;
    private String linkedLink;
    private String twitterLink;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    private String gender;
    private String referringCountry;
    
}
