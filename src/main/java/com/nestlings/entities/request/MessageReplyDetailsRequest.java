package com.nestlings.entities.request;

import com.nestlings.member.MemberInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageReplyDetailsRequest {

    private Integer messageId;
    private Integer messageReplyId;
    private Integer replyCreatedBy;
    private String replyCreatedByName;
    private List<MemberInfo> replyToMembers;
    private String replyCreatedDate;
    private String content;
    private Integer securityRoleId;
    private String contentType;
}
