/*  Using POJO class
 * 
 */

package pages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import POJO.Emp99_pojo;
import utils.DbUtils2;

public class BasicJDBCconnectionOption5 {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement =null;

		try {
			connection = DbUtils2.getConnection();
			System.out.println("connected to database");

			
			statement = connection.createStatement();
			String sql="SELECT * FROM EMP99";
			
			ResultSet rs =  statement.executeQuery(sql);
			
			//option-1 using default constructor.
			/*while (rs.next()) {
				
				Emp99_pojo emp99 = new Emp99_pojo(); 
				String empno = rs.getString(1);
				emp99.setEmpno(empno);
				String ename = rs.getString(2);
				emp99.setEname(ename);
				float sal = rs.getFloat(3);
				emp99.setSal(sal);
				int deptno = rs.getInt(4);
				emp99.setDeptno(deptno);
				String job = rs.getString(5);
				emp99.setJob(job);
				String mgr = rs.getString(6);
				emp99.setMgr(mgr);
				
				System.out.println(emp99.toString());
				//System.out.printf("%-4s\t%-10s\t%-10.2f\t%-2d\t%-2s\t%-4s\n", empno, ename, sal, deptno, job, mgr);
			}
			*/
			
			//option 2 - using parametarized constructor
			while(rs.next()) {
				Emp99_pojo emp99 = new Emp99_pojo(rs.getString(1),rs.getString(2),rs.getInt(3), rs.getInt(4),rs.getString(5),rs.getString(6));
				System.out.println(emp99.toString());
			}
			
		} catch (Exception e) {
			System.out.println("error!");
			e.printStackTrace();
		}
	}

}
