package rikkei.academy;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "productDiscountCalculator", value = "/pd-calculator")
public class DiscountServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        double price = Float.parseFloat(req.getParameter("price"));
        double discount = Float.parseFloat(req.getParameter("discount"));
        double discountAmount = price * discount * 0.01;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product description: " + description + "</h1>");
        writer.println("<h1>Price: " + price + "</h1>");
        writer.println("<h1>Discount: " + discount + "%</h1>");
        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        writer.println("<h1>Discount Price: " + (price - discountAmount) + "</h1>");
        writer.println("</html>");
    }

    public void destroy() {
    }
}