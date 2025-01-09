public class multiplicationTable {
    public static void main(String[] args) {
        System.out.println("welcome to multiplication table calculator ");
        int mul=multiplication(6);

    }
    public static int multiplication(int num){
        for(int i = 1;i<=10;i++){
            int table=i*num;
            System.out.println(num+"x"+i+"="+table);
        }
        return 0;
    }
}
