package com.lixw.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lixw.gulimall.common.utils.PageUtils;
import com.lixw.gulimall.product.dao.CategoryDao;
import com.lixw.gulimall.product.entity.CategoryEntity;
import com.lixw.gulimall.product.service.CategoryService;
import com.lixw.gulimall.product.vo.Catelog2Vo;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lixw
 * @date 2021/05/27
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        final List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        final List<CategoryEntity> collect = categoryEntities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, categoryEntities));
                    return categoryEntity;
                })
                .sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
        return collect;
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        final List<CategoryEntity> collect = all.stream().filter(categoryEntity -> root.getCatId().equals(categoryEntity.getParentCid()))
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, all));
                    return categoryEntity;
                }).sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {

    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {
        return new Long[0];
    }

    @Override
    public void updateCascade(CategoryEntity category) {

    }

    @Override
    public List<CategoryEntity> getLevel1Categorys() {
        return null;
    }

    @Override
    public Map<String, List<Catelog2Vo>> getCatalogJson() {
        return null;
    }

    @Override
    public boolean save(CategoryEntity entity) {
        return false;
    }

    @Override
    public boolean saveBatch(Collection<CategoryEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<CategoryEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean removeById(Serializable id) {
        return false;
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return false;
    }

    @Override
    public boolean remove(Wrapper<CategoryEntity> queryWrapper) {
        return false;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return false;
    }

    @Override
    public boolean updateById(CategoryEntity entity) {
        return false;
    }

    @Override
    public boolean update(CategoryEntity entity, Wrapper<CategoryEntity> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<CategoryEntity> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(CategoryEntity entity) {
        return false;
    }

    @Override
    public CategoryEntity getById(Serializable id) {
        return null;
    }

    @Override
    public Collection<CategoryEntity> listByIds(Collection<? extends Serializable> idList) {
        return null;
    }

    @Override
    public Collection<CategoryEntity> listByMap(Map<String, Object> columnMap) {
        return null;
    }

    @Override
    public CategoryEntity getOne(Wrapper<CategoryEntity> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<CategoryEntity> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<CategoryEntity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<CategoryEntity> queryWrapper) {
        return 0;
    }

    @Override
    public List<CategoryEntity> list(Wrapper<CategoryEntity> queryWrapper) {
        return null;
    }

    @Override
    public IPage<CategoryEntity> page(IPage<CategoryEntity> page, Wrapper<CategoryEntity> queryWrapper) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<CategoryEntity> queryWrapper) {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Wrapper<CategoryEntity> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<CategoryEntity> page, Wrapper<CategoryEntity> queryWrapper) {
        return null;
    }

    @Override
    public CategoryDao getBaseMapper() {
        return null;
    }
}
