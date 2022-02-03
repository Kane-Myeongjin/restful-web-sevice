package com.example.restfulwebservice.user.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"password", "ssn"})
//@JsonFilter("UserInfo")
@ApiModel(description = "사용자 상세정보를 위한 도메인 객체")
public class User {
    private Integer id;

    @Size(min = 2, message = "Name은 2글자 이상 입력하세요.")
    @ApiModelProperty(notes = "사용자 이름")
    private String name;

    @Past
    @ApiModelProperty(notes = "사용자 등록일")
    private Date joinDate;

    //    @JsonIgnore
    @ApiModelProperty(notes = "사용자 패스워드")
    private String password;

    //    @JsonIgnore
    @ApiModelProperty(notes = "사용자 주민번호")
    private String ssn;
}
