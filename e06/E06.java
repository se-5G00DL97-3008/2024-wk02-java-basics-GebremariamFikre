class E06 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Which multiplication table to show?");
        int productNum =in.nextInt();
        for (int i = 0; i <=10; i++) {
            int result = i * productNum;
            System.out.println(i + " * " + productNum + " = " + result);
        }
    }
}
