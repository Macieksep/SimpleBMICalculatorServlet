package com.macieksep.BMICalculator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/result")
public class BMIResult extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        double weight = Double.parseDouble(request.getParameter("weight"));
        double height = Double.parseDouble(request.getParameter("height"));

        double result = Math.round(((weight/Math.pow(height/100, 2))*100));
        result /= 100;

        PrintWriter writer = response.getWriter();

        if (!(result > 0)){

            writer.println("<h1>ERROR X.X</h1>");

        } else {

            writer.println(String.format("<h1>Your BMI: %s</h1>", result));

            String yourClass = "";

            if (result < 16){
                yourClass = "severe thinness";
            } else if (result <=17){
                yourClass = "moderate thinness";
            } else if (result <=18.5){
                yourClass = "mid thinness";
            } else if (result <=25){
                yourClass = "normal";
            } else if (result <=30){
                yourClass = "overweight";
            } else if (result <=17){
                yourClass = "obese class I";
            } else if (result <=17){
                yourClass = "obese class II";
            } else if (result >40){
                yourClass = "obese class III";
            }

            writer.println(String.format("<h2>You are %s</h1>", yourClass));

            writer.println("<table>");
            writer.println("<tr>");
            writer.println("<td>Adult classification</td> <td>BMI range - kg/m2</td>");
            writer.println("</tr>");
            writer.println("<tr>");
            writer.println("<td>Severe Thinness</td> <td>< 16</td>");
            writer.println("</tr>");
            writer.println("<tr>");
            writer.println("<td>Mild Thinness</td> <td>17 - 18.5</td>");
            writer.println("</tr>");
            writer.println("<tr>");
            writer.println("<td>Normal</td> <td>18.5 - 25</td>");
            writer.println("</tr>");
            writer.println("<tr>");
            writer.println("<td>Overweight</td> <td>25 - 30</td>");
            writer.println("</tr>");
            writer.println("<tr>");
            writer.println("<td>Obese Class I</td> <td>30 - 35</td>");
            writer.println("</tr>");
            writer.println("<tr>");
            writer.println("<td>Obese Class II</td> <td>35 - 40</td>");
            writer.println("</tr>");
            writer.println("<tr>");
            writer.println("<td>Obese Class III</td> <td>>40</td>");
            writer.println("</tr>");
            writer.println("</table>");

        }

    }

}
