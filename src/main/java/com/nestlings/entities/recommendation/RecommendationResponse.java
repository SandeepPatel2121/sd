package com.nestlings.entities.recommendation;

import com.nestlings.entities.fileupload.UserDocumentResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecommendationResponse {

    private Integer userRecommendationId;
    private String recommenderName;
    private String recommenderDesignation;
    private String recommendationDate;
    private List<UserDocumentResponse> recommendationDocuments;
}
