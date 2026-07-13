class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        String s = "123456789";  //largest string possible
        String l = String.valueOf(low); //convert low int into string
        String h = String.valueOf(high); // convert high int into stringg

        for (int len = l.length(); len <= h.length(); len++) {
            for (int start = 0; start <= 9 - len; start++) {
                int num = Integer.parseInt(s.substring(start, start + len));
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        return ans;
    }
}