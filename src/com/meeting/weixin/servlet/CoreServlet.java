package com.meeting.weixin.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.meeting.weixin.util.SignUtil;
import com.meeting.weixin.service.CoreService;
/**
 * ����: CoreServlet
 * ����: ������΢�ŷ�����������Ϣ
 * ����ʱ�䣺2017-2-10 
 * �����汾��V1.0 
 */
public class CoreServlet extends HttpServlet {
	 private static final long serialVersionUID = 4323197796926899691L;
	
	/**
     * ȷ����������΢�ŷ�����
     */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
			
			//΢�ż���ǩ��
			String signature = request.getParameter("signature");
			//ʱ���
			String timestamp = request.getParameter("timestamp");
			//�����
			String nonce = request.getParameter("nonce");
			//����ַ���
			String echostr = request.getParameter("echostr");
			
			PrintWriter out = response.getWriter();
			
			//ͨ������
			if( SignUtil.checkSignature(signature, timestamp, nonce)){
				out.print(echostr);
				System.out.println("��֤ͨ��");
			}else{
				System.out.println("��֤��ͨ��");
			}
					        
			out.close();
			out = null;
	}


	
	/*����΢�ŷ�������������Ϣ*/
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		System.out.println("POST");
		
        // ��Ϣ�Ľ��ա�������Ӧ
        // ��������Ӧ�ı��������ΪUTF-8����ֹ�������룩
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // ���ú���ҵ���������Ϣ��������Ϣ
        String respXml = CoreService.processRequest(request);

        // ��Ӧ��Ϣ
        PrintWriter out = response.getWriter();
        out.print(respXml);
        out.close();
    }
	
	
}
