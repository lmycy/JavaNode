public class node_02_变量和数据类型 {

    public static void main(String[] args) {
        //方法名不建议用中文,不过这里是学习记录笔记。方法名用中文更好明白调用的方法是做什么的
        变量();
        数据类型();
    }

    private static void 变量() {
        /**
         * 变量是程序的基本组成单位
         *
         * 变量的三要素:类型,名称,值(常量/null)
         *
         * 注意:
         *  变量名在同一个作用域内不能重复
         *  变量可以多次赋值
         *  常量是指不可更改的值,用来赋值给变量或者进行运算.比如1,2,3,a,b,c,%
         */
        //声明一个变量(暂时定义为数值类型)
        int a;//这里代表声明了一个int类型的变量,变量名为a
        //为变量赋值
        a = 1;//这里代表为a变量赋值,值为1
        //声明变量的同时赋值
        int b = 1;
        //使用变量
        a = a + 1;//这里代表把a变量加1
        System.out.println(a);//这里代表输出a变量
    }

    private static void 数据类型() {
        /**
         * Java数据类型分类:
         *  基本数据类型,引用数据类型
         * 基本数据类型:
         *  数值型:
         *      整数类型:
         *          byte,占1个字节
         *          short,占2个字节
         *          int,占4个字节
         *          long,占8个字节
         *      浮点类型(小数类型):
         *          float,占4个字节
         *          double,占8个字节
         *  字符型:
         *      char,占2个字节,只能存放单个字符(大小写字母,数字,汉字,符号)
         *  布尔型:
         *      boolean,占一个字节,只能赋值为true或false
         * 引用数据类型:
         *  除了基本数据类型以外全是引用数据类型,比如String,类，接口,数组,集合
         */
        整数类型();
        浮点类型();
        字符型();
        布尔型();
    }

    private static void 整数类型() {
        /**
         * 整数类型不同类型的数据范围
         *  类型         占用字节                   范围
         *  byte        1个字节(8个bit)            -128~127
         *  short       2个字节                    (-2^15)~(2^15)-1/-32768~32767
         *  int         4个字节                    (-2^31)~(2^31)-1/-2147483648~2147483647
         *  long        8个字节                    (-2^63)~(2^63)-1
         * 注意:
         *  bit是计算机存储的最小单位
         *  Java中的整数数值默认是int类型
         *  如果要定义long类型变量,赋值时常量后要加l/L
         */
        byte byte1 = -128;
        short short1 = -32768;
        int int1 = -2147483648;
        long long1 = 0;
        long long2 = 0L;
    }

    private static void 浮点类型() {
        /**
         * 浮点类型不同类型的数据范围
         *  类型        占用字节
         *  float       4个字节
         *  double      8个字节
         * 注意:
         *  浮点数在机器中的存放形式为:符号位+整数位+小数位
         *  小数位可能会丢失造成精度损失问题
         *  Java中的浮点类型数值默认为double类型
         *  如果要定义float类型变量,赋值时常量后需要加f/F
         */
        float float1 = 3.1415926F;
        double double1 = 3.1415926;
        double double2 = 3.1415926F;
        double double3 = 3;//如果输出double3,输出结果为3.0
        double double4 = 2.7;
        double double5 = 8.1 / 3;
        System.out.println(double4);//这里会输出2.7
        System.out.println(double5);//这里输出结果不是2.7,而是接近2.7的一个小数
        double double6 = 8.1 / 3;
        double double7 = 2.7;
        System.out.println(double4 == double5);//直接赋值的常量和计算的出的结果对比是否相等,结果为否
        System.out.println(double5 == double6);//两个同样计算公式得出的结果对比是否相等,结果为是
        System.out.println(double4 == double7);//两个直接赋值的常量对比是否相等,结果为是
    }

    private static void 字符型() {
        /**
         * 注意
         *  字符常量是用单引号包括起来的单个字符,不能用双引号
         *  Java中,char的本质是一个整数,也可以参与计算,输出char变量时会输出unicode码对应的字符
         */
        char c1 = 'a';
        char c2 = '1';
        char c3 = '%';
        char c4 = '\\';
        char c5 = '\t';
        char c6 = '汉';
        char c7 = 20013;//也可以直接存1个字节范围内的数值,这里20013在unicode码中对应'中'字
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);//这里输出存数值的char变量时,结果不是数值本身,而是这个数值对应的字符编码
        /**
         * 字符编码表
         *  ASCII
         *      使用1个字节表示,实际可以对应256个字符,但是只用了128个.只包含字母和符号
         *  Unicode
         *      使用2个字节表示,字母和汉字同意占用2个字节,有些浪费空间
         *  utf-8
         *      大小可变的编码类型,字母使用1个字节,汉字使用3个字节
         *  gbk
         *      字母使用1个字节,汉字2个字节(汉字范围没有utf-8多,但基本够用)
         *  gb2312
         *      可以表示汉字,汉字量少于gbk编码表
         *  big5
         *      包含繁体中文
         */
        char c8 = '中' + 2256;//20013+2256=22269,在unicode码中对应'国'字
        System.out.println(c8);
        System.out.println((int)c8);
    }

    private static void 布尔型() {
        /**
         * 注意
         *  布尔类型不能赋值为null,也不能用0和非0的整数代替true或false
         */
        boolean boolean1 = true;
        boolean boolean2 = false;
    }
}
