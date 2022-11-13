public class Methoddemo01 {
    public static void main(String[] args) {
        Bath();
        Bath();
        //调用一个方法：方法名+（）[但是它会自动加上（）]
        //方法就是打包一个东西（包括打印出来）
    }

    public static void Bath() {
        //定义一个方法，其必须在main方法的外面，class的里面
        System.out.println("准备衣物，洗漱用品");
        System.out.println("走到洗澡间");
        System.out.println("脱衣服");
        System.out.println("挤沐浴露");
        System.out.println("洗洗身上");
        System.out.println("冲干净");
        System.out.println("擦干");
        System.out.println("回家喽");
        //以上是方法的主部
    }
}
//和我课堂上学的不太一样，没有用到点运算符
//方法里面也可以调用方法