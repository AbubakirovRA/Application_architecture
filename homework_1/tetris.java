public class tetris {
    public static char[][] result = new char[15][30];
    public static void main(String[] args) {
        
        for (int j = 0; j < result.length; j++)
        {
            for (int k = 0; k < result[j].length; k++)
            {
                if (k == 0 || k == result[j].length-1){
                    result[j][k] = '|';
                }else{
                    result[j][k] = ' ';
                }
                System.out.print(result[j][k]);
            }
            System.out.println();
        }
    }
}

