package test0911;

public class countTime {
    public int solution (String psw) {
        // write code here
        int count=0;
        for (int i = 0; i < psw.length(); i++) {
            char c=psw.charAt(i);
            if(c=='a'||c=='d'||c=='g'||c=='j'||c=='m'||c=='p'||c=='s'||c=='v'||c=='y'){
                count++;
            }else if(c=='w'||c=='z'||c=='q'||c=='t'||c=='k'||c=='o'||c=='h'||c=='e'||c=='u'){
                count=count+2;
            }else{
                count=count+3;
            }
        }
        return count;
    }
}

