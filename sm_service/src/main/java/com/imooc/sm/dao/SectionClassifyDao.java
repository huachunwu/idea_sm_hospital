package com.imooc.sm.dao;

import com.imooc.sm.entity.SectionClassify;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("sectionClassifyDao")
public interface SectionClassifyDao {
    void insert(SectionClassify sectionClassify);
    void delete(Integer id);
    void update(SectionClassify sectionClassify);
    SectionClassify selectById(Integer id);
    List<SectionClassify> selectAll();
}
