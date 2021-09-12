package kr.co.ezen.example.array; // 2021-08-17

import java.lang.reflect.Array;
import java.util.Arrays;

public class C_ArraySort {

	public void method1() {
		int num1=10;
		int num2=20;
		int temp=0; // temp(:템프)
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("num1:"+num1); // 20
		System.out.println("num2:"+num2); // 10
		
		int[] arr= {2,1,3};
		int temp2=0;
		
		temp2=arr[0]; // temp: 임시변수
		arr[0]=arr[1];
		arr[1]=temp2; // arr= 1,2,3 으로 바뀜
		
		for(int i=0;i<arr.length;i++) {
			// 2,1,3
			// 2,3,1
		}
		
		int num=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			num=arr[i];
			arr[i]=arr[i+1];  // 이부분때문에 arr.length-1 "-1"를 해줘야함
			arr[i+1]=num;
			System.out.println(Arrays.toString(arr));
//			[2, 1, 3]
//			[2, 3, 1]
		}
		
	}
	
	public void method2() {
		int[] array= {2,4,6,1,3,5};
		// 선택 정렬(select sort)
		int min;
		int temp;
		
		
		for(int i=0;i<array.length-1;i++) {
			min=i;
			for(int j=i+1;j<array.length;j++) {
			System.out.printf("현재 인덱스 위치 :%d, %d\n",i,j);
			
			
			if(array[min]>array[j]) {  // min=0 , j=1 현재 값(상태) 값을 비교
				min=j; // min에 1이란 숫자를 주라. 라는 뜻 min에 j값을 줌  ( 가장 작은 값에 j값이 저장됨 )
			}
		}
			System.out.println("---교환 시작합니다.---");
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
	}
		System.out.println("정렬 후:");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
  }
	
	public void method11() {                  //내가걍풀어봄 , 오름차순 정렬 쉽게 하는 방법
		int[] array= {2,4,6,1,3,5};
		// 선택 정렬(select sort)
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
		}
	}
	
	public static void method12() { // TestArraySort2
		int[] array= {2,4,6,1,3,5};
		// 버블 정렬(bubble sort)
		int temp=0;
		
		for(int i=array.length-1;i>-1;i--) { 
			for(int j=0;j<i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				for(int k=0;k<array.length;k++) {
					if(k<array.length-1) {
						System.out.print(array[k]+","); // k=0 값이니 참!
					}else {
						System.out.println(array[k]);
					}
				}
			}
		} // 바깥 끝
		System.out.println(); // 보기 좋게 공백줌
		System.out.println("정렬 후 확인 :");
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
