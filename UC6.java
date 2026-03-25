public class UC6 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Enhanced for-loop to add names and a delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Convert to String
            String allNames = nameBuilder.toString();

            // Use substring to remove the trailing ", " (last 2 characters)
            // It takes from index 0 to (length - 2)
            allNames = allNames.substring(0, allNames.length() - 2);

            System.out.println("Hello, " + allNames + "!");
        }
    }
}