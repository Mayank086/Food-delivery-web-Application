package com.tap.foodapp;

import java.io.IOException;
import java.util.List;

import com.food.dao.RestaurantDAO;
import com.food.dao.Impl.RestaurantDAOImpl;
import com.food.model.Restaurant;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@WebServlet("/GetAllRestaurants")
public class GetAllRestaurants extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession();
		if(request.getCookies()[0].getValue()!=null) {
			
			response.sendRedirect("home.jsp");
		}else {
			response.sendRedirect("index.jsp");
		}
	}

}
