package homewp1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex1BoardDAO {
	//JDBS 관련변수
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//SQL 명령어
	private static String BOARD_INSERT = "insert into board(seq, title, wirter, content) values((select nvl(max(seq),0))+1 from board), ?,?,?)";
	private static String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private static String BOARD_DELETE="delete board where seq=?";
	private static String BOARD_GET = "select * from board where seq=?";
	private static String BOARD_LIST = "select * from board order by seq desc";
	
	//CRUD 기능의 메소드
	//글 등록
	public void insertBoard(Ex1BoardVO vo){
		try {
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
	}
}
