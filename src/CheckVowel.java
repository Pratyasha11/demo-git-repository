public class CheckVowel {
    public static void main(String[] args) {
        String name = args[0];
        int v = 0;
        for (int i=0; i < name . length() ; i++)
        {
            char ch = name.charAt(i);
            if(ch== 'A' || ch== 'E' || ch== 'I' || ch== 'O' || ch=='U')
            {
                System.out.println(ch);
                v++;
            }
        }
        System.out.println("No of Vowels :"+v);
    }
}
