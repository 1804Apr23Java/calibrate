package com.revature.beans;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, Integer> {
	
	public Integer convertToDatabaseColumn(Status status) {
		return status.getCode();
	}


	public Status convertToEntityAttribute(Integer code) {
		return Status.fromCode(code);
	}
}
