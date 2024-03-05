Java的特点
    1.Java语言是面向对象的(oop)
    2.Java语言是健壮的,通过强类型机制，异常处理机制，垃圾自动回收等来保证Java程序的健壮性
    3.Java语言具有跨平台性
        同一个Java程序通过JVM（安装JDK时JDK时包含JVM）会编译成对应操作系统可识别的文件,即"一次编译,随处运行"
    4.Java语言是解释型语言
        解释型语言:编译后的代码不可以直接运行,需要解释器来执行.例如JavaScript,PHP,Java
        非解释型语言:编译后的代码可以直接被机器执行,例如C,C++
手动编译java文件的方式
    1.cmd窗口切换到.java后缀文件的文件夹中
    2.执行"javac 文件名.java"对源文件进行编译,会得到"文件名.class"字节码文件
    3.执行"java 文件名"即可执行该java程序
JDK,JRE
    JRE(Java Runtime Environment 即Java运行环境)
        JRE = JVM + Java的核心类库,如果只需要运行开发好的Java程序,可以不装JDK只装JRE即可
    JDK(Java Development Kit 即Java开发工具包)
        JDK = JRE + Java开发工具(javac,java,jaavdoc,javap等),因为包含了JRE,所以开发人员安装了JDK之后就不用单独安装JRE了
Java开发注意事项
    1.Java源文件以.java为后缀名,源文件的基本组成部分是类(class)
    2.Java应用程序的执行入口是main方法,它有自己的固定书写格式:
        public static void main(String[] args){...}
    3.Java语言严格区分大小写
    4.Java方法由一条一条语句组成,每个语句都要以";"结束
    5.大括号{},中括号[],小括号(),必须是成对出现的
    6.一个源文件中最多只能有一个public修饰的类,但不限制类的个数
    7.如果源文件中包含public修饰的类,则文件名必须是这个public修饰类的类名
    8.源文件中每个类都可以有自己的main方法
    9.Java程序的执行顺序为先上后下,先左后右