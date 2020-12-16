package helpers;


import org.apache.commons.lang3.RandomStringUtils;

public class StringHelper {

    public static String randomStringWithGivenLength(int lenght){
        return RandomStringUtils.randomAlphabetic(lenght);
    }
    public static void main(String[] args)  {
        System.out.println(StringHelper.randomStringWithGivenLength(5) + "@gmail.com");
    }
}
