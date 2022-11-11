/* 
Треугольный массив
*/

public class massTriangle {

    public static char[][] result = new char[15][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++)
        {
            result[i] = new char[i + 1];
        }
        
        for (int j = 0; j < result.length; j++)
        {
            for (int k = 0; k < result[j].length; k++)
            {
                result[j][k] = '#';
                System.out.print(result[j][k] + "  ");
            }
            System.out.println();
        }
    }
}