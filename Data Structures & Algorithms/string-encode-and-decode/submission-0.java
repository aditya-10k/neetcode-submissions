class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for(String i : strs){
            char [] c = i.toCharArray();
            for(int j = 0 ; j < c.length ; j++){
                c[j] = (char)((int) c[j] + 1 %256) ;   
            }

            sb.append(c);
            sb.append(" ");
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        char [] c = str.toCharArray() ;
        StringBuilder sb = new StringBuilder();

        List<String> al = new ArrayList<>();

        for(int i = 0 ; i < c.length ; i++){

            

            if(c[i] != ' '){
                char ch = (char)((int) c[i] - 1 %256);
                sb.append(ch);
            }
            else{
                al.add(sb.toString());
                sb.setLength(0);
            }
        }

        return al ;

    }
}
