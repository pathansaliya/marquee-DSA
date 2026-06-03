public class fun {
    
    static boolean isSecondLastEven(int n){
        int count=0;
        int temp=0;
        while(n>0){
            int digit=n%10;
            count++;
           if(count==2){
                temp=digit;
               break;
           }
           n=n/10;
        }
        if(temp%2==0)
            return true;
        else
            return false;
    }

   public static void main(String[]args) {
        isSecondLastEven(253265);
    }
}

}
