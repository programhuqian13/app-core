package org.tony.core.base.service;

import java.util.List;

/**
 * @Description 描述
 * @Version 1.0
 * @Author xuanyi@baofu.com
 * @Date 2018/3/2
 * @ProjectName app-core
 * @PackageName org.tony.core.base.service
 */
public interface BaseService<T,ID> {

    /***
     * 进行数据库添加操作
     * @param entity 泛型实体
     */
    void insert(T entity);

    /***
     * 进行数据库修改操作
     * @param entity
     */
    void update(T entity);

    /***
     * 进行数据库删除操作根据编号删除
     * @param id
     */
    void deleteById(ID id);

    /***
     * 批量删除 根据编号批量删除
     * @param ids
     */
    void deleteByIds(List<ID> ids);

    /***
     * 批量添加操作
     * @param entitys
     */
    void batchInsert(List<T> entitys);

    /***
     * 根据编号查询
     * @param id
     * @return
     */
    T selectById(ID id);

    /***
     * 根据查询条件进行查询
     * @param entity
     * @return
     */
    List<T> findByParam(T entity);

    /****
     * 添加重命名查询
     * @return
     */
    T isExitsName(String name);

    /***
     * 修改重命名查询
     * @return
     */
    T updateExitsName(String name);

}
