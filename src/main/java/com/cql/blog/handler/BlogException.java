package com.cql.blog.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO
 *
 * @author 陈琪亮
 * @version 1.0
 * @date 2020/8/7 18:19
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogException extends RuntimeException {

    private Integer code;
    private String message;

}
