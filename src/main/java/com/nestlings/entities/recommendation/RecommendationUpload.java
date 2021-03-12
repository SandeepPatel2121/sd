package com.nestlings.entities.recommendation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecommendationUpload {

    private String recommenderName;
    private String recommenderDesignation;
    private String recommendationDate;

}
