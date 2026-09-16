class RandomNums{
    public static void main(String[] args) {

        int counter = 0;
        for(int i = 0; i <= 1000; i++){
            double x = Math.random();
            if(x > 0.5){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
