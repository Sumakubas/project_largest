public class calculate1 {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class result {
    public static void main(String args[]) {
        calculate1 c = new calculate1();
        System.out.println("Addition=" + c.add(5, 3));
        System.out.println("Substraction=" + c.sub(7, 3));
        System.out.println("Multiplication=" + c.multi(5, 3));
        System.out.println("Division=" + c.div(10, 5));
        //system.out.println("Area of rectangle"+c.area_recta(op1:10,op2:5))
        //system.out.println("Area of trianle"+c.area_tra(op1:10,op2:5))


    }
}
