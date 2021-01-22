package com.nestlings.entities.messaging;

import com.nestlings.entities.utils.NestlingUtils;
import com.nestlings.member.MemberInfo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class MessageDetails {

    private Integer messageId;
    private Integer messageReplyId;
    private Integer createdBy;
    private String createdByName;
    private List<MemberInfo> toMembers;
    private String contentTypeTag;
    private Integer contentTypeId;
    private String content;
    private String expireDate;
    private String createdDate;
    private String toMembersDisplay;
    private Integer securityRoleId;
    private List<MessageReplyDetails> messageReplies;

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public List<MemberInfo> getToMembers() {
        return toMembers;
    }

    public void setToMembers(List<MemberInfo> toMembers) {
        this.toMembers = toMembers;
    }

    public String getContentTypeTag() {
        return contentTypeTag;
    }

    public void setContentTypeTag(String contentTypeTag) {
        this.contentTypeTag = contentTypeTag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExpireDate() {
        if (expireDate != null) {
            return NestlingUtils.convertDateStringFormat(expireDate, NestlingUtils.TIMESTAMP_FORMAT, NestlingUtils.MONTH_DAY_YEAR_TIME_FORMAT);
        } else {
            return null;
        }
    }

    public String getExpireDateTimestamp() {
        return this.expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getToMembersDisplay() {
        if (toMembersDisplay == null && !toMembers.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < toMembers.size(); i++) {
                    MemberInfo mi = toMembers.get(i);
                    sb.append(mi.getFirstName() + " " + mi.getLastName());
                    if (i < toMembers.size() - 1) {
                        sb.append(", ");
                    }
                }
                toMembersDisplay = sb.toString();
        }
        return toMembersDisplay;
    }

    public void setToMembersDisplay(String toMembersDisplay) {
        this.toMembersDisplay = toMembersDisplay;
    }

    public void setCreatedDate(String date) {
        this.createdDate = date;
    }

    public String getCreatedDate() {
        return NestlingUtils.convertDateStringFormat(createdDate, NestlingUtils.TIMESTAMP_FORMAT, NestlingUtils.MONTH_DAY_YEAR_TIME_FORMAT);

    }

    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public Integer getSecurityRoleId() {
        return securityRoleId;
    }

    public void setSecurityRoleId(Integer securityRoleId) {
        this.securityRoleId = securityRoleId;
    }

    public List<MessageReplyDetails> getMessageReplies() {
        if (messageReplies == null) {
            messageReplies = new ArrayList<>();
        }
        return messageReplies;
    }

    public void setMessageReplies(List<MessageReplyDetails> messageReplies) {
        this.messageReplies = messageReplies;
    }

    public Integer getMessageReplyId() {
        return messageReplyId;
    }

    public void setMessageReplyId(Integer messageReplyId) {
        this.messageReplyId = messageReplyId;
    }

}