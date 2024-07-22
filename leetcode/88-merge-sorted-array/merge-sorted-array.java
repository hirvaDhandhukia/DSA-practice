class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // catch: stored inside the array nums1



        int[] temp = new int[m];
        int i=0,j=0,k = 0;

        while(k<m) {
            temp[k] = nums1[k++];
        }
        k=0;
        while(k<m && j<n) {
            if(temp[k] <= nums2[j]) {
                nums1[i++] = temp[k++];
            } else {
                nums1[i++] = nums2[j++];
            }
        }

        while(k<m) {
            nums1[i++] = temp[k++];
        }
        while(j<n) {
            nums1[i++] = nums2[j++];
        }
    }
}