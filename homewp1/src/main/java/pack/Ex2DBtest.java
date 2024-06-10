package pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex2DBtest")
public class Ex2DBtest extends HttpServlet {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
       
	//DB연결에는 init, destroy 필요
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://localhost:3306/studyhome";
			conn = DriverManager.getConnection(url, "root", "4747");
			pstmt=conn.prepareStatement("select * from sangdata");
		} catch (Exception e) {
			System.out.println("연결실패 : " + e);
		}
	}

	
	public void destroy() {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=urf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>상품자료</h2>");
		try {
			rs=pstmt.executeQuery();
			while(rs.next()) {
				out.println(rs.getString("code")
						+", "+rs.getString("sang")
						+", "+rs.getString("su")
						+", "+rs.getString("dan")+"<br>");
				
			}
		} catch (Exception e) {
			System.out.println("시스템 에러:" + e);
		}
		out.println("</body></html>");
	}

}
