package com.eshop.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eshop.bean.ProductBean;
import com.eshop.daoImpl.ProductDao;

public class ProductServlet extends HttpServlet{

ProductDao dao=new ProductDao();
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	
	
	int id=Integer.parseInt(req.getParameter("id"));
	
	try {
		List<ProductBean> list=dao.getProduct(id);
		if(list!=null){
			req.setAttribute("list",list);
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			
			
		}
		//  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
