class PrintEx {
       public static void main(String[] args){
        String name = "나그네 \n구름에 달 가듯이 " ;
           System.out.println(name);
            name = "\t나그네 \n구름에 달 가듯이 " ;
          System.out.println(name);
       int a=3, b=4 ;
        // a와 b변수를 사용해서 3+4=7을 출력하려면?
            System.out.println(a+b);
            //System.out.println("3+4=7"); //인수를 1개로 전달해야함
            System.out.println(a+"+"+b+"="+(a+b)); //문자열과 +연산자는 결합
      }
}