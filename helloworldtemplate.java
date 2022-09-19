public class helloworldtemplate
{
    public static void main(String[] args)
    {
        String str0 = "Alpha";
        String str1 = "Bravo";
        String str2 = "Charlie";
        String str3 = "Delta";
        String str4 = "Echo";
        String[] myArray = {str0, str1, str2, str3, str4};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
        }
    }
}