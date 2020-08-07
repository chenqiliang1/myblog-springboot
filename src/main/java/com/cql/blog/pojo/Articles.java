package com.cql.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Articles {

  private Integer id;
  private String title;
  private String content;
  private String flag;
  private String deleted;
  private String picture;
  private Integer typeId;
  private String description;
  private Integer view;
  private Integer comment;
  private Date createTime;
  private Date updateTime;

}
