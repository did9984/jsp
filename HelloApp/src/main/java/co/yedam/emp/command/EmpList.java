package co.yedam.emp.command;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Command;
import co.yedam.emp.service.EmpService;
import co.yedam.emp.service.EmpServiceMybatis;
import co.yedam.emp.vo.EmpVO;

public class EmpList implements Command {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		EmpService service = new EmpServiceMybatis();
		List<EmpVO> list = service.empList();
		for (EmpVO emp : list) {
			System.out.println(emp);
		}

		req.setAttribute("empList", list);

		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/result/empList.jsp");
		try {
			rd.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
