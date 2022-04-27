package Sorting;

public interface primeNumber {
    public static void main(String[] args) {
        boolean[] prime = new boolean[1001];
        for(int i = 0;i<prime.length;i++){
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        prime[2] = true;
        for(int i = 4;i<prime.length;i+=2){
            prime[i] = false;
        }
        for(int i = 3;i<=Math.sqrt(prime.length);i+=2){
            if(prime[i]){
                for(int j = i*i;j<prime.length;j+=i){
                    if(prime[j]){
                        prime[j] = false;
                    }


                }

            }
        }
        for (int i = 0; i <1+prime.length; i++) {
            if(prime[i]){
                System.out.print(i+", ");
            }

        }

    }
}
