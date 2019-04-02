public class Main {

    public static void main(String[] args)
    {
        String whatToCrypt = "Java is cool!";

        Secret secret = new Secret(whatToCrypt);
        secret.encrypt();

        if(secret.isEncrypted())
        {
            String encryptedString = secret.toString();
            System.out.println(encryptedString);

            String decryptedString = secret.decrypt();

            if(!secret.isEncrypted())
            {
                System.out.println(decryptedString);
            }
            else
            {
                System.out.println("Something went wrong (2)...");
            }
        }
        else
        {
            System.out.println("Something went wrong (1)...");
        }
    }
}


