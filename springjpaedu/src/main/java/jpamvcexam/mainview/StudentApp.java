package jpamvcexam.mainview;

import jpamvcexam.controller.StudentController;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentController sc = new StudentController();
        while (true) {
            System.out.println("처리하려는 기능을 선택하세요. ");
            System.out.println("1. 학생 정보 출력 ");
            System.out.println("2. 학생 정보 입력 ");
            System.out.println("3. 학생 정보 삭제 ");
            System.out.println("4. 학생 정보 수정 ");
            System.out.println("5. 학생 정보 확인 ");
            System.out.println("6. 종료");
            System.out.print("입력 > ");
            int num = scan.nextInt();
            scan.nextLine();
            if (num == 1)
                sc.printAll();
            else if (num == 2) {
                System.out.print("학생 이름 : ");
                String name = scan.nextLine();
                System.out.print("학생 점수 : ");
                int score = scan.nextInt();
                sc.insert(name, score);
            } else if (num == 3) {
                System.out.print("삭제하려는 학생의 이름을 입력하세요 : ");
                String name = scan.nextLine();
                sc.delete(name);
            } else if (num == 4) {
                System.out.print("수정하려는 학생 이름을 입력하세요 : ");
                String name = scan.nextLine();
                if (sc.oneStudent(name, false)) {
                    System.out.println(name + "학생이 존재합니다.");
                    System.out.println("수정하려는 학생 이름과 점수를 입력하세요.");
                    System.out.print(" 학생 이름 : ");
                    name = scan.nextLine();
                    System.out.print("학생 점수 : ");
                    int score = scan.nextInt();
                    sc.update(name, score);
                } else {
                    System.out.println(name + "학생이 존재하지 않습니다.");
                }
            } else if (num == 5) {
                System.out.print("점수를 확인하고 싶은 학생 이름을 입력하세요 : ");
                String name = scan.nextLine();
                sc.printScore(name);
            } else {
                sc.close();
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
        }
        scan.close();
    }

}