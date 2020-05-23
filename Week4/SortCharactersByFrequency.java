package mayLeetCode;

public class SortCharactersByFrequency {
	public String frequencySort(String s) {
        int[] arr = new int[256];
        for(char c : s.toCharArray()){
            arr[c]++;
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> arr[b] - arr[a]);
        for(int i = 0; i < 256; i++){
            pq.offer((char)i);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Character c = pq.poll();
            for(int i = 0; i < arr[c]; i++){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }

}
