package com.imooc.sm.dao;

import com.imooc.sm.entity.SectionList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sectionListDao")
public interface SectionListDao {
    void insert(SectionList sectionList);
    void delete(Integer id);
    void update(SectionList sectionList);
    SectionList selectById(Integer id);
    List<SectionList> selectByScid(Integer scid);
    List<SectionList> selectAll();
}
