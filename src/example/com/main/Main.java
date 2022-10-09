package example.com.main;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println(255);
//        System.out.println(0377);
//        System.out.println(0xff);
//        System.out.println(0b101);
//        System.out.println(12.33);
//        System.out.println(3e4);
//        System.out.println('A');
//        System.out.println('\u3012');
//        System.out.println("Hello");
//        System.out.println(true);
//        byte b = 10;
//        short s = 20;
//        int i = 30;
//        long l = 40L;
//        float f = 1.15F;
//        double d = 5.78;
//        char a ='A';
//        boolean o = true;
//
//        System.out.println("byte :" + b);
//        System.out.println("short: " + s);
//        System.out.println("int: " + i);
//        System.out.println("long: " + l);
//        System.out.println("float: " + f);
//        System.out.println("double: " + d);
//        System.out.println("char: " + a);
//        System.out.println("boolean:" + o);
//        String s1 = "tanaka";
//        int num = s1.length();
//        char c = s1.charAt(2);
//        System.out.println(num);
//        System.out.println(c);

//        char[] c;
//        c = new char[3];
//        int[] i = new int[3];
//        String str[] = {"Welcome", "to", "Java"};
//        c[0] = 'A';
//        c[1] = 'B';
//        c[2] = 'C';
//        i[0] = 100;
//        i[1] = 200;
//        i[2] = 300;
//        System.out.println("str[] のサイズ" + str.length);
//        System.out.println("c[0] :" + c[0]);
//        System.out.println("i[1] :" + i[1]);
//        System.out.println(c);
//        System.out.println(i);
//        System.out.println(str);
//        int i;
//        int[] array = new int[1];
//        System.out.println("array[0]の値" + array[0]);
//        int a = 10;
//        int b = a;
//        System.out.println("a: " + a + ", b:" + b);
//        b = 50;
//        System.out.println("a: " + a + ", b:" + b);
//        int[] a = new int[1];
//        int[] b = a;
//        a[0] = 10;
//        System.out.println("a[0]:" + a[0] + " b[0]" + b[0]);
//        b[0] = 50;
//        System.out.println("a[0]:" + a[0] + " b[0]" + b[0]);
//
//        String str = "Hello";
//        int a = 10;
//        int b = 20;
//        System.out.println(str + a);
//        System.out.println(str + a + b);
//        System.out.println(str + (a + b));
//        System.out.println(a + b + str);
//
//        int a = 10;
//        int b = 20;
//        int c = 10;
//        System.out.println("a == b:" + (a == b));
//        System.out.println("a == c:" + (a == c));
//        System.out.println("a != b:" + (a != b));
//        System.out.println("a != c" + (a != c));
//        System.out.println("a < b" + (a < b));
//        System.out.println("a <= b" + (a <= b));
//        System.out.println("a > b " + (a > b));
//        System.out.println("a >= c" + (a >= c));
//        String str1 = null;
//        String str2 = "";
//        int[] array1 = null;
//        int[] array2 = new int[1];
//        int num = 0;
//
//        System.out.println(str1 == null);
//        System.out.println(str2 == null);
//        System.out.println(array1 != null);
//        System.out.println(array2 != null);

//        int num = 20;
//        String str = "numの値は";
//        str += num < 10 ? "10未満" : "10以上";
//        System.out.println(str);

//        int num = 2;
//        switch(num) {
//            case 1:
//              System.out.println("numの値は１です");
//              break;
//            case 2:
//                System.out.println("numのあたちは２です");
//                break;
//            default:
//                System.out.println("defaultです");
//        }

//        int num = 0;
//        while(num < 5) {
//            System.out.println("num: " + num);
//            num ++;
//        }
//        int num = 0;
//         do {
//             System.out.println("num :" + num);
//             num ++;
//         } while(num < 5);
//        for(int count = 0; count < 5; count ++) {
//            System.out.println("count = " + count);
//        }
//        int count1 = 0;
//        for(; count1 < 5; count1++) {
//            System.out.print(count1);
//        }
//
//        System.out.println();
//
//        for(int count2 = 0; count2 < 5; ) {
//            System.out.print(count2++);
//        }

//        char[] array = {'a', 'b', 'c', 'd', 'e'};
//        for(char c: array) {
//            System.out.print(c + "");
//        }
//        System.out.println();
//        for(int count = 0; count < array.length; count++) {
//            System.out.print(array[count] + "");
//        }

//        for(int i = 1; i < 10; i ++) {
//            if ((i % 4) == 0) {
//                System.out.println(i + "　は４の倍数");
//            }
//        }

//        int num = 0;
//        for (int i = 0; i < 5; i++ ) {
//            switch (i % 2) {
//                case 0:
//                    num++;
//                    break;
//                case 1:
//                    break;
//            }
//        }
//        System.out.println("num: " + num);

//        for(int i = 1; i < 10; i ++) {
//            if ((i % 3) == 0) {
//                System.out.println("処理をスキップします");
//                continue;
//            }
//            System.out.println("i = " + i);
//        }
//        loop1:
//        for (int x =0; x < 3; x++) {
//            for(int y =0; y < 3; y++) {
//                System.out.println("x = " + x + "y = " + y);
//                if(x == 1 && y == 1) {
//                    System.out.println("break文の実行");
//                    break loop1;
//                }
//            }
//        }
//        System.out.println("-----------------------");
//
//        loop2:
//        for(int x = 0; x < 3; x++) {
//            for(int y = 0; y < 3; y++) {
//                System.out.println("x = " + x + " : y = " + y);
//                if (x == 1 && y ==1) {
//                    System.out.println("continue文の実行");
//                    continue loop2;
//                }
//            }
//        }

//        for(int x = 0; x < 3; x++) {
//            for(int y = 0; y < x; ++y)
//                System.out.println("a");
//            System.out.println("b");
//
//        }

//        int a =0;
//        boolean b = false;
//        while((a++ < 3) && !b) {
////            System.out.print("x ");
//            System.out.print(a);
////            if(a == 2) {
////                System.out.print("y ");
////            }
//        }

//        Employee a = new Employee();
//        a.setId(100);
//
//        Employee b = new Employee();
//        b.setId(200);

//        System.out.println("Aさん" + a.getId());
//        System.out.println("Bさん" + b.getId());

//        Test t = new Test();
//        t.myPrint();
//        t.myPrint(100);
//        t.myPrint(100, 200);
//        t.myPrint("yamamoto");

//        Employee a = new Employee();
//        Employee b = new Employee("yamamoto");
//        Employee c = new Employee(100);
//        Employee d = new Employee(100, "yamamoto");

//        System.out.println(Test.staticVal);
//        Test.methodB();
//
//        System.out.println("-----------------");
//        Test t = new Test(); //非staticメンバは、必ずインスタンスしなければいけない
//        System.out.println(t.instanceVal);
//        System.out.println(t.staticVal);
//        t.methodA();
//        t.methodB();
//        Employee emp = new Employee(100);
////        System.out.println("privateしてのインスタンス変数へのアクセス：" + emp.id);
//        System.out.println("publicしてのメソッドへアクセス" + emp.getId());

//        Sales s = new Sales();
//        System.out.println("clientName: " + s.getClientName());
//        System.out.println("id  :" + s.getId());
//        Super s1 = new Super();
//        s1.print("Java");
//        Sub s2 = new Sub();
//        s2.print("Java");

//        System.out.println("Foo()の呼び出し---------------");
//        Foo f1 = new Foo();
//        System.out.println("Foo(\"Hey\")の呼び出し--------");
//        Foo f2 = new Foo("Hey");
//        System.out.println("Foo(\"Bye\", 200)の呼び出し--------");
//        Foo f3 = new Foo("Bye", 200);

//        Sub s = new Sub();
//        s.methodB();

//        Sub s1 = new Sub();
//        Sub s2 = new Sub(10);

    }
}

abstract class X {
    protected abstract void methodA();
}

abstract class Y extends X {}

class Z extends Y {
    protected  void methodA(){}
}

abstract class Super{
    protected abstract void methodA();
    public void methodB(){}
}

class Sub extends Super {
    protected void methodA(){} //実装（オーバーライド）必須
    // public void methodA(){} これでもOK
    public void methodB(){}
}

//class Foo {
//    String s;
//    int i;
//
//    public Foo() {
//        this("Hello");
//    }
//
//    public Foo(String s) {
//        this(s, 1);
//    }
//
//    public Foo(String s, int i) {
//        this.s = s;
//        this.i = i;
//        System.out.println("String: " + this.s);
//        System.out.println("int  :" + this.i);
//    }
//}

//class Super {
//    public Super() {
//        System.out.println("Super()");
//    }
//
//    public Super(int a) {
//        System.out.println("Super(int a)");
//    }
//

//    int num;
//    public void methodA() {
//        num += 100;
//    }
//
//    public void print() {
//        System.out.println("num値 :" + num);
//    }
//    public void print(String s) {
//        System.out.println("Super print : " + s);
//    }
//    public void method() {}
//}

//class Sub extends Super{
//    public Sub() {
//        System.out.println("Sub()");
//    }
//
//    public Sub(int a) {
//        super(a);
//        System.out.println("Sub(int a)");
//    }
//    public void methodA() {
//        num += 500;
//    }
//    public void methodB() {
//        methodA();
//        print();
//        super.methodA();
//        print();
//    }
//    public void print(String s) {
//        s = "渡された文字列は" + s + "です";
//        System.out.println("Sub print : " + s);
//    }
//}

//class Test {
//
//    int instanceVal;
//    static int staticVal;
//
//    int methodA() {
//        return instanceVal;
//    }
//
//    int methodB(){
//        return staticVal;
//    }
//
//    static int methodD() {
//        return staticVal;
//    }
//
//    static int methodE() {
//        Test t = new Test();
//        return t.instanceVal;
//    }
//    int instanceVal = 100;
//    static int staticVal = 200;
//    void methodA() {
//        System.out.println("methodA():" + instanceVal);
//    }
//
//    static void methodB(){
//        System.out.println("methodB():" + staticVal);
//    }
//    void myPrint(){
//        System.out.println("myPrint()");
//    }
//
//    void myPrint(int a) {
//        System.out.println("myPrint(int a)");
//    }
//
//    void myPrint(int a, int b) {
//        System.out.println("myPrint(int a, int b)");
//    }
//
//    void myPrint(String s) {
//        System.out.println("myPrint(String s)");
//    }
//

//}

//class Sales extends Employee {
//    private String clientName = "SE";
//    public String getClientName() {
//       return clientName;
//    }
//}

//class Employee {
//    private String id = "100";
//    public String getId() {
//        return id;
//    }
//    public Employee(int i) {
//        id = 1;
//    }
//    public int getId() {
//        return id;
//    }
//    int id;
//    String name;
//    Employee(){
//        System.out.println("Employee()");
//    }
//    Employee(String name) {
//        System.out.println("Employee(String name)");
//    }
//    Employee(int id){
//        System.out.println("Employee(int id)");
//    }
//    Employee(int id, String name){
//        System.out.println("Employee(int id, String name)");
//    }
//    int id;
//    void setId(int i) {
//        id = i;
//    }
//
//    int getId() {
//        return id;
//    }
//
//    Employee(int i) {
//        this.id = i;
//    }
//}