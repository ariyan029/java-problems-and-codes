public class ArrayBasic {
    public static void main(String[] args) {
    
    int[] intValues= {1,22,333,4444,55555,666666,7777777,88888888,999999999,1111111111};
  
    // System.out.println(intValues[0]);
    // System.out.println(intValues[1]);
    // System.out.println(intValues[2]);
    // System.out.println(intValues[3]);
    // System.out.println(intValues[4]);
    // System.out.println(intValues[5]);
    // System.out.println(intValues[6]);
    // System.out.println(intValues[7]);
    // System.out.println(intValues[8]);
    //this loop check in the array is called array travarsel OR one kind or array searching 
    for (int idx = 0; idx < intValues.length; idx++) {
        System.out.println(intValues[idx]);
    }
    
    }
}
