public class second {
        static boolean arms(int num){
            int count = 0;
            int temp = num;
            int temp2 = num;
            while (temp>0){
                count++;
                temp/=10;
            }
            double sum =0;
            while (temp2>0){
                int dig = temp2%10 ;
                sum += Math.pow(dig , count);
                temp2/=10;
            }
            if(num == sum){
                return true;
            }else{
                return false;
            }
        }

    public static void main(String[] args){
        for (int i =0 ; i<1000 ; i++){
            if (arms(i)){
                System.out.print(i +" ");
            }
        }
    }
}
