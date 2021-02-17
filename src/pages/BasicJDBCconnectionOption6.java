/*  using DAO(Emp99_DAO.java) , DbUtils.java,  POJO (Emp99_pojo.java)
 *  To separate business logic from data manipulation logic, then use DAO (Data Access Object) layer
 *  Rules: It must be packaged public class, It should contain default constructor, 
 *  It must contain CRUD operations.
 *  Per table there should be one POJO class and one DAO class.
 *  
 *  This code use to SELECT data from emp99 table and display on console.
 */

package pages;

import java.util.List;

import DAO.Emp99_DAO;
import POJO.Emp99_pojo;

//public class BasicJDBCconnectionOption6 {
//
//	public static void main(String[] args) {
//		try(Emp99_DAO dao = new Emp99_DAO()){  //use try with resource to close resource.
//			List<Emp99_pojo> e1 = dao.selectEmpList99(); //create a method getEmpList99() inside DAO (Emp99_DAO.java) class
//			for(Emp99_pojo e : e1) {
//				System.out.println(e.toString());
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

//option2 - write separate print() method to separate the print logic.
public class BasicJDBCconnectionOption6 {

	public static void print(List<Emp99_pojo> empList) {
		if (empList != null) {
			for (Emp99_pojo emp1 : empList) {
				System.out.println(emp1.toString());
			}
		}
	}

	// SELECT statement
	public static void main(String[] args) {
		try (Emp99_DAO dao = new Emp99_DAO()) {
			List<Emp99_pojo> e1 = dao.selectEmpList99();
			BasicJDBCconnectionOption6.print(e1);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
