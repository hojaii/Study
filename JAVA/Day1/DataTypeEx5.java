class DataTypeEx5 {
       public static void main(String[] args){
       /*정수 long : 8byte(64bit) 메모리에 저장할 수 있는 
      정수 유효범위 -2^63~2^63-1
        */ 
      //long num1 = 2147483648;
        long num1 = 2147483648l;
       System.out.println(num1);
       num1 = 1.0; //소수점을 포함하면 실수로 식별하고 부동소수점 형식으로 변환해서 컴파일 오류 발생
      System.out.println(num1);
      }
}