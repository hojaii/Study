class DataTypeEx4 {
       public static void main(String[] args){
       /*정수 int : 4byte(32bit) 메모리에 저장할 수 있는 
      정수 유효범위 -2^31~2^31-1 (-2147483648~2147483647)
        */ 
      int num1 = 32768;  
        System.out.println(num1 );
        num1 = 2147483647;
        System.out.println(num1 );
        num1 = 077; //8진수
         System.out.println(num1 );
        num1 = 0xff ; //16진수할당
         System.out.println(num1 );
      }
}