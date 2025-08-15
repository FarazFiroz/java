public class Strings2 {
    public static void main(String[] args){
        String str = "Hello";
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for(int i = 0; i<str.length(); i++){
            sb.append(str.charAt(i));
            if(i<str.length()-1 && !vowels.contains(str.charAt(i)+"") && !vowels.contains(str.charAt(i+1)+"")){
                sb.append("-");
            } 
        }
        System.out.println(sb);
    }

}