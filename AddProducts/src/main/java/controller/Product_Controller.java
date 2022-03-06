package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product_Info;
import dao.Product_Dao;

/**
 * Servlet implementation class Product_Controller
 */
@WebServlet("/Product_Controller")
public class Product_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Product_Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw= response.getWriter();
		String id =request.getParameter("pid");
		Integer Id=Integer.parseInt(id);
		String name=request.getParameter("pname");
		String desc=request.getParameter("pdesc");
		Product_Info pi=new Product_Info();
		pi.setPid(Id);
		pi.setPname(name);
		pi.setPdesc(desc);
		Product_Dao pd = new Product_Dao();
		int p=pd.checkDetails(pi);
		/*
		 * RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		 * rd.forward(request, response);
		 */
		if(p==1) {
			pw.print("Table Inserted");
		}else {
			pw.print("not inserted");
		}
		
		 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
	}

}
