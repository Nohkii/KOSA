package core;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig (location = "c:/uploadtest", maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out= response.getWriter();
		request.setCharacterEncoding("utf-8"); // 입력한 이름 가져오기 
		String path = "c:/uploadtest";
		File isDir = new File(path);
		if (!isDir.isDirectory()) {
			isDir.mkdirs();
		}
		Collection<Part> parts = request.getParts(); // 몇개의 파트가 올 지 모르니까 컬렉션에 담아버림
		for (Part part : parts) {
			
			if (part.getContentType() != null) { // 업로드 한 애들만 있음 
				// header에 ContentType을 담고 있는 애만 들어감
				String fileName = part.getSubmittedFileName();
				if (fileName != null) {
					part.write(fileName.substring(0, fileName.lastIndexOf(".")) + "_"
							+ System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf(".")));
					// 업로드되는 파일에 시간정보를 넣으려고 이름을 바꿈
					// write 메소드를 사용하면 알아서 폴더에 넣어줌 
					out.print("<br>업로드한 파일 이름: " + fileName);
					out.print("<br>크기: " + part.getSize());				
				}
			} else { // 업로드한 부분 제외(이름, 나이)
				String partName = part.getName();
				String fieldValue = request.getParameter(partName);
				out.print("<br>" + partName + ": " + fieldValue);			
			}
		}
		out.close();
	}
}