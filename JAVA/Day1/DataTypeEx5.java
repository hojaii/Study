class DataTypeEx5 {
       public static void main(String[] args){
       /*���� long : 8byte(64bit) �޸𸮿� ������ �� �ִ� 
      ���� ��ȿ���� -2^63~2^63-1
        */ 
      //long num1 = 2147483648;
        long num1 = 2147483648l;
       System.out.println(num1);
       num1 = 1.0; //�Ҽ����� �����ϸ� �Ǽ��� �ĺ��ϰ� �ε��Ҽ��� �������� ��ȯ�ؼ� ������ ���� �߻�
      System.out.println(num1);
      }
}