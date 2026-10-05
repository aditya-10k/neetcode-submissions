class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> al = new ArrayList<>();

        al.add(new ArrayList<>());
        al.get(0).add(strs[0]);

        for(int i = 1 ; i< strs.length ; i++){

            boolean deployed = false ;

            for(int j = 0 ; j< al.size() ;j++){

                String str = al.get(j).get(0);

                if(compare(strs[i], str)){
                    al.get(j).add(strs[i]);
                    deployed= true ;
                    break ; 
                }
            }
            if(!deployed){
            al.add(new ArrayList<>());
            al.get(al.size()-1).add(strs[i]);
            }
        }

        return al ; 
        
    }

    public boolean compare(String a ,  String b){

        int arr[] = new int[26];

        if(a.length()!= b.length())return false ; 

        for(int i = 0 ; i< a.length() ; i++){

            arr[a.charAt(i) - 97] +=1 ;
            arr[b.charAt(i) - 97] -=1 ;
        }

        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]!=0) return false ; 
        }

        return true ; 
        
    }
}
