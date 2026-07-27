class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ar = new ArrayList<>();

        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i] == "-1"){
                    continue ;
                }
            List<String> al = new ArrayList<>();
            al.add(strs[i]);
            for(int j = i+1 ; j <strs.length ; j++){
                if(strs[j] == "-1"){
                    continue ;
                }
                else{
                    if(checkAnagram(strs[i],strs[j])){
                        al.add(strs[j]);
                    strs[j] = "-1";
                    }
                }
            }
            ar.add(al);
        }
        return ar;
    }

    public boolean checkAnagram(String a , String b){

        int [] arr = new int[26];

        if(a.length() != b.length()){
            return false ; 
        }

        for(int i = 0 ; i <a.length(); i++){
            arr[a.charAt(i)- 'a'] += 1;
            arr[b.charAt(i)- 'a'] -= 1;
        }
        for(int i =0 ; i <26 ; i++){
            if(arr[i] != 0){
                return false ;
            }
        }
        return true ;
    }
}
