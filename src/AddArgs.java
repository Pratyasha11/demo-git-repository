public class AddArgs {

    public static void main(String[] args) {
        if (args.length > 0) {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum = sum + Integer.parseInt(args[i]);
            }
            System.out.println("After add all args :" + sum);
        } else {
            System.out.println("No arguments entered from commandline...:(");
            System.out.println("Java is simple");
        }
    }
    }
