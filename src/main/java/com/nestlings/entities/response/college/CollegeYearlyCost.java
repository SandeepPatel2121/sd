package com.nestlings.entities.response.college;

/**
 * Created by mclau on 1/25/2017.
 */
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

    public Integer getCollegeDetailsId() {
        return collegeDetailsId;
    }

    public void setCollegeDetailsId(Integer collegeDetailsId) {
        this.collegeDetailsId = collegeDetailsId;
    }

    public Double getInStateTuitionUndGrad() {
        if(inStateTuitionUndGrad == null) {
            return 0D;
        }
        return inStateTuitionUndGrad;
    }

    public void setInStateTuitionUndGrad(Double inStateTuitionUndGrad) {
        this.inStateTuitionUndGrad = inStateTuitionUndGrad;
    }

    public Double getInStateFeesUndGrad() {
        if(inStateFeesUndGrad == null) {
            return 0D;
        }
        return inStateFeesUndGrad;
    }

    public void setInStateFeesUndGrad(Double inStateFeesUndGrad) {
        this.inStateFeesUndGrad = inStateFeesUndGrad;
    }

    public Double getInStateCrdtHrChrgUndGrad() {
        if(inStateCrdtHrChrgUndGrad == null) {
            return 0D;
        }
        return inStateCrdtHrChrgUndGrad;
    }

    public void setInStateCrdtHrChrgUndGrad(Double inStateCrdtHrChrgUndGrad) {
        this.inStateCrdtHrChrgUndGrad = inStateCrdtHrChrgUndGrad;
    }

    public Double getOutOfStateTuitionUndGrad() {
        if(outOfStateTuitionUndGrad == null) {
            return 0D;
        }
        return outOfStateTuitionUndGrad;
    }

    public void setOutOfStateTuitionUndGrad(Double outOfStateTuitionUndGrad) {
        this.outOfStateTuitionUndGrad = outOfStateTuitionUndGrad;
    }

    public Double getOutOfStateFeesUndGrad() {
        if(outOfStateFeesUndGrad == null) {
            return 0D;
        }
        return outOfStateFeesUndGrad;
    }

    public void setOutOfStateFeesUndGrad(Double outOfStateFeesUndGrad) {
        this.outOfStateFeesUndGrad = outOfStateFeesUndGrad;
    }

    public Double getOutOfStateCrdtHrChrgUndGrad() {
        if(outOfStateCrdtHrChrgUndGrad == null) {
            return 0D;
        }
        return outOfStateCrdtHrChrgUndGrad;
    }

    public void setOutOfStateCrdtHrChrgUndGrad(Double outOfStateCrdtHrChrgUndGrad) {
        this.outOfStateCrdtHrChrgUndGrad = outOfStateCrdtHrChrgUndGrad;
    }

    public Double getInStateTuitionGrad() {
        if(inStateTuitionGrad == null) {
            return 0D;
        }
        return inStateTuitionGrad;
    }

    public void setInStateTuitionGrad(Double inStateTuitionGrad) {
        this.inStateTuitionGrad = inStateTuitionGrad;
    }

    public Double getInStateFeesGrad() {
        if(inStateFeesGrad == null) {
            return 0D;
        }
        return inStateFeesGrad;
    }

    public void setInStateFeesGrad(Double inStateFeesGrad) {
        this.inStateFeesGrad = inStateFeesGrad;
    }

    public Double getInStateCrdtHrChrgGrad() {
        if(inStateCrdtHrChrgGrad == null) {
            return 0D;
        }
        return inStateCrdtHrChrgGrad;
    }

    public void setInStateCrdtHrChrgGrad(Double inStateCrdtHrChrgGrad) {
        this.inStateCrdtHrChrgGrad = inStateCrdtHrChrgGrad;
    }

    public Double getOutOfStateTuitionGrad() {
        if(outOfStateTuitionGrad == null) {
            return 0D;
        }
        return outOfStateTuitionGrad;
    }

    public void setOutOfStateTuitionGrad(Double outOfSateTuitionGrad) {
        this.outOfStateTuitionGrad = outOfSateTuitionGrad;
    }

    public Double getOutOfStateFeesGrad() {
        if(outOfStateFeesGrad == null) {
            return 0D;
        }
        return outOfStateFeesGrad;
    }

    public void setOutOfStateFeesGrad(Double outOfStateFeesGrad) {
        this.outOfStateFeesGrad = outOfStateFeesGrad;
    }

    public Double getOutOfStateCrdtHrChrgGrad() {
        if(outOfStateCrdtHrChrgGrad == null) {
            return 0D;
        }
        return outOfStateCrdtHrChrgGrad;
    }

    public void setOutOfStateCrdtHrChrgGrad(Double outOfStateCrdtHrChrgGrad) {
        this.outOfStateCrdtHrChrgGrad = outOfStateCrdtHrChrgGrad;
    }

    public Double getBookSupplies() {
        if(bookSupplies == null) {
            return 0D;
        }
        return bookSupplies;
    }

    public void setBookSupplies(Double bookSupplies) {
        this.bookSupplies = bookSupplies;
    }

    public Double getOnCampusRoomBoard() {
        if(onCampusRoomBoard == null) {
            return 0D;
        }
        return onCampusRoomBoard;
    }

    public void setOnCampusRoomBoard(Double onCampusRoomBoard) {
        this.onCampusRoomBoard = onCampusRoomBoard;
    }

    public Double getOnCampusOtherExp() {
        if(onCampusOtherExp == null) {
            return 0D;
        }
        return onCampusOtherExp;
    }

    public void setOnCampusOtherExp(Double onCampusOtherExp) {
        this.onCampusOtherExp = onCampusOtherExp;
    }

    public Double getOffCampusNoFamilyExp() {
        if(offCampusNoFamilyExp == null) {
            return 0D;
        }
        return offCampusNoFamilyExp;
    }

    public void setOffCampusNoFamilyExp(Double offCampusNoFamilyExp) {
        this.offCampusNoFamilyExp = offCampusNoFamilyExp;
    }

    public Double getOffCampusWithFamilyExp() {
        if(offCampusWithFamilyExp == null) {
            return 0D;
        }
        return offCampusWithFamilyExp;
    }

    public void setOffCampusWithFamilyExp(Double offCampusWithFamilyExp) {
        this.offCampusWithFamilyExp = offCampusWithFamilyExp;
    }
}
