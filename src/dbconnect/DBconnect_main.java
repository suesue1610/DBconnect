package dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconnect_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id, year, ton;
		String name;
		ResultSet rs;

		MySQL mysql = new MySQL();

		rs = mysql.selectAll();

		try {
			while(rs.next()){
				id = rs.getInt("id");
				name = rs.getString("name");
				year = rs.getInt("year");
				ton = rs.getInt("ton");
				System.out.println("ID：" + id);
				System.out.println("name：" + name);
				System.out.println("year：" + year);
				System.out.println("ton：" + ton);
			}  //try catchで囲む
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
