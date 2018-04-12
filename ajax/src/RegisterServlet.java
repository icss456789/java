
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ���ע���������
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//���ñ���
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//��������
		PrintWriter out = response.getWriter();
		
		//����������
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		String myinfo = request.getParameter("myinfo");
		String sex = request.getParameter("sex");
		String[] skill  = request.getParameterValues("skill");
		String city = request.getParameter("city");
		String id = request.getParameter("id");
		
		//��ӡ���
		System.out.println("username=" + username);
		System.out.println("userpwd=" + userpwd);
		System.out.println("myinfo=" + myinfo);
		System.out.println("sex=" + sex);
		System.out.println("skill=" + Arrays.toString(skill));
		System.out.println("city=" + city);
		System.out.println("id=" + id);		
		
		//��Ӧ����
		out.print("ע��ɹ�");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}