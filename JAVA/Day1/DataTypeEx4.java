class DataTypeEx4 {
       public static void main(String[] args){
       /*���� int : 4byte(32bit) �޸𸮿� ������ �� �ִ� 
      ���� ��ȿ���� -2^31~2^31-1 (-2147483648~2147483647)
        */ 
      int num1 = 32768;  
        System.out.println(num1 );
        num1 = 2147483647;
        System.out.println(num1 );
        num1 = 077; //8����
         System.out.println(num1 );
        num1 = 0xff ; //16�����Ҵ�
         System.out.println(num1 );
      }
}