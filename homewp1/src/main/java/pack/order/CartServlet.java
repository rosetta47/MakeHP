package pack.order;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product_name = request.getParameter("product_name");
		int product_price = Integer.parseInt(request.getParameter("product_price"));
		
		// 세션을 만들면 알아서 쿠키를 만듬
		//세션에서 장바구니 목록을 가져옴
		HttpSession session = request.getSession(true);
		ArrayList<ProductDto> glist = (ArrayList<ProductDto>)session.getAttribute("list");
	
		if(glist == null) glist = new ArrayList<ProductDto>();
		glist.add(new ProductDto(product_name,product_price));
		session.setAttribute("list", glist);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>★ "+ product_name + " 구입했습니다");
		out.println("<br>[<a href='myshop.html'>계속 쇼핑</a>] ");
		out.println("[<a href='Buy'>결제하기</a>]<br>");
		
		out.println("<p><table with='80%'>");
		out.println("<tr><th>상품명</th><th>가격</th></tr>");
		for(int i =0; i<glist.size(); i++) {
			ProductDto goods = (ProductDto)glist.get(i);//상품 하나씩 빼는거
			out.println("<tr><td>" + goods.getProduct_name() + "</td>");
			out.println("<td>" + goods.getProduct_price() + "</td></tr>");
			
		}
		
		out.println("</table>");
		out.println("</body></html>");
		out.close();
		
       
	}
	

}
