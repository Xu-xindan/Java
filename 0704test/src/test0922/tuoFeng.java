package test0922;

public class tuoFeng {
    public static String camelCase(String newString) {
        // write code here
        char[] chars=newString.toCharArray();
        if(newString.length()==0){
            return "shoppe";
        }
        for (int i = 0; i <chars.length ; i++) {
            if((!(chars[i]<='z'&&chars[i]>='a'))&&(!(chars[i]>='0'&&chars[i]<='9'))&&(!(chars[i]<='Z'&&chars[i]>='A'))){
                chars[i]=' ';
            }
        }

        if(chars[0]<='Z'&&chars[0]>='A'){
            chars[0]= (char) (chars[0]+32);
        }
        for (int i = 1; i <chars.length ; i++) {
            if(chars[i]!=' '){
                if(chars[i]<='Z'&&chars[i]>='A'){
                    chars[i]= (char) (chars[i]+32);
                }
            }else{
                if(i+1<chars.length&&chars[i+1]<='z'&&chars[i+1]>='a'){
                    chars[i+1]= (char) (chars[i+1]-32);
                }
                i=i+2;
            }
        }
        String res=" ";
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]!=' '){
                res+=chars[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("hello world"));
    }
}
