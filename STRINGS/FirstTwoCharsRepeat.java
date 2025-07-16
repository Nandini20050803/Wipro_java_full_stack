public class FirstTwoCharsRepeat {
    public static String repeatFirstTwo(String str) {
        int n = str.length();
        String firstTwo = str.length() < 2 ? str : str.substring(0, 2);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(firstTwo);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "Nandini";
        String result = repeatFirstTwo(input);
        System.out.println(result);  
    }
}