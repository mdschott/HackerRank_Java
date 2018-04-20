//Shift an array d units to the left.

static String solve(int n, int d, int[]arr){
        
        StringBuilder result = new StringBuilder();
        int[] shiftedArr = new int[arr.length]; 
        
        if(n < 1 || n > 100000)
            return result.toString();
        
        if(d > n || d < 1)
            return result.toString();

        for(int i = 0; i < arr.length; i++)
        {
            
            shiftedArr[i] = arr[(i + d) % arr.length];
            
            result.append(shiftedArr[i]).append(" ");
        }
        
        return result.toString().trim();
    }