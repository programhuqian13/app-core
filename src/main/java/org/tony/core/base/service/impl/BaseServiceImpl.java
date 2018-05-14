package org.tony.core.base.service.impl;

import org.tony.core.base.dao.BaseDao;
import org.tony.core.base.service.BaseService;

import java.util.List;

/**
 * @Description 相应的实现
 * @Version 1.0
 * @Author tony
 * @Date 2018/3/2
 * @ProjectName app-core
 * @PackageName org.tony.core.base.service.impl
 */
public class BaseServiceImpl<T,ID> implements BaseService<T,ID>{

    private BaseDao<T,ID> baseDao;

    private void setBaseDao(BaseDao<T,ID> baseDao){
        this.baseDao = baseDao;
    }

    @Override
    public void insert(T entity) {
        baseDao.insert(entity);
    }

    @Override
    public void update(T entity) {
        baseDao.update(entity);
    }

    @Override
    public void deleteById(ID id) {
        baseDao.deleteById(id);
    }

    @Override
    public void deleteByIds(List<ID> ids) {
        baseDao.deleteByIds(ids);
    }

    @Override
    public void batchInsert(List<T> entitys) {
        baseDao.batchInsert(entitys);
    }

    @Override
    public T selectById(ID id) {
        return baseDao.selectById(id);
    }

    @Override
    public List<T> findByParam(T entity) {
        return baseDao.findByParam(entity);
    }

    @Override
    public T isExitsName(String name) {
        return baseDao.isExitsName(name);
    }

    @Override
    public T updateExitsName(String name) {
        return baseDao.isExitsName(name);
    }
}
