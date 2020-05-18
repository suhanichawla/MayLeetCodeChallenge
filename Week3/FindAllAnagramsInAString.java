package mayLeetCode;

public class FindAllAnagramsInAString {
	public List<Integer> findAnagrams(String s, String p) {
        int[] arr=new int[26];
        List<Integer> rv=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-'a']+=1;
        }
        int start=0,end=0;
        while(end<s.length()){
            if(arr[s.charAt(end)-'a']>0){
                 arr[s.charAt(end++) - 'a']--;
                 if(end-start==p.length()){
                     rv.add(start);
                 }
            }else if(end==start){
                start++;
                end++;
            }else{
                arr[s.charAt(start++) - 'a']++;
            }
           
        }
        return rv;
    }

}
