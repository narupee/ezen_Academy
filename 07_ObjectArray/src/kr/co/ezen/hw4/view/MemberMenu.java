package kr.co.ezen.hw4.view;

import java.util.Scanner;

import kr.co.ezen.hw4.controller.MemberController;
import kr.co.ezen.hw4.model.vo.Member;

public class MemberMenu {
	private MemberController mc=new MemberController();
	Scanner sc=new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			System.out.println("========회원 관리 메뉴========");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴 선택: ");
			int menu=sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember(); // 기존 것을 수정
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMeber();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		} // switch문 빠져나오는곳~
	}// 메인메뉴
	public void insertMember() {
		
		if(mc.getMebmerCount() >= MemberController.SIZE) {
			System.out.println("회원 수를 초과 했습니다.");
			
			return; //반환값이 없음 그래서 종료할려고 리턴씀 (회원수초과하면더등록하면안돼요안돼!)
		}
		System.out.println("아이디: ");
		String userId=sc.nextLine(); 
		Member m=mc.checkId(userId); //여기로 호출 (같으니 값이 넘어옴)
		
		if(m!=null) {
			System.out.println("동일한 아이디가 존재합니다. 회원정보 실패.");
		}else {
			System.out.print("비밀 번호: ");
			String userPwd=sc.nextLine();
			System.out.print("이름: ");
			String name=sc.nextLine();
			System.out.print("나이: ");
			int age=sc.nextInt();
			sc.nextLine();  // 엔터칠때 2개가 입력된걸 방지하기 위해서 이렇게 쓰는 것임 (엔터를 먹어서 다음게 입력됨 == 엔터 안먹게하는 방식)
			System.out.print("성별: ");
			char gendenr=sc.nextLine().charAt(0);
			System.out.print("이메일: ");
			String email=sc.nextLine();
			
			mc.insertMember(new Member(userId,userPwd,name,age,gendenr,email));
			System.out.println("성공적으로 회원등록이 되었습니다.");
		}
	}
	
	public void searchMember() { //검색
		
		while(true) {
			System.out.println("========회원 정보 검색========");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택: ");
			int menu=sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				System.out.println("이전 메뉴로 돌아갑니다.");
				return; // 1. 메소드 종료 2. 어떠한 값이 있음 값을 종료 (2가지 의미)
			}
			System.out.println("검색 내용: ");
			String search=sc.nextLine();
			Member searchMemberMenu=mc.searchMember(menu, search);
			
			if(searchMemberMenu != null) {
				System.out.println("========검색 결과=======");
				System.out.println(searchMemberMenu.information());//
			}else {
				System.out.println("검색된 결과가 없습니다.");
			}
		}
	}
	// 업데이트부분 시작
	public void updateMember() {
		while(true) {
			System.out.println("=========회원 정보 수정========");
			System.out.println("1. 비밀번호 수정");
			String userPwd=sc.nextLine();
			System.out.println("2. 이름 수정");
			String name=sc.nextLine();
			System.out.println("3. 나이 수정");
			int age=sc.nextInt();
			sc.nextLine();
			System.out.println("4. 이메일 수정");
			String email=sc.nextLine();
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택: ");
			int menu=sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				System.out.println("이전 메뉴로 돌아갑니다.");
			return;
			}
			System.out.println("변경할 회원 아이디: ");
			String userId=sc.nextLine();
			Member m=mc.checkId(userId);
			
			if(m != null) {
				System.out.println("기존 정보:"+m.information());
				System.out.println("변경 내용:");
				String update=sc.nextLine();   // 컨트롤러에서 호출!
				mc.updateMember(m, menu, update);   
				System.out.println("회원의 정보가 변경되었습니다.");
			}else {
				System.out.println("변경할 회원에 대한 정보가 존재하지 않습니다.");
			}
		}
	}
	
	public void deleteMember() {
        System.out.print("삭제할 회원 아이디: ");
        String userId = sc.nextLine();

        Member m = mc.checkId(userId);

        if (m != null) {
            System.out.println("기존 정보: " + m.information());
            System.out.println("정말 삭제하시겠습니까?(y/n): ");
            char ch = sc.nextLine().toUpperCase().charAt(0);

            if (ch == 'Y') {
                mc.deleteMember(userId);
                System.out.println("회원의 정보가 삭제되었습니다.");
            }
        } else {
            System.out.println("삭제할 회원에 대한 정보가 존재하지 않습니다.");
        }
    }
	
	public void printAllMeber() {
		Member[] mem=mc.getMem();
		
		for(int i=0;i<mc.getMebmerCount();i++) {
			System.out.println(mem[i].information());
		}
	}
	
	public void sortMember() {
		while(true) {
			System.out.println("======회원 정보 정렬======");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬 (남여 순)");
			System.out.println("9. 이전 메뉴로");
			
			System.out.println("메뉴 선택: ");
			int menu=sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				System.out.println("이전 메뉴로 돌아갑니다.");
			return;
			} // 09-03 수업 ㄱㄱ 
//			System.out.println("변경할 회원 아이디: ");
//			String userId=sc.nextLine();
//			Member m=mc.checkId(userId);
			Member[] sortMem = null;

            switch(menu) {
            case 1:
                sortMem = mc.sortIdAsc();
                break;
            case 2:
                sortMem = mc.sortIdDesc();
                break;
            case 3:
                sortMem = mc.sortAgeAsc();
                break;
            case 4:
                sortMem = mc.sortAgeDesc();
                break;
            case 5:
                sortMem = mc.sortGenderDesc();
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
            }
            System.out.println("======정렬 결과======");
            for (int i = 0; i < sortMem.length; i++) {
                System.out.println(sortMem[i].information());
   
            }
		}
	}
}





