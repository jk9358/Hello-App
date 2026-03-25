public class UC6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            String allNames = nameBuilder.toString();

            allNames = allNames.substring(0, allNames.length() - 2);

            System.out.println("Hello, " + allNames + "!");
        }
    }
}