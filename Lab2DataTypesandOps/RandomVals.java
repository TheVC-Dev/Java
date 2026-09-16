class RandomVals{
    public static void main(String[] args) {

        double val1 = Math.random();
        double val2 = Math.random();
        double val3 = Math.random();

        boolean tiny1 = val1 < 0.5;
        boolean tiny2 = val2 < 0.5;
        boolean tiny3 = val3 < 0.5;

        
        if(tiny1 && tiny2 && tiny3){
            System.out.println("All are tiny");
        }
        else if((!tiny1 && !tiny2 && tiny3) || (!tiny1 && tiny2 && !tiny3) || (tiny1 && !tiny2 && !tiny3)){
            System.out.println("One is tiny");
        }
        else if(!tiny1 && !tiny2 && !tiny3){
            System.out.println("None are tiny");
        }
    }
}
