package com.sangeng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-10-21 14:10:42
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}

