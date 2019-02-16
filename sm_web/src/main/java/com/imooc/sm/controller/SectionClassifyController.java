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

@Controller("sectionClassifyController")
public class SectionClassifyController {
    @Autowired
    private SectionClassifyService sectionClassifyService;
    @Autowired
    private SectionListService sectionListService;
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public void toAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("../sectionClassify_add.jsp").forward(request,response);
    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name= request.getParameter("name");
        SectionClassify sectionClassify=new SectionClassify();
        sectionClassify.setName(name);
        sectionClassifyService.addSectionClassify(sectionClassify);
        request.getRequestDispatcher("main.do").forward(request,response);
    }
    public void toEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id= Integer.parseInt(request.getParameter("id"));
        SectionClassify sectionClassify=sectionClassifyService.get(id);
        List<SectionClassify> sectionClassifyList=sectionClassifyService.getAll();
        request.setAttribute("SectionClassify",sectionClassify);
        request.setAttribute("SectionClassifyList",sectionClassifyList);
        request.getRequestDispatcher("../sectionClassify_edit.jsp").forward(request,response);
    }
    public void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id= Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        SectionClassify sectionClassify=new SectionClassify();
        sectionClassify.setId(id);
        sectionClassify.setName(name);
        sectionClassifyService.edit(sectionClassify);
        request.getRequestDispatcher("main.do").forward(request,response);
    }
    public void main(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<SectionList> sectionList= sectionListService.getAll();
        List<SectionClassify> sectionClassify=sectionClassifyService.getAll();
        request.setAttribute("SectionClassify",sectionClassify);
        request.setAttribute("SectionList",sectionList);
        request.getRequestDispatcher("../category.jsp").forward(request,response);
    }
    public void remove(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Integer id= Integer.parseInt(request.getParameter("id"));
        sectionClassifyService.remove(id);
        request.getRequestDispatcher("main.do").forward(request,response);
    }
}
