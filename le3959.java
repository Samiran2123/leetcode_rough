class le3959 {
    public boolean checkGoodInteger(int n) {
            int sum = 0 ;
            double squareSum = 0;
        while (n!=0){
           int lastdigit = n % 10;
            sum += lastdigit;
            squareSum += lastdigit * lastdigit;
            n /= 10;
        }
       
        return squareSum - sum >= 50;
    }
}