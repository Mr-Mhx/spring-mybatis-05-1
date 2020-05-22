package com.bdqn.service;

import com.bdqn.entity.Students;
import com.github.pagehelper.PageInfo;

public interface StudentService {

    /**
     * 查询全部  -  分页显示数据
     *
     * @param page
     * @return
     */
    public PageInfo<Students> queryStuAll(Integer page);



    public void deleteStuById(Long id);


}
