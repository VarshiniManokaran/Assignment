public class Assignment {
    public static void main(String[] args) {

        int numberr=66;
        

        numberr %= 7;  
        System.out.println("a %= 7: " + numberr); 


         int hello=99;
        numberr &= 7;  
        System.out.println("a &= 7: " + numberr); 


int convert=48;
        convert |= 10;  
        System.out.println("a |= 2: " + convert); 

        
        int bitwise=54;
        bitwise ^= 6;  
        System.out.println("bitwise ^= 3: " + bitwise); 


        int assign=1000;
         assign <<= 6; 
        System.out.println("assign<<= 2: " + assign); 

         int bbb=600;
        bbb>>= 1; 
        System.out.println("bbb >>= 1: " + bbb); 

int zzzz=786;
    zzzz >>>= 1; 
        System.out.println("zzzz >>>= 1: " + zzzz); 

    }
    
}
