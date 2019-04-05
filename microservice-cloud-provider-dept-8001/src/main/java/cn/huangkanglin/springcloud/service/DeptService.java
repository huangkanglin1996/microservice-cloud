package cn.huangkanglin.springcloud.service;

import cn.huangkanglin.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
