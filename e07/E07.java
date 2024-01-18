class E07 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.println("Which multiplicand multiplication table to show?");
        int productNum =in.nextInt();
        System.out.println("Until which multiplier?");
        int multiplier = in .nextInt();
        System.out.println();
        for (int i = 1; i <= multiplier; i++) {
            int result = i * productNum;
            System.out.println(i + " * " + productNum + " = " + result);
        }
    }
}
