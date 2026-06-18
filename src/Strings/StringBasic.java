package Strings;

public class StringBasic {
    public static void main(String[] args) {
        String first_name="Aryan";
        String last_name=new String("Sahu");
        System.out.println(first_name+ " " +last_name);

        String full_name =new String(first_name+last_name);
        System.out.println(full_name.length());
        System.out.println(first_name.charAt(0));
    }
}
