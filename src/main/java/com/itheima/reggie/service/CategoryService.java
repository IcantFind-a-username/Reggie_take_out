package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
