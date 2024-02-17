package core;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/part")
@MultipartConfig  
public class PartTestServlet extends HttpServlet {   
	
	// part 정보를 내보내는 역할
	
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    	
        Collection<Part> parts = request.getParts(); 
        // 여러개로 나뉘어진 파트 받을 메소드를 getParts로 받고 콜렉션 객체에 담음
        System.out.println("========== 요청 받음 ==========");
        for(Part part : parts) {        	
            System.out.print("name : ");
            System.out.println(part.getName());            
            System.out.println("[ 헤더 정보 ] ");
            for(String headerName : part.getHeaderNames()) {
                System.out.print(headerName + " : ");
                System.out.println(part.getHeader(headerName));
            }
            System.out.print("size : ");
            System.out.println(part.getSize());
            System.out.println("------------------------------------");
        }        
    }
}