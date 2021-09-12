package chap05.Object_Class_08;

public class Numbers {
	int num[];
	
	Numbers(int num[]) {
		this.num=num;   // 생성자 초기화
	}
	
	int getTotal() {
		// int total;  // error
		int total=0;   // 초기화
		for(int cnt=0;cnt<num.length;cnt++)
			total+=num[cnt];  // total=total+num[cnt];
		
		return total;
		
	}
	
	int getAverage() {
		int total;
		total=getTotal();
		int average=total/num.length;
		
		return average;
	}

}
