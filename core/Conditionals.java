public class Conditionals {
    public static void main(String[] args) { 
        //If/Else
        int age = 70;

        if (age <= 18){
            System.out.println("Minor");
        }
        if (age >= 65){
            System.out.println("Elder");
        }
        else{
            System.out.println("Adult");
        }

        //Switch
        String role = "User";
        switch (role) {
            case "User":
                System.out.println("You are a User");
                break;
            case "Admin":
                System.out.println("You are an Admin");
                break;
        
            default:
                System.out.println("Access denied!");
                break;
        }
    }
    
}
