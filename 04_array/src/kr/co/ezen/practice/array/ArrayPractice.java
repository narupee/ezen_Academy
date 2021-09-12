package kr.co.ezen.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void method1() {
//		길이가 10인 배열을 선언하고 1부터 1까지의 값을 
//		반복문을 이용해 순서대로 배열 인덱스에 넣은 후 값 출력
		int[] array= {1,9,3,7,5,6,4,8,2,10};
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
		}
		System.out.println();
	}
	
	public void method2() {           // 1번 메소드 문제를 선생님이 말한 방식으로 푼거 1은 내방식으로 푼거
	    int[] array= new int[10];
	    	
	    for(int i=0;i<array.length;i++) {
	    	array[i]=(i+1);
	    	System.out.print("["+array[i]+""+"]");
	    }
	}
	
	public void method3() {           // 1~10 역순으로 출력 방법 , 출력된 답) 10 9 8 7 6 5 4 3 2 1 
		int[] array= new int[10];
		
		for(int i=array.length-1;i>=0;i--) {
			array[i]=i+1;
			System.out.print(array[i]+" ");
		}
	}
	
	public void method4() {
		// 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지
		// 배열에 초기화 한 후 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.print("양의 정수: ");
		int num=sc.nextInt();
		
		int[] array=new int[num];
		
		for(int i=0;i<array.length;i++) {
		array[i]=i+1;
			System.out.print(array[i]+" ");
		}
	}
	
	public void method5() {
		// 길이가 5인 String배열 선언 사과,귤,포도,복숭아,참외로 초기화한 후
		// 배열 인덱스를 활용해 귤 출력
		String[] array= new String[5];
		array[0]="사과";
		array[1]="귤";
		array[2]="포도";
		array[3]="복숭아";
		array[4]="참외";
		
			System.out.println(array[1]);
	}
	
	public void method6() {
		// 문자열 입력받아 문자 하나나라를 배열에 넣고 검색할 문자가 
		// 문자열에 몇개 들어가 있는지 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력해
		// 문자열: application
		// 문자: i
		// application에 i가 존재하는 위치(인덱스): 4 8
		// i 개수: 2
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 :");
		String input=sc.nextLine();
		System.out.print("문자 :");
		char ch=sc.nextLine().charAt(0);
		int num=0;
		String str="";
		
		char[] arr=new char[input.length()];
		
		System.out.print(str+"에"+ch+"가 존재하는 위치(인덱스) :");
		
		for(int i=0;i<input.length();i++) {
			arr[i]= input.charAt(i);
			
			if(arr[i]==ch) {
				num++;
				str+=i+" ";
			}
	}
		System.out.printf("%c 개수: %d\n",ch,num);
		System.out.printf("%s에 %c가 존재하는 위치(인덱스): %s\n",input,ch,str);
	}
	
	public void method7() {
		String[] strArr= {"월","화","수","목","금","토","일"};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("0~6사이 숫자 입력:");
		int num=sc.nextInt();
		
		if(num>=0 && num<=6) {
			System.out.println(strArr[num]+"요일");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public void method8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 :");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("배열"+i+"번째 인덱스에 넣을 값:");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.print("총합 :"+sum);
	}
	
	public void method9() {
		Scanner sc=new Scanner(System.in);
		
		while(true) { // 무한반복
			System.out.print("정수 :");
			int input = sc.nextInt();
			
			if(input %2 != 0 && input >= 3) {
				int[] arr =new int[input];
				
				for(int i=0;i<arr.length;i++) {
					if(i<=arr.length/2) {
						arr[i]= i+1;
						System.out.print(arr[i]+", ");
					}else if(i==arr.length-1) {
						arr[i]= arr[i-1]-1;
						System.out.println(arr[i]);
					}else {
						arr[i]= arr[i-1]-1;
						System.out.print(arr[i]+", ");
					}
				}
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}sc.close();
	}
	
	public void method10() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("치킨 종류를 입력하세요 :");
		String[] menu= {"양념","후라이드","불닭"};
		String str=sc.nextLine();
		String cz=" ";
		
		for(int i=0;i<menu.length;i++) {
				if(str.equals(menu[i])) {
				cz=menu[i];
				}
		}
		if(str.equals(cz)) {
			System.out.println(cz+"치킨 배달 가능");
		}else {
			System.out.println("치킨 종류가 없습니다. 배달 불가능");
			sc.close();
		}
	}
	
	public void method11() {                    // 2021-08-19
		// 원본 배열 값은 변경 없이 배열 복사본으로 변경
		// 주민번호 뒤 *로 출력
        Scanner sc=new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) :");
		String num=sc.nextLine();
		
		char[] chArr=num.toCharArray();
		
		for(int i=0;i<num.length();i++) {
			if(i>7) {
				chArr[i]='*';
			}
			System.out.print(chArr[i]);
			}
	}
	
	public void method12() { 
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1); // 9밖에 안되서 10+1 해서 10을 만들어줌!
			System.out.print(arr[i]+" ");
		}
	}
	
	public void method13() { 
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력
		int[] arr=new int[10];
		int max=0;
		int min=10;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		
			if(arr[i] > max) {
				max=arr[i];
			}else {   
				min=arr[i];
	     	}
			System.out.println();
			System.out.println("최대값: "+max);
			System.out.println("최소값: "+min);
		}
	}
	
	public void method14() { 
		int[] a=new int[10];
		boolean run= true;
		
		while(run) {
			boolean b = false;
			
			for(int i=0;i<a.length;i++) {
				a[i]=(int)(Math.random()*10+1);
			}
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						break;
					}
				}
			}
			
			if(b==true) {
				continue;
			}else {
				for(int i=0; i<a.length;i++) {
					System.out.print(a[i]+" ");
					run= false;
				}
			}
		}
	}
	
	public void method15() { 
		
		int[] Lotto=new int[6];
		System.out.println("Lotto 당첨 숫자는!");
		
		for(int i=0;i<Lotto.length;i++) {
			Lotto[i]=(int)(Math.random()*45+1);
			
			for(int j=0;j<i;j++) {
				if(Lotto[i] == Lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<Lotto.length;i++) {
			System.out.print(Lotto[i]+" ");
		}
		System.out.println("입니다.");
	}
	/*
	public void method16() {
		// 문자열을 입력받아 문자열에 어떤문자가 들어갔는지 
		// 배열에 저장하고 문자의 개수와 함께 출력하세요.
		// 문자열: application
		// 문자열에 있는 문자 : a,p,p,l,i,c,t,o,n  (얘는 입력이 아닌 출력이고 중복 제거하고 나오는 공간)
		// 문자개수: 8   (얘도 입력이 아닌 출력으로 나오는 문자 개수)
		Scanner sc=new Scanner(System.in);
		
		System.out.println("문자열 입력: ");
		String input=sc.nextLine();
		System.out.println("문자열에 있는 문자: ");
		char input1=sc.nextLine().charAt(0);
		System.out.println("문자: ");
		char ch=sc.nextLine().charAt(0);
		String str=" ";
		int num=0;
		
		char[] arr=new char[(input.length())];
		
		for(int i=0;i<input.length();i++) {
			arr[i]=input.charAt(i);
			
			if(arr[i]==ch) {
				num++;
				str+=i+" ";
			}
		}
		System.out.printf("%c 개수: %d\n",ch,num);
	}
	*/
	public void method17() {    
		Scanner sc=new Scanner(System.in);

        System.out.print("문자열 :");
        String str=sc.next();                  // a p p l i c a t i o n
                                                   // 0 1 2 3 4 5 6 7 8 9 10
                                                   // (324행 부분 선생님강의) '\u0000'(유니코드) null default 캐릭터타입은 유니코드가 들어감 -> null 값은 도훈님이 생각한 0값이라 생각하면됨!
        char [] chArr=new char [str.length()];     // appliction -> str.charAt()                                
        chArr[0]=str.charAt(0);                    // chArr       -> [a] [p] [p] [p] [p] [p] [p] [p]
                                                   // ㄴ 왼쪽부터 오른쪽으로 쭉 누적되어 쌓아간다?
        boolean check=false;                       // chArr [ a 0 0 0 0 0 0 0 0 0 0 ]
        
        int count =1;
        
        for(int i=1;i<str.length();i++) {
            for(int j=0;j<chArr.length;j++) {
                if(str.charAt(i)==chArr[j]) {      // i랑 j가 같냐? 문자가 동일하면 안됨으로 break으로 빠져나가 다시 for ㄱㄱ
                    check=true;
                    break;
                }
            }
            if(!check) {                           // !check : !는 반대로니까 true로 된다!
                    chArr[count]=str.charAt(i);   // 실질적인 값은 여기서 준다
                    count++;
            }
            check=false;
        }
        System.out.print("문자열에 있는 문자:");
        for(int i=0;i<chArr.length;i++) {
            System.out.print(chArr[i]);
        }
        System.out.println();
        System.out.print("문자 개수:"+(count));
    }

	public void method18() {
		Scanner sc=new Scanner(System.in);

		boolean check=false;
		
		System.out.println("배열의 크기를 입력하세요:");
		int siz=sc.nextInt();
		
		String[] arr=new String[siz];
		
		for(int i=0;i<arr.length;i++) {
		System.out.printf("%d 번째 문자열: \n",i+1); 
		String str=sc.next(); 
		arr[i]=str;
		}
		
		System.out.println("더 값을 입력하시겠습니까?(Y/N):");
		char ts=sc.next().charAt(0); // char는 문자 고 문자 1개만 저장 할 수 있다!
		if(ts=='Y' || ts=='y') { // ts 가 y 라면 중괄호 안을 실행해라!
		check=true;
		}
		if(check) {
			System.out.println("배열의 크기를 입력하세요:");
		}
	}
}
		
 


