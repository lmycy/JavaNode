public class node_01_注释和转义字符 {

    public static void main(String[] args) {
        //方法名不建议用中文,不过这里是学习记录笔记。方法名用中文更好明白调用的方法是做什么的
        System.out.println("-------------------注释-------------------");
        注释();
        System.out.println("-------------------转义字符-------------------");
        转义字符();
    }

    //注释
    private static void 注释(){
        /**
         * 注释主要用来对程序进行解释说明,可以提高代码的可阅读性
         */
        //单行注释:单行之后本行后的所有内容都不会对程序造成影响
        System.out.println("单行注释前的内容");//单行注释后的内容
        /*
            多行注释,在//的两个**之间可以任意输入内容作为注释(除了再次嵌套多行注释).多行注释可以放到一行代码的中间
         */
        System.out.println("多行注释前"
                /*
                    多行注释.....
                    多行注释.....
                    多行注释.....
                 */
                +
                "多行注释后"
        );
        //文档注释
    }

    //转义字符
    private static void 转义字符(){
        /**
         * Java中反斜杠'\'是一个特殊的字符,被称为转义字符,它的作用是用来转义后面一个字符。
         * 转义后的字符通常用于表示一个不可见的字符或具有特殊含义的字符，例如换行'\n'
         */
        //制表符:\t
        System.out.println("不带制表符");
        System.out.println("带\t制\t表\t符");
        //换行符:\n
        System.out.println("不带换行符");
        System.out.println("带\n换\n行\n符");
        //一个回车:\r
        System.out.println("不带回车");
        System.out.println("带回\r车");
        System.out.println("带回\r\n车");
        System.out.println("带回\n\r车");
        //一个\:\\
        System.out.println("输出一个斜杠:\\");
        System.out.println("输出两个斜杠:\\\\");
        //一个":\"
        System.out.println("输出一个双引号:\"");
        System.out.println("输出两个双引号:\"\"");
        //一个':\'
        System.out.println("输出一个单引号:\'");
        System.out.println("输出两个单引号:\'\'");
        //练习
        System.out.println("-------------------------------------------");
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
    }
}
