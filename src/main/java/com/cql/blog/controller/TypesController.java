package com.cql.blog.controller;

import com.cql.blog.dto.R;
import com.cql.blog.handler.BlogException;
import com.cql.blog.pojo.Types;
import com.cql.blog.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * TODO
 *
 * @author 陈琪亮
 * @version 1.0
 * @date 2020/8/7 18:40
 */
@RestController
@RequestMapping("/admin")
@CrossOrigin
public class TypesController {

    @Autowired
    private TypesService typesService;

    @PostMapping("/addType")
    public R addType(@RequestBody Types type){
        if(StringUtils.isEmpty(type.getName().trim())){
            throw new BlogException(20001,"分类名不能为空");
        }
        typesService.save(type);
        return R.ok();
    }

    @PutMapping("/updateType/{id}")
    public R updateType(Types types){
        Types byId = typesService.getById(types.getId());
        if(byId == null){
            throw new BlogException(20001,"分类找不到");
        }else{
            typesService.updateById(byId);
        }
        return R.ok();
    }

    @DeleteMapping("/deleteType/{id}")
    public R deleteType(@PathVariable("id") Integer id){
        Types byId = typesService.getById(id);
        if(byId == null){
            throw new BlogException(20001,"分类找不到");
        }else{
            typesService.removeById(id);
        }
        return R.ok();
    }

    @GetMapping("/allType")
    public R getList(){
        List<Types> list = typesService.list(null);
        return R.ok().data("types",list);
    }


}
