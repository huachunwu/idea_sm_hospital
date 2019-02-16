package com.imooc.sm.service;

import com.imooc.sm.entity.SectionList;

import java.util.List;

public interface SectionListService {
    void add(SectionList sectionList);
    void remove(Integer id);
    void edit(SectionList sectionList);
    SectionList getById(Integer id);
    List<SectionList> getByScid(Integer scid);
    List<SectionList> getAll();
}
