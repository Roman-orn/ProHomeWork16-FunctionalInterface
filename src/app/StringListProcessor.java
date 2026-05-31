package app;

public class StringListProcessor {

    static int countUppercase(String str){
        int count = 0;
        for (char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        return count;
    };
}
