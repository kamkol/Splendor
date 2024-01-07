package com.splendor.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class AristocratNotFound {
	public AristocratNotFound(String message) {
		super();
	}

}
