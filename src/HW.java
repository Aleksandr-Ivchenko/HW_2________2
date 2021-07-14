public class HW {
    public static void main (String[] args) {
        String arr[][] = {{"1","2","3","f" },{"5","6","r","8"}};
        int sum = 0;
        try
        {
            System.out.println(arr[1][4]);
        }
        catch (ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("MyArraySizeException :" + e1.getMessage());
        }
         for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++)
                {
                    try
                    {
                   int c = Integer.parseInt(arr[i][j].trim());
                   sum = sum +c;
                    System.out.println(c);
                    }
                catch (NumberFormatException nfe)
                {
                    System.out.println("MyArrayDataException :" + nfe.getMessage());
                }
                }
             System.out.println("Сумма валидных ячеек: " + sum);
                }
    }
}




