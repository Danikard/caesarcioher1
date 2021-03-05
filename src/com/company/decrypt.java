package com.company;

public class decrypt {
    public static String decrypt(String plainText,int n){
        if(n>26){
            n=n%26;
        }else if(n<0){
            n=(n%26)+26;
        }
        String encryptText="";
        int length= plainText.length();
        for (int i=0;i<length;i++){
            char alpha = plainText.charAt(i);
            if(Character.isLetter(alpha)){
                if(Character.isLowerCase(alpha)){
                    char al = (char)(alpha);
                    if(al<'a'){
                        encryptText += (char) (n + (26 -n));
                    } else{
                        encryptText +=al;
                    }
                }
                else if(Character.isUpperCase(alpha)){
                    char al = (char)(alpha);
                    if(al<'A'){
                        encryptText += (char) (n + (26 - n));
                    } else{
                        encryptText +=al;
                    }
                }
            }else{
                encryptText += alpha;
            }
        }
        return encryptText;
    }
}
