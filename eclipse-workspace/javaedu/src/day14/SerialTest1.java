package day14;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
public class SerialTest1 {
   public static void main(String[] args) throws Exception{ 
	   // 없으면 새로 만들어짐 폴더까지 만들지는 않음
      FileOutputStream fos = new FileOutputStream("c:/iotest/test1.ser"); 
      ObjectOutputStream oos =  new ObjectOutputStream(fos);
      oos.writeObject(new Date());
      Thread.sleep(3000);
      oos.writeObject(new Date());      
      oos.close();
      fos.close();
      System.out.println("직렬화 출력 완료");      
   }
}



