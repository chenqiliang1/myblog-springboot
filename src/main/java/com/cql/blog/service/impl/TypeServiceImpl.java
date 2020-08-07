package com.cql.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cql.blog.mapper.TypesMapper;
import com.cql.blog.pojo.Types;
import com.cql.blog.service.TypesService;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author 陈琪亮
 * @version 1.0
 * @date 2020/8/7 18:35
 */
@Repository
public class TypeServiceImpl extends ServiceImpl<TypesMapper, Types> implements TypesService {
}
