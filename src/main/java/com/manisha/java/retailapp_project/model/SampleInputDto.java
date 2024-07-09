package com.manisha.java.retailapp_project.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SampleInputDto {
    @JsonProperty("prop11")
    String prop1;

    Integer prop2;

    Boolean prop3;
    LocalDateTime date;

}
