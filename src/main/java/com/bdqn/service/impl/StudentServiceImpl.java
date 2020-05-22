package com.bdqn.service.impl;

import com.bdqn.entity.Students;
import com.bdqn.mapper.StudentsMapper;
import com.bdqn.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS , readOnly = true)
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentsMapper studentsMapper;

    public PageInfo<Students> queryStuAll(Integer page) {
//        分页设置
        PageHelper.startPage(page,3);  // 1.页码 2.每页显示条数
        List<Students> students = studentsMapper.selectAll();
        PageInfo<Students> studentsPageInfo = new PageInfo<Students>(students);
        return studentsPageInfo;
    }

    @Override
    @Transactional
    public void deleteStuById(Long id) {
        int i = studentsMapper.deleteByPrimaryKey(id);
        System.out.println(1/0);
        if(i > 0){
            System.out.println("删除成功！");
        }else {
            System.out.println("暂无此ID");
        }
    }

}
