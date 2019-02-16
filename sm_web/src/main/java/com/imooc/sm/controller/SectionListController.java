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

@Controller("sectionListController")
public class SectionListController {
    @Autowired
    private SectionListService sectionListService;
    @Autowired
    private SectionClassifyService sectionClassifyService;
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Integer scid= Integer.parseInt(request.getParameter("id"));
       List<SectionList> sectionList= sectionListService.getByScid(scid);
       List<SectionClassify> SectionClassify=sectionClassifyService.getAll();
       request.setAttribute("SectionList",sectionList);
       request.setAttribute("SectionClassify",SectionClassify);
       request.setAttribute("Scid",scid);
       request.getRequestDispatcher("../sectionList_list.jsp").forward(request,response);
    }
    public void toAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer scid= Integer.parseInt(request.getParameter("Scid"));
        request.setAttribute("Scid",scid);
        request.getRequestDispatcher("../sectionList_add.jsp").forward(request,response);
    }
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name= request.getParameter("name");
        Integer scid=Integer.parseInt(request.getParameter("Scid"));
        SectionList sectionList=new SectionList();
        sectionList.setName(name);
        sectionList.setScid(scid);
        sectionListService.add(sectionList);
        request.setAttribute("Scid",scid);
        request.getRequestDispatcher("otherList.do").forward(request,response);
    }
    public void otherList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer scid= (Integer) request.getAttribute("Scid");
        List<SectionList> sectionList= sectionListService.getByScid(scid);
        List<SectionClassify> SectionClassify=sectionClassifyService.getAll();
        request.setAttribute("SectionList",sectionList);
        request.setAttribute("SectionClassify",SectionClassify);
        request.setAttribute("Scid",scid);
        request.getRequestDispatcher("../sectionList_list.jsp").forward(request,response);
    }
    public void remove(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id=Integer.parseInt(request.getParameter("id"));
        SectionList sectionList=sectionListService.getById(id);
        Integer scid=sectionList.getScid();
        sectionListService.remove(id);
        request.setAttribute("Scid",scid);
        request.getRequestDispatcher("otherList.do").forward(request,response);
    }
    public void toEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id=Integer.parseInt(request.getParameter("id"));
        SectionList sectionList=sectionListService.getById(id);
        List<SectionClassify> sectionClassifyList=sectionClassifyService.getAll();
        request.setAttribute("SectionList",sectionList);
        request.setAttribute("SectionClassify",sectionClassifyList);
        request.getRequestDispatcher("../sectionList_edit.jsp").forward(request,response);
    }
    public void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id=Integer.parseInt(request.getParameter("id"));
        Integer scid=Integer.parseInt(request.getParameter("Scid"));
        String name=request.getParameter("name");
        SectionList sectionList=sectionListService.getById(id);
        sectionList.setName(name);
        sectionList.setScid(scid);
        sectionListService.edit(sectionList);
        request.setAttribute("Scid",sectionList.getScid());
        request.getRequestDispatcher("otherList.do").forward(request,response);
    }
}
