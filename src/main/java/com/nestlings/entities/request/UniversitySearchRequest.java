package com.nestlings.entities.request;

public class UniversitySearchRequest {

    private String universityName;
    private String countryName;
    private Integer countryId;
    private boolean undergraduate;
    private boolean associates;
    private boolean bachelors;
    private boolean graduate;
    private boolean masters;
    private boolean doctoral;
    private boolean professional;
    private Double maxTuition;
    private String programs;
    private String fromModule;
    private boolean onlyRecommendedUniversities = false;
    private int page;
    private int limit;
    private String searchKeyword;
    private String sortField;
    private String sortOrder;


    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public boolean isUndergraduate() {
        return undergraduate;
    }

    public void setUndergraduate(boolean undergraduate) {
        this.undergraduate = undergraduate;
    }

    public boolean isAssociates() {
        return associates;
    }

    public void setAssociates(boolean associates) {
        this.associates = associates;
    }

    public boolean isBachelors() {
        return bachelors;
    }

    public void setBachelors(boolean bachelors) {
        this.bachelors = bachelors;
    }

    public boolean isGraduate() {
        return graduate;
    }

    public void setGraduate(boolean graduate) {
        this.graduate = graduate;
    }

    public boolean isMasters() {
        return masters;
    }

    public void setMasters(boolean masters) {
        this.masters = masters;
    }

    public boolean isDoctoral() {
        return doctoral;
    }

    public void setDoctoral(boolean doctoral) {
        this.doctoral = doctoral;
    }

    public boolean isProfessional() {
        return professional;
    }

    public void setProfessional(boolean professional) {
        this.professional = professional;
    }

    public Double getMaxTuition() {
        return maxTuition;
    }

    public void setMaxTuition(Double maxTuition) {
        this.maxTuition = maxTuition;
    }

    public String getPrograms() {
        return programs;
    }

    public void setPrograms(String programs) {
        this.programs = programs;
    }

    public boolean hasDegreeCriteria() {
        boolean success =false;
        if(isAssociates() ||isBachelors() || isDoctoral() || isGraduate() || isMasters() || isProfessional() || isUndergraduate() ) {
            success= true;
        }
        return success;
    }

    public String getFromModule() {
        return fromModule;
    }

    public void setFromModule(String fromModule) {
        this.fromModule = fromModule;
    }

    public boolean isOnlyRecommendedUniversities() {
        return onlyRecommendedUniversities;
    }

    public void setOnlyRecommendedUniversities(boolean onlyRecommendedUniversities) {
        this.onlyRecommendedUniversities = onlyRecommendedUniversities;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public String toString() {
        return "UniversitySearchRequest{" +
                "universityName='" + universityName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", countryId=" + countryId +
                ", undergraduate=" + undergraduate +
                ", associates=" + associates +
                ", bachelors=" + bachelors +
                ", graduate=" + graduate +
                ", masters=" + masters +
                ", doctoral=" + doctoral +
                ", professional=" + professional +
                ", maxTuition=" + maxTuition +
                ", programs='" + programs + '\'' +
                ", onlyRecommendedUniversities=" + onlyRecommendedUniversities  +
                '}';
    }
}
