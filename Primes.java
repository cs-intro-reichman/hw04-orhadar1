public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean isPrime[] = new boolean[n + 1];
        int count = 0;
        if (n < 2) {
         return;
        }
        int p = 2;
        for(int i = 2; i < isPrime.length ; i++){
            isPrime[i] = true;
        }
        while (p * p <= n) 
        {
            if(isPrime[p]){
                for (int k = 2 * p; k <= n; k += p)
                {
                isPrime[k] = false;
                }
            }
            p++;
        }
           for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }

        
        int percent = (int) Math.round(100.0 * count / n);

       
        System.out.println("There are " + count + " primes between 2 and " + n +
                           " (" + percent + "% are primes)");
        }
            
        
        

    }
