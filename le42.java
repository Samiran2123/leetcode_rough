public class le42 {
    public int trap(int[] height) { 
        int n = height.length; 
        int s = 0; 
        int e = n - 1; 
        int lmax = 0; 
        int rmax = 0; 
        int water = 0; 
        
        while (s < e) { 
            if (height[s] < height[e]) { 
                if (height[s] >= lmax) { 
                    lmax = height[s]; 
                } else { 
                    water = water + (lmax - height[s]); 
                } 
                s++;
            } else { 
                if (height[e] >= rmax) { 
                    rmax = height[e]; 
                } else { 
                    water = water + (rmax - height[e]); 
                } 
                e--; 
            } 
        } 
        return water; 
    } 
}


