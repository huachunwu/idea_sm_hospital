package com.imooc.sm.service;

import com.imooc.sm.entity.SectionClassify;

import java.util.List;

public interface SectionClassifyService {
    void addSectionClassify(SectionClassify sectionClassify);
    void remove(Integer id);
    void edit(SectionClassify sectionClassify);
    SectionClassify get(Integer id);
    List<SectionClassify> getAll();
}
