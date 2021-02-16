/*  Using DAO class
 * 
 */

package pages;

import java.util.List;

import DAO.Emp99_DAO;
import POJO.Emp99_pojo;

public class BasicJDBCconnectionOption6 {

	public static void main(String[] args) {
		try(Emp99_DAO dao = new Emp99_DAO()){
			List<Emp99_pojo> e1 = dao.getEmpList99(); 
			for(Emp99_pojo e : e1) {
				System.out.println(e.toString());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
