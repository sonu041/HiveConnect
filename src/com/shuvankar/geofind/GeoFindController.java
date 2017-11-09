package com.shuvankar.geofind;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GeoFindController
 */
@WebServlet("/GeoFind")
public class GeoFindController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GeoFindController() {
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ipAddress = req.getParameter("ipaddress");
		System.out.println(ipAddress);
		(new GeoFindService()).getGeoLocation(ipAddress);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println((new GeoFindService()).getGeoLocation(ipAddress));
		out.close();		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
