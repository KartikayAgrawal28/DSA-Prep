class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int ans=0, left=0;
    HashMap<Integer,Integer> map = new HashMap<>();
        
        
        for(int right=0 ; right<n ; right++){

            // expansion and addition of elment happens
            map.put(fruits[right] , map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                //shrinking of window happens until true condition

                map.put(fruits[left] , map.get(fruits[left])-1);

                // check for the frequency becomes zero

                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }

                left++;
            }

            ans = Math.max(ans, right-left+1); // here (right+left+1) refers the length of window

        }
        return ans;
    }
}