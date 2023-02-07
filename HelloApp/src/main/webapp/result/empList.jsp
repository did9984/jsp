<%@page import="co.yedam.emp.vo.EmpVO" %>
  <%@page import="java.util.List" %>
    <%@page import="co.yedam.emp.service.EmpServiceImpl" %>
      <%@page import="co.yedam.emp.service.EmpService" %>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
          <!DOCTYPE html>
          <html>

          <head>
            <meta charset="UTF-8">
            <title>result/empList.jsp</title>
          </head>

          <body>
            <% EmpService service=new EmpServiceImpl(); List<EmpVO> list = service.empList();
              %>
              <h3>사원목록(EmpControl.do 의 결과 페이지.)</h3>
              <table border="1">
                <thead>
                  <tr>
                    <th>사원번호</th>
                    <th>LastName</th>
                  </tr>
                </thead>
                <tbody>
                  <% for (EmpVO emp : list) { %>
                    <tr>
                      <td>
                        <%=emp.getEmployeeId() %>
                      </td>
                      <td>
                        <%=emp.getLastName() %>
                      </td>
                    </tr>
                    <%}%>
                </tbody>
              </table>
          </body>

          </html>