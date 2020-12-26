
package com.nestlings.entity.collage;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ú
 */
@Setter
@Getter
public class CollegeYearlyCost {
    
    private Integer collegeDetailsId;
    private Double inStateTuitionUndGrad;
    private Double inStateFeesUndGrad;
    private Double inStateCrdtHrChrgUndGrad;
    private Double outOfStateTuitionUndGrad;
    private Double outOfStateFeesUndGrad;
    private Double outOfStateCrdtHrChrgUndGrad;
    private Double inStateTuitionGrad;
    private Double inStateFeesGrad;
    private Double inStateCrdtHrChrgGrad;
    private Double outOfStateTuitionGrad;
    private Double outOfStateFeesGrad;
    private Double outOfStateCrdtHrChrgGrad;
    private Double bookSupplies;
    private Double onCampusRoomBoard;
    private Double onCampusOtherExp;
    private Double offCampusNoFamilyExp;
    private Double offCampusWithFamilyExp;
    
}
