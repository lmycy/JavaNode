import com.sun.org.apache.xpath.internal.operations.Bool;

public class node_04_String类型以及转换基本数据类型 {
    public static void main(String[] args) {
        //方法名不建议用中文,不过这里是学习记录笔记。方法名用中文更好明白调用的方法是做什么的
        System.out.println("-------------------String-------------------");
        String();
        System.out.println("-------------------String转换-------------------");
        String转换();
    }

    private static  void String(){

    }

    private static void String转换(){
        //基本数据类型转换String类型:基本数据类型变量 + 任意字符串
        int i = 100;
        String s1 = i + "";
        float f = 1.1F;
        String s2 = f + "";
        double d = 1.1;
        String s3 = d + "";
        boolean b = false;
        String s4 = b + "";
        //String类型转换基本数据类型:通过基本数据类型的包装类(类型首字母大写对应的引用类型)的parse类型()方法
        String s5 = "123";
        String s6 = "sdfsd";
        byte b2 = Byte.parseByte(s5);
//        byte b3 = Byte.parseByte(s6);//如果是将非数值的字符串转成数值类型时会报错
        short s = Short.parseShort(s5);
        int i2 = Integer.parseInt(s5);
        long l = Long.parseLong(s5);
        float f2 = Float.parseFloat(s5);
        double d2 = Double.parseDouble(s5);
        boolean b4 = Boolean.parseBoolean(s5);
        boolean b5 = Boolean.parseBoolean("1");
        boolean b6 = Boolean.parseBoolean("0");
        boolean b7 = Boolean.parseBoolean("true");//只有true字符串转boolean才会是true,其他任何字符串都会转成false
        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);
        System.out.println("b6 = " + b6);
        System.out.println("b7 = " + b7);
    }
}
