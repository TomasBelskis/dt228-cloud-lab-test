package ie.mydit.belskis.tomas;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LabTestServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("(A-B)*(C-D)");
		
		String AString = req.getParameter("A");
		String BString = req.getParameter("B");
		String CString = req.getParameter("C");
		String DString = req.getParameter("D");
		
		int numA = Integer.parseInt(AString);
		int numB = Integer.parseInt(BString);
		int numC = Integer.parseInt(CString);
		int numD = Integer.parseInt(DString);
		
		
		
		if(AString==""&&BString==""&&BString==""&&BString=="")
		{
			resp.getWriter().println("You have to enter values for A,B,C,D ");
		}
		if(numA<numB)
		{
			resp.getWriter().println("A cant be less than B ");
		}
		else if(numC<numD)
		{
			resp.getWriter().println("C cant be less than D");
		}else{
			int result = (numA-numB) * (numC - numD);
			resp.getWriter().println("(A:"+AString+ "-" + "B"+BString+")"+"*"+"(C:"+CString+"-"+"D:"+DString+")"+"Result="+""+ result);
		}
		
	}
}
