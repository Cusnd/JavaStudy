public class Test {
    String a = "100";
    int c = 200;
    // Test类的构造函数
    public Test(String a,int c) {
        System.out.println("This is a test of the Constructor");
        System.out.println(a+c);
    }

    public static void main(String[] args) {
        // 创建Test类的一个实例，这将调用构造函数
        Test testInstance = new Test("23",33);
    }
}
