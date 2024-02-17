package lambdastream;

import java.util.stream.Stream;

public class StreamExample6 {

	public static void main(String[] args) {
		Stream.of("3", "1", "4", "2", "5", "5")
        .map(x -> { // 6번 호출
            System.out.println("map : " + x);
            return Integer.parseInt(x);
        })
        .filter(x -> { // 5번 호출(filtering 되서 1 제외된 리턴값)
            System.out.println("filter : " + x);
            return x > 1;
        })
        .forEach(x -> {
            System.out.println("forEach : " + x);
        });
	}
}
