package com.nestlings.entities.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FriendListRequest {
    private int page;
    private int limit;
    private String searchKeyword;
    private String sortField;
    private String sortOrder;
}
