package kr.co.ezen.example.array;

import java.util.Arrays;

import javax.management.openmbean.OpenMBeanConstructorInfo;

public class B_ArrayCopy {
//  얕은 복사 : 배열의 주소만 복사
//  깊은 복사 : 동일한 새로운 배열을 하나 생성하여 실제 내부 값 복사
  
  public void method1() {
     int[] originArr= {1,2,3,4,5};
     int[] copyArr=originArr;
     
     String str="";
     
//     for(int i=0;i<originArr.length;i++) {
//        if(i<originArr.length-1) {
//           System.out.printf("%d, ",copyArr[i]);
//        }else {
//           System.out.printf("%d",copyArr[i]);
//        }
//     }
     
     originArr[0]=99;
     
     for(int i=0;i<originArr.length;i++) {
        if(i != originArr.length-1) {
           str+=originArr[i]+",";
        }else {
           str+=originArr[i];
        }
     }
     System.out.println("originArr : "+str);
     
     str="";
     for(int i=0;i<copyArr.length;i++) {
        if(i != copyArr.length-1) {
           str+=copyArr[i]+",";
        }else {
           str+=copyArr[i];
        }
     }
     System.out.println("copyArr : "+str);
     
     System.out.println("origin의 hashcode : "+originArr);
     System.out.println("copyArr의 hashcode : "+copyArr);
  }
  
  public void method2() {
     
     int[] originArr= {1,2,3,4,5};
     int[] copyArr=new int[5];
     
     for(int i=0;i<originArr.length;i++) {
        copyArr[i]=originArr[i];
     }
     
     String str="";
     
     originArr[0]=99;
     
     for(int i=0;i<originArr.length;i++) {
        if(i != originArr.length-1) {
           str+=originArr[i]+",";
        }else {
           str+=originArr[i];
        }
     }
     System.out.println("originArr : "+str);
     
     str="";
     
     for(int i=0;i<copyArr.length;i++) {
        if(i != copyArr.length-1) {
           str+=copyArr[i]+",";
        }else {
           str+=copyArr[i];
        }
     }
     System.out.println("copyArr : "+str);
     
     System.out.println("origin의 hashcode : "+originArr);
     System.out.println("copyArr의 hashcode : "+copyArr);
  }
  
  public void method3() {  //배열복사 책 168 , 2021-08-17
	  int[] originArr= {1,2,3,4,5};
      int[] copyArr=new int[10];
      
      System.arraycopy(originArr, 0, copyArr, 0, originArr.length); // :복사할 대상, 0번째부터, 
      
      String str="";
      
      for(int i=0;i<originArr.length;i++) {
         if(i != originArr.length-1) {
            str+=originArr[i]+",";
         }else {
            str+=originArr[i];
         }
      }
      System.out.println("originArr : "+str);
      
      str="";
      
      for(int i=0;i<copyArr.length;i++) {
         if(i != copyArr.length-1) {
            str+=copyArr[i]+",";
         }else {
            str+=copyArr[i];
         }
      }
        System.out.println("copyArr: "+str);
		
		System.out.println("originArr의 hashcode: "+originArr);
		System.out.println("copyArr의 hashcode: "+copyArr);
  }

  public void method4() {
	  int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		String str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
		System.out.println("처음 copyArr: "+str);
		
		copyArr=Arrays.copyOf(originArr,originArr.length);
		
		/*
		str="";
		
		for(int i=0;i<copyArr.length;i++) {
			
			if(i != copyArr.length-1) {
				str+=copyArr[i]+",";
			}else
				str+=copyArr[i];
		}
//		System.out.println("copyArr: "+str);
 * 
 * */ //주석처리 한 부분 )  주석 빼도 맞는 답이고 주석을 해도 같은 답의 run결과값이 나옴
 
		System.out.println("copyArr:"+Arrays.toString(copyArr)); 
		// 내가 원하고자하는걸 그대로 가져옴! 단! 메서드 스트링타입 일때만 가능 ★★★" toString : 무조건알아야함 ★★★  
	}
  
  public void method5() {
	  int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		System.out.println("준비된 복사본 배열의 주소: "+copyArr.hashCode());
	
  }
}
