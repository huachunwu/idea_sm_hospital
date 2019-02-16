package com.imooc.sm.service.Impl;

import com.imooc.sm.dao.SectionListDao;
import com.imooc.sm.entity.SectionList;
import com.imooc.sm.service.SectionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service("sectionListService")
public class SectionListServiceImpl implements SectionListService {

    @Autowired
    private SectionListDao sectionListDao;
    @Override
    public void add(SectionList sectionList) {
        sectionList.setCreateTime(new Date());
        sectionList.setLastUpdateTime(new Date());
        sectionListDao.insert(sectionList);
    }

    @Override
    public void remove(Integer id) {
        sectionListDao.delete(id);
    }

    @Override
    public void edit(SectionList sectionList) {
        sectionList.setLastUpdateTime(new Date());
        sectionListDao.update(sectionList);
    }

    @Override
    public SectionList getById(Integer id) {
        return sectionListDao.selectById(id);
    }

    @Override
    public List<SectionList> getByScid(Integer scid) {
        return sectionListDao.selectByScid(scid);
    }

    @Override
    public List<SectionList> getAll() {
        return sectionListDao.selectAll();
    }
}
