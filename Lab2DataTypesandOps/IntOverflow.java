class IntOverflow{
    public static void main(String[] args) {
        System.out.println("Number is larger than the maximum int value. This will cause overflow!");
        int x = 50000;
        int y = x*x;
        System.out.println(y);
    }
}
