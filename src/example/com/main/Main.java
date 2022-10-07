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
        int a =10;
        int b = 10;
        int c = 10;
        int d = 10;

        System.out.println(a++);
        System.out.println(++b);
        System.out.println(c--);
        System.out.println(--d);

        a = 10;
        b = 10;
        c = 10;
        d = 10;
        b = ++a;
        System.out.println("a= " + a + " b= " + b);
        d = c++;
        System.out.println("c= " + c + " d = " + d);

    }
}
