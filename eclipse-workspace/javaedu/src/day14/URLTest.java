package day14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) throws Exception {
//		URL url = new URL("http://unico2013.dothome.co.kr/test_utf8.html");
		URL url = new URL("http://unico2013.dothome.co.kr/test_euckr.html");
		// openStream()써서 열기
		InputStream is = url.openStream();
		// 행단위로 읽는게 성능이 좋기때문에 BufferedReader도 생성
		// 또는 Scanner로 해도 된다~
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//BufferedReader br = new BufferedReader(new InputStreamReader(is, "EUC-KR"));
		// -> EUC-KR로 만들어진 애면 이렇게 따로 설정해줘야한다~
		String line = null;
		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
}
