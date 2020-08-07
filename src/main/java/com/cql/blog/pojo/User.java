package com.cql.blog.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private Integer id;
  private String name;
  private String gender;
  private Integer age;
  private Date birthday;
  private String hobby;
  private String personal;
  private String description;
  private Date createTime;
  private Date updateTime;

}
