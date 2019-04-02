import encryptable.Encryptable;

import java.util.Random;

public class Secret implements Encryptable
{
    private String message;
    private boolean encrypted;
    private int shift;
    private Random generator;

    public Secret(String msg)
    {
        message = msg;

        generator = new Random();
        shift = 1 + generator.nextInt(25);
    }

    @Override
    public String toString()
    {
        return message;
    }

    @Override
    public void encrypt()
    {
        char[] aCharArray = message.toCharArray();
        message = "";

        for (int i=0; i < aCharArray.length; i++)
        {
            char aChar = aCharArray[i];
            aChar = (char) (aChar + shift);
            aCharArray[i] = aChar;
            message += aChar;
        }

        encrypted = true;
    }

    public boolean isEncrypted()
    {
        return encrypted;
    }

    @Override
    public String decrypt()
    {
        char[] aCharArray = message.toCharArray();
        message = "";

        for (int i=0; i < aCharArray.length; i++)
        {
            char aChar = aCharArray[i];
            aChar = (char) (aChar - shift);
            aCharArray[i] = aChar;
            message += aChar;
        }

        encrypted = false;

        return message;
    }
}
