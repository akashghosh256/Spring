package in.sp.controllers;

import in.sp.dbconnection.DBconnection;
import in.sp.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/loginForm")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String myemail = req.getParameter("email1");
        String mypass= req.getParameter("pass1");

        try{
            Connection con = DBconnection.getConnection();
            String select_sql_query = "SELECT * FROM register WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(select_sql_query);
            ps.setString(1, myemail);
            ps.setString(2, mypass);

           ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("Login Succesfull");
                User user = new User();
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));

                HttpSession session = req.getSession();
                session.setAttribute("Session_user", user);


                RequestDispatcher rd = req.getRequestDispatcher("/index.html");
                rd.include(req,resp);
            }
            else{
                System.out.println("login Failed");
                RequestDispatcher rd = req.getRequestDispatcher("/login.html");
                rd.include(req,resp);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
