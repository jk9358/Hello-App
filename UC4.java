public class UC4 {
    public static void main(String[] args){
        StringBuilder namBuilder = new StringBuilder();
        String name = new String();
        for(int i = 0; i<args.length; i++){
            namBuilder.append(args[i]);
            if(i < args.length-1){
                namBuilder.append(", ");
            }
            name = namBuilder.toString();
            
        }
        System.out.println("Hello, " + name + "!");
    }
}