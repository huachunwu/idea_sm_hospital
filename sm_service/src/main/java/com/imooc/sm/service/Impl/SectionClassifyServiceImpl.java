package com.imooc.sm.service.Impl;

import com.imooc.sm.dao.SectionClassifyDao;
import com.imooc.sm.entity.SectionClassify;
import com.imooc.sm.service.SectionClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("sectionClassifyService")
public class SectionClassifyServiceImpl implements SectionClassifyService {
    @Autowired
    private SectionClassifyDao sectionClassifyDao;

    @Override
    public void addSectionClassify(SectionClassify sectionClassify) {
        sectionClassify.setCreateTime(new Date());
        sectionClassify.setLastUpdateTime(new Date());
        sectionClassifyDao.insert(sectionClassify);
    }

    @Override
    public void remove(Integer id) {
        sectionClassifyDao.delete(id);
    }

    @Override
    public void edit(SectionClassify sectionClassify) {
        sectionClassify.setLastUpdateTime(new Date());
        sectionClassifyDao.update(sectionClassify);
    }

    @Override
    public SectionClassify get(Integer id) {
        return sectionClassifyDao.selectById(id);
    }

    @Override
    public List<SectionClassify> getAll() {
        return sectionClassifyDao.selectAll();
    }
}
