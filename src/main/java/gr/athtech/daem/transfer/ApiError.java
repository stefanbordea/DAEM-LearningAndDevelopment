package gr.athtech.daem.transfer;

import lombok.Builder;
import lombok.Value;

import java.io.Serializable;

@Value
@Builder
public class ApiError implements Serializable {

	String description;
	Integer httpStatus;
	String path;
}
