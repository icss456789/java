import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestFormServlet")
public class RequestFormServlet extends HttpServlet {

	//��Ӧ�ͻ��˷��͵�get����
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//��ñ��е��û��������루���������
		
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		
		//��ӡ���������̨
		System.out.println("�û�����" + username);
		System.out.println("���룺" + userpwd);

		
		System.out.println("doGet...");
		
		//��Ӧ���������
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>get��½�ɹ�</h1>");
	}


			//	��Ӧ�ͻ��˷��͵�post����
			protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//��ñ��е��û��������루���������
		
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		
		//��ӡ���������̨
		System.out.println("�û�����" + username);
		System.out.println("���룺" + userpwd);
		
		System.out.println("doPost...");	
		
		//��Ӧ���������
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<h1>post��½�ɹ�</h1>");
	}

}