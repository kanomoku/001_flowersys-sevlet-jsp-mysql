package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Flower;
import com.service.FlowerService;
import com.service.impl.FlowerServiceImpl;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	FlowerService fs = new FlowerServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String production = req.getParameter("production");
		Flower flower = new Flower();
		flower.setName(name);
		flower.setPrice(Double.parseDouble(price));
		flower.setProduction(production);

		int index = fs.add(flower);
		if (index > 0) {
			// 重定向
			resp.sendRedirect("show");// 用重定向不用转发是防止表单重复提交
			// 转发
//			req.getRequestDispatcher("show").forward(req, resp);
		} else {
			resp.sendRedirect("add.jsp");
//			req.getRequestDispatcher("add.jsp").forward(req, resp);

		}

	}

}
