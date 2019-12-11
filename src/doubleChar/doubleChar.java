package doubleChar;

public class doubleChar {
    //Given a string, return a string where for every char in the original, there are two chars.

    public String doubleChar(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++){
            temp = temp + str.charAt(i) + str.charAt(i);
        }
        return temp;
    }

}
