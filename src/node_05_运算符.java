public class node_05_运算符 {
    public static void main(String[] args) {
        //方法名不建议用中文,不过这里是学习记录笔记。方法名用中文更好明白调用的方法是做什么的
        System.out.println("-------------------赋值运算符-------------------");
        赋值运算符();
        System.out.println("-------------------算术运算符-------------------");
        算术运算符();
        System.out.println("-------------------关系运算符-------------------");
        关系运算符();
        System.out.println("-------------------逻辑运算符-------------------");
        逻辑运算符();
        System.out.println("-------------------位运算符-------------------");
        位运算符();
        System.out.println("-------------------三元运算符-------------------");
        三元运算符();
    }

    private static  void 赋值运算符(){
        // =:赋值,等号左边只能是变量,右边可以是常量,变量,表达式
        int a = 1;
        System.out.println("a = " + a);
        a = 3;
        System.out.println("a = " + a);

        //*******************以下是复合赋值运算符*******************
        // +=: a += b;效果等同于 a = a + b;
        System.out.println( a += 2);// 3 + 2 = 5

        // -=: a -= b;效果等同于 a = a - b;
        System.out.println( a -= 1);// 5 - 1 = 4

        // *=: a *= b;效果等同于 a = a * b;
        System.out.println( a *= 2);// 4 * 2 = 8

        // /=: a /= b;效果等同于 a = a / b;
        System.out.println( a /= 4);// 8 / 4 = 2

        // %=: a %= b;效果等同于 a = a % b;
        System.out.println( a %= 2);// 2 % 2 = 1

        //注意:复合赋值运算符会进行强制的类型转换
        byte b1 = 1;
        b1 += 2;//等同于 b1 = (byte)(b1 + 2);

    }

    private static  void 算术运算符(){
        /**
         * +
         * 1.正数
         * 2.相加
         * 3.拼接字符串
         *
          */
        int a = +7;
        int b = 1 + 2;
        String c = 1 + "秒";

        /**
         * -
         * 1.负数
         * 2.详减
         */
        int d = -7;
        int e = 1-2;

        // *:相乘
        int f = 1 * 2;

        // /:相除
        int g = 5 / 2;//因为是int类型，所以这里是2
        double h = 5 / 2;//5 / 2先会变成int类型的结果然后再赋值给double所以还是2
        double i = 5.0 / 2;//这里是2.5

        // %:取模/取余
        int j = 5 % 2;//5除以2,取2余1,所以 5 / 2 的结果是1

        /**
         * ++:自增
         * 前++:先自增后赋值
         * 后++:先赋值后自增
         */
        int k = 1;
        k++;
        System.out.println("k = " + k);
        ++k;
        System.out.println("k = " + k);
        System.out.println("++k = " + ++k);//前++
        System.out.println("k++ = " + k++);//后++
        System.out.println("k = " + k);

        /**
         * --:递减
         * 前--:先递减再赋值
         * 后--:先赋值再递减
         */
        int l = 10;
        l--;
        System.out.println("l = " + l);
        --l;
        System.out.println("l = " + l);
        System.out.println("--l = " + --l);//前++
        System.out.println("l-- = " + l--);//后++
        System.out.println("l = " + l);
    }

    private static  void 关系运算符(){
        // ==:判断是否相等,返回值为boolean值
        System.out.println(1 == 1);
        System.out.println(1 == 2);

        // !=:判断是否不相等,返回值为boolean值
        System.out.println(1 != 1);
        System.out.println(1 != 2);

        // <:判断左边的值是否小于右边的值,返回值为boolean值
        System.out.println(1 < 1);
        System.out.println(1 < 2);

        // >:判断左边的值是否大于右边的值,返回值为boolean值
        System.out.println(1 > 1);
        System.out.println(1 > 2);

        // <=:判断左边的值是否小于等于右边的值,返回值为boolean值
        System.out.println(1 <= 1);
        System.out.println(1 <= 2);

        // >=:判断左边的值是否大于等于右边的值,返回值为boolean值
        System.out.println(1 >= 1);
        System.out.println(1 >= 2);

        // instanceof:判断值是否是某个类型的
    }

    private static  void 逻辑运算符(){
        // &:逻辑与,当左边变量或关系表达式和左边变量或关系表达式都为true时,结果才为true,否则为false
        System.out.println(1 > 1 & 1 > 2);//1不大于2,所以返回结果为false
        System.out.println(3 > 1 & 3 > 2);//返回结果为true

        // &&:短路与,与&用法相同.但是使用&&时,如果已经可以判断出最后结果就直接返回结果,不执行后面的判断.&则会全部判断完才返回结果
        System.out.println(1 > 1 && 1 > 2);//1不大于2,所以返回结果为false
        System.out.println(3 > 1 && 3 > 2);//返回结果为true

        // |:逻辑或,当左边变量或关系表达式和左边变量或关系表达式一方为true,结果就为true,否则为false
        System.out.println(1 > 1 | 1 > 2);//1不大于2,所以返回结果为false
        System.out.println(3 > 2 | 3 > 3);//3大于2,所以返回结果为true

        // ||:短路或,与|用法相同.但是使用||时,如果已经可以判断出最后结果就直接返回结果,不执行后面的判断.|则会全部判断完才返回结果
        System.out.println(1 > 1 || 1 > 2);//1不大于2,所以返回结果为false
        System.out.println(3 > 2 || 3 > 3);//3大于2,所以返回结果为true

        // !:逻辑非/取反,当结果为false,取反后为true。当结果为true,取反为false
        System.out.println(!(1 > 1));//1不大于1结果为false,取反为true
        System.out.println(!(2 > 1));//2大于1结果为true,取反为false

        // ^:逻辑异或,当a和b不同时,结果为true,否则为false
        System.out.println(2 > 1 ^ 3 > 1);//两边都是true,所以返回false
        System.out.println(2 > 1 ^ 1 > 1);//左边true,右边false,所以返回true
    }

    private static  void 位运算符(){

    }

    private static void 三元运算符(){
        /**
         * 语法: 条件表达式 ? 表达式1 : 表达式2
         *  当条件表达式总结果为true时执行表达式1,为false时执行表达式2
         */
        System.out.println( 1 == 1 ? "1等于1" : "1不等于1");
        System.out.println( 2 == 1 ? "2等于1" : "2不等于1");
    }
}
