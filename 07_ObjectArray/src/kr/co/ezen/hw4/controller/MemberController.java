package kr.co.ezen.hw4.controller;

import kr.co.ezen.hw4.model.vo.Member;

public class MemberController {
	public static final int SIZE=10; // static final: 정적 상수 ( 스태틱파이널 구글링으로 정확히 알아내기 )
	private int memberCount;
	private Member[] mem=new Member[SIZE]; // 배열 // 디폴트값을 갖게됨 // 필드 변수가 5라는 값을 갖고있음 (memberCount=5)
	
	{
		mem[0]=new Member("user01","pass01","루피1",20,'F',"lupl123@naver.com");
		mem[1]=new Member("user02","pass02","루피2",30,'F',"lupl223@naver.com");
		mem[2]=new Member("user03","pass03","루피3",40,'M',"lupl323@naver.com");
		mem[3]=new Member("user04","pass04","루피4",50,'W',"lupl423@naver.com");
		mem[4]=new Member("user05","pass05","루피5",60,'M',"lupl523@naver.com");
		memberCount=5;
	} // 이렇게하는것 ==> 초기화블록 
	
	public int getMebmerCount() {
		return this.memberCount; // 5라는 정수가 넘어감
	}
	
	public Member[] getMem() {
		return this.mem;
	} 
	
	public Member checkId(String userid) {
		
		Member m=null;
		for(int i=0;i<memberCount;i++) {
			if(mem[i].getUserId().equals(userid))
			m=mem[i];
		}
		
		return m;
	}
	
	public void insertMember(Member m) { //객체가 넘어옴 --> Member m 이객체 ) // 지역변수는 초기화 안함 에러임!
		mem[memberCount]=m;
		memberCount++; 
	}
	
	public Member searchMember(int menu, String search) {
		Member searchMember=null;
		
		for(int i=0;i<memberCount;i++) {
		    if (menu == 1) {
                if (mem[i].getUserId().equals(search))
                    searchMember = mem[i];
            } else if (menu == 2) {
                if (mem[i].getName().equals(search))
                    searchMember = mem[i];
            } else {
                if (mem[i].getEmail().equals(search))
                    searchMember = mem[i];
            }
        }

        return searchMember;
	}
	
	public void updateMember(Member m, int menu, String update) {
		if(menu == 1 ) {
			m.setUserPwd(update);
		}else if(menu == 2) {
			m.setName(update);
		}else {
			m.setEmail(update);
		}
	}
	
	public void deleteMember(String userId) { // 여기서 다 처리!!  // delet-> 빈객체
		
		for(int i=0;i<memberCount;i++) {
			if(mem[i].getUserId().equals(userId)) {  // 아이디라는 조건이 맞으면~ 
				for(int j=i;j<memberCount-1;j++) {   // 배열은 위치를 가르켜 줘야함 ( 나머지 뒤에꺼를 이동해야함 ==> 반복문 ) // 새 메소드 작성 돌입
					mem[j]=mem[j+1];                 // 인덱스가 9까지 배열이 있다고 가정 했을 때 9는삭제 됨! 출력은 8까지만 됨!
				
				}
			}
		}//for문 끝
		memberCount--;
		
	}// 메서드 끝
	
	public Member[] sortIdAsc() {
		Member copy[]=new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);
		
		for(int i=0;i<copy.length;i++) {
			for(int j=0;j<i;j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
					Member temp=copy[j];
					copy[j]=copy[i];
					copy[i]=temp; // 값을 바꿈 
				}
			}
		}
		return copy;
	}
	// A,B A==B -->0 A>B --> -1 A<B -->1
	public Member[] sortIdDesc() {
		Member copy[]=new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);
		
		for(int i=0;i<copy.length;i++) {
			for(int j=0;j<i;j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
					Member temp=copy[j];
					copy[j]=copy[i];
					copy[i]=temp;
				}
			}
		}
		return copy;
	}
	
	public Member[] sortAgeAsc() {
		Member copy[]=new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);
		
		for(int i=0;i<copy.length;i++) {
			for(int j=0;j<i;j++) {
				if( copy[i].getAge() - copy[j].getAge() < 0) {
					Member temp=copy[j];
					copy[j]=copy[i];
					copy[i]=temp;
				}
			}
		}
		return copy;
	}
	
	public Member[] sortAgeDesc() {
        Member copy[] = new Member[memberCount];
        System.arraycopy(mem, 0, copy, 0, memberCount);

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < i; j++) {
                if (copy[i].getAge() - copy[j].getAge() > 0) {
                    Member temp = copy[j];
                    copy[j] = copy[i];
                    copy[i] = temp;
                }
            }
        }
        return copy;
    }

    public Member[] sortGenderDesc() {
        Member copy[] = new Member[memberCount];
        System.arraycopy(mem, 0, copy, 0, memberCount);

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < i; j++) {
                if (copy[i].getGender() == 'M' && copy[j].getGender() == 'F') {
                    Member temp = copy[j];
                    copy[j] = copy[i];
                    copy[i] = temp;
                }
            }
        }
        return copy;
	}
}














