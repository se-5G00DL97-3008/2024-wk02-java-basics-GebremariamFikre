class E02 {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
        System.out.println("Give a number:");
        System.out.println();
        int num1 = in.nextInt();
        System.out.println();
        System.out.println("Give another number");
        System.out.println();
        int num2 = in.nextInt();
        System.out.println();
        System.out.println();
        int sum = num1 + num2;
        int multiplication = num1 * num2;
        int subtraction = num1 - num2;
        int division = num1/num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println();
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println();
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println();
        System.out.println(num1 + " / " + num2 + " = " + division);

    }
}
