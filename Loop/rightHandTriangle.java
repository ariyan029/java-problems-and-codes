public class rightHandTriangle {
    public static void main(String[] args) {
        rightTriangle(5);
    }
    public static void rightTriangle(int rows){
        for (int i = 1 ;i<=rows;i++){
        for (int j = 1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
 }
}
}