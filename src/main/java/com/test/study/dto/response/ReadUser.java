package com.test.study.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReadUser {
    private Long id;
    private String name;
    private int age;
}
