package com.imooc.sm.controller;

import com.imooc.sm.entity.SectionClassify;
import com.imooc.sm.entity.SectionList;
import com.imooc.sm.entity.User;
import com.imooc.sm.service.SectionClassifyService;
import com.imooc.sm.service.SectionListService;
import com.imooc.sm.service.SelfService;
import com.imooc.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller("selfController")
public class SelfController {
    @Autowired
    private SelfService selfService;
    @Autowired
    private SectionListService sectionListService;
    @Autowired
    private SectionClassifyService sectionClassifyService;
    @Autowired
    UserService userService;
    /*
    * 去登陆页面
    * */
    public void toLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("../login.jsp");
    }
    /*
    * 登陆判断操作
    * 用户名密码正确进入 category.jsp
    * */
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String account= request.getParameter("username");
        String password= request.getParameter("password");
        User user= selfService.login(account,password);
        if(user==null){
            response.sendRedirect("toLogin.do");
        }else {
            HttpSession session=request.getSession();
            session.setAttribute("USER",user);
            request.getRequestDispatcher("../sectionClassify/main.do").forward(request,response);
        }
    }
    public void toRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("../self_register.jsp").forward(request,response);
    }
    public void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        String name=  request.getParameter("name");
        String sex=request.getParameter("sex");
        String account=request.getParameter("account");
        String idNumber=request.getParameter("idNumber");
        String password1=request.getParameter("password1");
        String password2=request.getParameter("password2");
        String bornDate=request.getParameter("bornDate");
        String info=request.getParameter("info");
        User user=new User();
        user.setName(name);
        user.setSex(sex);
        user.setAccount(account);
        user.setIdNumber(idNumber);
        if (password1.equals(password2)){
            user.setPassword(password1);
        }else {
            response.sendRedirect("self_register.jsp");
        }
        user.setBornDate(new SimpleDateFormat("yyyy-MM-dd").parse(bornDate));
        user.setInfo(info);
        userService.addUser(user);
        request.getRequestDispatcher("toLogin.do").forward(request,response);
    }
}
