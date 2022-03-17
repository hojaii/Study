class DataTypeEx6 {
       public static void main(String[] args){
       /*정수 유형 char :2byte(16bit) 메모리에 문자를 저장 (문자는 컴퓨터 내부에 숫자로 저장 encording)
      자바는 유니코드를지원함
        */ 
        char ch1 = 'A'; //A(65), a(97), 0(48), 엔터(13), space(10)
       System.out.println(ch1);
       ch1 = '\u0057'; //유니코드 \u0000~\uffff
      System.out.println(ch1);
       ch1 = 48;
        System.out.println(ch1);
      }
}