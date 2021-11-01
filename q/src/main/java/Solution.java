public class Solution {
    public static String getOrder(String input) {
        String[] names = "Burger Fries Chicken Pizza Sandwich Onionrings Milkshake Coke".split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder inputSB = new StringBuilder(input);
        while (input.length() > 0) {
            for (String name : names) {
                if (input.startsWith(name.toLowerCase())) {
                    stringBuilder.append(name).append(" ");
                    inputSB.delete(0, name.length());
                    input = inputSB.toString();
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Solution.getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));
    }
}
