package com.mydomain.teavm_firstapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Server
    extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            return;
        }
        String json = CoordinatesList.getJson();
        resp.setContentType("application/json");
        resp.getWriter().write(json);
    }

}