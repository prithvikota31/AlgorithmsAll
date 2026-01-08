class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //g for greed
        //s for size
        // give smallest possible size to smallest possible greed
        // first so that bigger ones can be saved later
        //~eg: g = {1, 3} s = {5, 2} => 1 -> 5 (3->2) x
        //sorting helps to give the minimum size, minimum possible size
        Arrays.sort(g);
        Arrays.sort(s);

        //g = {1, 2, 3}
        //     l
        // s = {1, 1}
        //      r

        int l = 0; //s
        int r = 0; //r

        if(s.length == 0)   return 0;

        while (r < s.length && l < g.length) {
            if (g[l] <= s[r]) {
                l++;
            }
            r++;
        }


        return l;
        

    }
}