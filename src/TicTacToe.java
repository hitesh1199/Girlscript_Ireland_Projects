public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("/---|---|---\\");
        int arr[][] = new int[3][3];
        int num = 1;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                arr[i][j] = num;
                num++;
            }
        }
        for(int i = 0;i<3;i++){
            System.out.println("| " + arr[i][0] + " | " + arr[i][1] + " | " + arr[i][2] + " |");
        }
        System.out.println("/---|---|---\\");
    }
}
