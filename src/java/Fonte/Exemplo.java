/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fonte;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author caique
 */

//anotação servlet = mapear classe, mapear endereço no browser

@WebServlet (name="Exemplo", urlPatterns="/Exemplo")
public class Exemplo extends HttpServlet
{
    public void service (HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        String n=req.getParameter("nome");
        String m=req.getParameter("matricula");
        
        PrintWriter pw=res.getWriter();
        
        pw.println("<html><body><h1>Bem vindo, "+n+". Sua Matrícula é "+m+".</h1></body></html>");
    }
   
}
