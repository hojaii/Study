class DataTypeEx6 {
       public static void main(String[] args){
       /*���� ���� char :2byte(16bit) �޸𸮿� ���ڸ� ���� (���ڴ� ��ǻ�� ���ο� ���ڷ� ���� encording)
      �ڹٴ� �����ڵ带������
        */ 
        char ch1 = 'A'; //A(65), a(97), 0(48), ����(13), space(10)
       System.out.println(ch1);
       ch1 = '\u0057'; //�����ڵ� \u0000~\uffff
      System.out.println(ch1);
       ch1 = 48;
        System.out.println(ch1);
      }
}