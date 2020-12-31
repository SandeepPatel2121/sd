package com.nestlings.entities.messaging;

import com.nestlings.entities.utils.NestlingUtils;
import com.nestlings.member.MemberInfo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class MessageReplyDetails {

    private Integer messageReplyId;
    private Integer replyCreatedBy;
    private String replyCreatedByName;
    private List<MemberInfo> replyToMembers;
    private String replyCreatedDate;
    private String content;
    private Integer securityRoleId;

    public Integer getMessageReplyId() {
        return messageReplyId;
    }

    public void setMessageReplyId(Integer messageReplyId) {
        this.messageReplyId = messageReplyId;
    }

    public Integer getReplyCreatedBy() {
        return replyCreatedBy;
    }

    public void setReplyCreatedBy(Integer replyCreatedBy) {
        this.replyCreatedBy = replyCreatedBy;
    }

    public String getReplyCreatedByName() {
        return replyCreatedByName;
    }

    public void setReplyCreatedByName(String replyCreatedByName) {
        this.replyCreatedByName = replyCreatedByName;
    }

    public List<MemberInfo> getReplyToMembers() {
        return replyToMembers;
    }

    public void setReplyToMembers(List<MemberInfo> replyToMembers) {
        this.replyToMembers = replyToMembers;
    }

    public String getReplyCreatedDate() {
        return NestlingUtils.convertDateStringFormat(replyCreatedDate,NestlingUtils.TIMESTAMP_FORMAT,NestlingUtils.MONTH_DAY_YEAR_TIME_FORMAT);
    }

    public void setReplyCreatedDate(String replyCreatedDate) {
        this.replyCreatedDate = replyCreatedDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSecurityRoleId() {
        return securityRoleId;
    }

    public void setSecurityRoleId(Integer securityRoleId) {
        this.securityRoleId = securityRoleId;
    }


}
