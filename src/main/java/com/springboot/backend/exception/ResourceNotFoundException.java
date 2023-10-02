package com.springboot.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceNameString;
	private String fieldNameString;
	private Object fieldValueObject;
	public ResourceNotFoundException(String resourceNameString, String fieldNameString, Object fieldValueObject) {
		super(String.format("%s not found with %s : '%s'",resourceNameString,fieldNameString, fieldValueObject));
		this.setResourceNameString(resourceNameString);
		this.setFieldNameString(fieldNameString);
		this.fieldValueObject = fieldValueObject;
	}
	public String getResourceNameString() {
		return resourceNameString;
	}
	public void setResourceNameString(String resourceNameString) {
		this.resourceNameString = resourceNameString;
	}
	public String getFieldNameString() {
		return fieldNameString;
	}
	public void setFieldNameString(String fieldNameString) {
		this.fieldNameString = fieldNameString;
	}
}
