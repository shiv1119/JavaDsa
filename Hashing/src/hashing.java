//Hashing is a method of sorting and indexing data
//The idea behind hashing is to allow large amounts of data
//to be indexed using keys commonly created by formulas

// Hash functions : it is a function that can be used to map of arbitrary size of to data of fixed size
//key - Input data provided by user
//Hash value : A value that is returned by Hash Function
//Hash Table : It is a data structure which implements an associative array abstract data types, a structure that can map keys to values
//Collision : A collision occurs when two different keys to a hash function produce the same output

//Hash functions : 1) Mode Functions - works for integer  2)ASCII functions - works for mainly strings
//collision solution :-
 //1)Direct chaining : Implements the buckets as linked lists. Colliding elements are stored in the lists
 //2) Open Addressing : colliding elements are stored in other vacant buckets. During storage and lookup these are found through so called probing
        //1)Linear probing - It places new key into closest following empty cell
        //2)Quadratic probing : Adding arbitrary quadratic polynomial to index until an empty cell is found i.e. 1^2 2^2 3^2 4^2 ....
        //3) Double hashing : Intervals between probes is computed by another hash functions





public class hashing {
    public static int mod(int number, int cellNumber){
        return (number % cellNumber);

    }

    public  static int modASCII(String str, int cellNumber){
        int total = 0;
        char c;
        for(int i = 0; i<str.length(); i++){
            total += (int) str.charAt(i);
        }
        return (total % cellNumber);
    }


    public static void main(String[] args){
        System.out.println(modASCII("ab", 20));
    }
}
