package com.Abbas.Book_Network_api.Handler;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.hibernate.mapping.Set;

import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExceptionResponse {

    private Integer businessErrorCode;
    private String businessErrorDescription;
    private String error;
    private Set<String> validationErrors;
    private Map<String, String> errors;
}
