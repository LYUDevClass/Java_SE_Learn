package basic.leasson3;

public class IfDemo {
    public static void main(String[] args){
      /* int a = 0;
       //先使用a的值，然后➕1
       a++;
       //➕1后然后使用a的值
       ++a;
       a=0;
       System.out.println(a++);
       a=0;
       System.out.println(++a);

       int b = 0;

       b += 1;

       //字符串拼接 使用  +
         String str1 = "Hello";
         String str11 = "Hello";

         String str2 = ",";
         String str3 = "World";
       // 将字符串拼接后创建新的字符串 "Hello，World"  赋值给新变量；
         String str = str1 + str2 + str3;
         System.out.println(str);

        String str4 = true ? "我为真":"我为假";
        String str5 = false ? "我为真":"我为假";

        System.out.println(str4);
        System.out.println(str5);
*/

      /*
        if 判断 单条路径
       */
       String str6 = "我满足条件";

       String str7 = "我不满足条件";

       if(true){
            //System.out.println(str6);
        }

       if(false)
       {
          // System.out.println(str7);
       }

     //if ...else ..双路径条件判断，当条件不成立时执行另一条路径，两条路径必定会执行一条
       if(true)
       {
           System.out.println(str6);
       }else{
           System.out.println(str7);
       }

        if(false)
        {
            System.out.println(str6);
        }else{
            System.out.println(str7);
        }

        /*
        if ..else if ... else if ..  逐个判断条件，执行第一个满足条件的语句
         */
        if(true){
            System.out.println("条件1");
        }else if(true)
        {
            System.out.println("条件2");
        }


        if(false){
            System.out.println("条件1");
        }else if(true)
        {
            System.out.println("条件2");
        }

        if(false){
            System.out.println("条件1");
        }else if(false)
        {
            System.out.println("条件2");
        }else{
            System.out.println("条件3");
        }



    }
}
