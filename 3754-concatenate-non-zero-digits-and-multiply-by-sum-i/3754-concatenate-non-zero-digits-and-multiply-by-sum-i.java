class Solution {
    public long sumAndMultiply(int n) {

        // APPROAH -1 BY MANIPULATING THE NUMBER FROM RIGHT TO LEFT IN INTEGER
        /*long sum = 0;
        long x=0;
        long pow=1;
        while(n>0){
            int i=n%10;
            sum+=i; 
            if(i>0){
                x+= i*pow; 
                pow*=10;
            }
            n/=10;
        }
        return sum*x;
        */



        //APPROACH - 2  BY COVERRTING THE ARRAY INTO STRING


        long x = 0, s = 0;
        for (char c : String.valueOf(n).toCharArray()){  // THIS LINE CONVERTS THE INTERGER TO STRING
            if (c != '0') {
                x = x * 10 + c - '0';
                s += c - '0';
            }
        }    
        return x * s;
        
    }
}