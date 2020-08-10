package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Flower;
import com.service.FlowerService;
import com.service.impl.FlowerServiceImpl;

@WebServlet("/show")
public class ShowServlet extends HttpServlet {
	private FlowerService flowerservice = new FlowerServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

		List<Flower> list = flowerservice.show();
		req.setAttribute("list", list);
		req.getRequestDispatcher("index.jsp").forward(req, rep);
	}

}
