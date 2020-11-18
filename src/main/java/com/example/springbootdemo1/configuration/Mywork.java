package com.example.springbootdemo1.configuration;

import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Data
@ConfigurationProperties("mywork")
@Validated
public class Mywork {
    @NotEmpty
    private String name;
    @NotEmpty
    @Email
    private String email;

}
