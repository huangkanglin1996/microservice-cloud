package cn.huangkanglin.springcloud.service.impl;

import cn.huangkanglin.springcloud.dao.DeptDao;
import cn.huangkanglin.springcloud.entities.Dept;
import cn.huangkanglin.springcloud.service.DeptService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        List<Dept> all = deptDao.findAll();
        return all;
    }
}
