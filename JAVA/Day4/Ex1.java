
public class Ex1 {
	public static void main(String[] args) {
	//�Ҽ�PrimeNumber�� ���Ǵ� 1���� ū �ڿ��� �� 1 �� �� �� �ڱ� �ڽŸ��� ����� ���� �ڿ����� �ǹ��Ѵ�		
	for(int i=0;i<100;i++) {
	    boolean prime = false;
	    for(int j=2;j<i+1;j++) {
		if(i==2 || i==3 || i==5 || i==7) prime=true;
		if(i%3==0|| i%5==0||  i%2==0 || i%7==0 ||i%j==0)  
			break;
		else
			prime=true;
	    }//inner for end
	    if(prime) {
		System.out.print( i+",");
	    }//if end
	}//for end
     }
}