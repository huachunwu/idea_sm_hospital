package com.imooc.sm.controller;

import com.imooc.sm.entity.SectionClassify;
import com.imooc.sm.entity.SectionList;
import com.imooc.sm.service.SectionClassifyService;
import com.imooc.sm.service.SectionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller("hospitalDetailController")
public class HospitalDetailController {

    @Autowired
    private SectionListService sectionListService;
    @Autowired
    private SectionClassifyService sectionClassifyService;
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SectionList> sectionList= sectionListService.getAll();
        List<SectionClassify> sectionClassify=sectionClassifyService.getAll();
        request.setAttribute("SectionClassify",sectionClassify);
        request.setAttribute("SectionList",sectionList);
        request.getRequestDispatcher("../hospital_detail.jsp").forward(request,response);
    }

}
