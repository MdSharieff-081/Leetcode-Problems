class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;

        int[] arr = new int[n + m];
        int i = 0, j = 0, d = 0;

        while (i < n && j < m) {
            
            if (nums1[i] < nums2[j]) {
                arr[d++] = nums1[i++];
            }
            
            
            else {
                arr[d++] = nums2[j++];
            }
        }

        while (i < n) {
            arr[d++] = nums1[i++];
        }

        while (j < m) {
            arr[d++] = nums2[j++];
        }

        int l=arr.length;
        if(l%2==0){
             return (arr[(l/2)-1] + arr[l/2])/2.0;
            
        }
        else{
            return arr[((l+1)/2)-1];
        }
        
    }
}