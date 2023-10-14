/*package core;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/getHTML", "/getXML", "/getJSON", "/getImage" })
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI(); // port부분을 뺀 나머지
		System.out.println(uri);
		String filename = "";
		System.out.println(getServletContext().getServerInfo());  // 서버(톰캣)의 정보
		System.out.println(getServletContext().getContextPath());  // 이클립스가 설정한 context 주소(프로젝트 이름과 동일)
		System.out.println(getServletContext().getRealPath("/"));  // 이클립스가 톰캣에게 알려주는 요상한 주소이다,, webapp(최상위주소)
		System.out.println(getServletContext().getMajorVersion());  // was의 버전
		System.out.println(getServletContext().getMinorVersion());  // 
		String contentType = "";
		if (uri.endsWith("getHTML")) { // 컨턴트 타입도 지정을 해줘야한다,,
			filename = getServletContext().getRealPath("/")+"/clientexam/sample.html";	
			contentType = "text/html; charset=utf-8";
		} else if (uri.endsWith("getXML")) { 
			filename = getServletContext().getRealPath("/")+"/clientexam/sample.xml";	
			contentType = "text/xml; charset=utf-8"; 
		} else if (uri.endsWith("getJSON")) {
			filename = getServletContext().getRealPath("/")+"/clientexam/sample.json";	
			contentType = "text/json; charset=utf-8";
		} else {
			filename = getServletContext().getRealPath("/")+"/images/trans_duke.png";	
			contentType = "image/png";
		}
		File f = new File(filename);
		FileInputStream fis = new FileInputStream(f); // 이미지는 바이트 스트림 그대로 사용하면 됨(문자는 변환 필요)
		response.setContentType(contentType);
		if(contentType.startsWith("image")) {
			byte[] content = new byte[(int)f.length()]; // 한 번에 읽기위해서 
			ServletOutputStream sos = response.getOutputStream(); // 이미지 내보내기
			fis.read(content);
			sos.write(content);			
			sos.close();
		} else {
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			PrintWriter out = response.getWriter(); // 문자 내보내기
			String line = null; 
			while((line = br.readLine()) != null) 
				out.println(line);
			out.close();
			br.close();
			isr.close();			
		}		
		fis.close();
	}
}*/
package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/getHTML", "/getXML", "/getJSON", "/getImage" })
public class ResponseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getRequestURI(); // 현재 요청의 URI 가져오기 (예: /yourwebapp/getHTML)
        System.out.println(uri); // 현재 요청의 URI를 콘솔에 출력

        String filename = ""; // 파일 경로를 저장할 변수
        String contentType = ""; // 컨텐트 타입을 저장할 변수

        // URI에 따라 파일 경로와 컨텐트 타입 설정
        if (uri.endsWith("getHTML")) {
            filename = getServletContext().getRealPath("/") + "/clientexam/sample.html";
            contentType = "text/html; charset=utf-8"; // HTML 컨텐트 타입 설정
        } else if (uri.endsWith("getXML")) {
            filename = getServletContext().getRealPath("/") + "/clientexam/sample.xml";
            contentType = "text/xml; charset=utf-8"; // XML 컨텐트 타입 설정
        } else if (uri.endsWith("getJSON")) {
            filename = getServletContext().getRealPath("/") + "/clientexam/sample.json";
            contentType = "application/json; charset=utf-8"; // JSON 컨텐트 타입 설정
        } else {
            filename = getServletContext().getRealPath("/") + "/images/trans_duke.png";
            contentType = "image/png"; // 이미지 컨텐트 타입 설정
        }

        File f = new File(filename); // 파일 경로에 해당하는 File 객체 생성
        FileInputStream fis = new FileInputStream(f); // 파일을 읽어오기 위한 FileInputStream 생성

        response.setContentType(contentType); // 응답의 컨텐트 타입 설정

        if (contentType.startsWith("image")) { // 컨텐트 타입이 이미지인 경우
            byte[] content = new byte[(int) f.length()]; // 파일 크기만큼의 바이트 배열 생성
            ServletOutputStream sos = response.getOutputStream(); // 서블릿 출력 스트림 생성
            fis.read(content); // 파일 내용을 바이트 배열에 읽어옴
            sos.write(content); // 바이트 배열을 출력 스트림으로 전송
            sos.close(); // 출력 스트림 닫기
        } else { // 그 외의 경우 (텍스트 파일)
            InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // 파일 읽기를 위한 InputStreamReader 생성
            BufferedReader br = new BufferedReader(isr); // BufferedReader로 읽어오기
            PrintWriter out = response.getWriter(); // 서블릿 출력 스트림 생성
            String line = null;

            // 파일 내용을 한 줄씩 읽어서 서블릿 출력 스트림으로 전송
            while ((line = br.readLine()) != null)
                out.println(line);

            out.close(); // 출력 스트림 닫기
            br.close(); // BufferedReader 닫기
            isr.close(); // InputStreamReader 닫기
        }

        fis.close(); // FileInputStream 닫기
    }
}

