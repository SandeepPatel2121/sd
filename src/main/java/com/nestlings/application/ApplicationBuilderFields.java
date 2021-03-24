package com.nestlings.application;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class ApplicationBuilderFields {

	private Integer appBuilderFieldsId;
	private List<Field> fieldsList;
	@JsonIgnore
	private String fieldsData;

	public Integer getAppBuilderFieldsId() {
		return appBuilderFieldsId;
	}

	public void setAppBuilderFieldsId(Integer appBuilderFieldsId) {
		this.appBuilderFieldsId = appBuilderFieldsId;
	}
	
	public List<Field> getFieldsList() {
		return fieldsList;
	}

	public void setFieldsList(List<Field> fieldsList) {
		this.fieldsList = fieldsList;
	}

	public void setFieldsData(String fieldData){
		if(fieldData != null) {
            Gson gson = new Gson();
            Type type = new TypeToken<List<Field>>() {}.getType();
            fieldsList = gson.fromJson(fieldData, type);
            this.fieldsData = fieldData;
        }
	}
	
	public String getFieldsData(){
        if(getFieldsList() != null) {
        	Gson gson = new Gson();
            this.fieldsData = gson.toJson(getFieldsList());
        }
        
        return this.fieldsData;

    }

}
