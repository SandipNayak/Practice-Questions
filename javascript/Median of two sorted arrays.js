/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    nums2.map((num) => nums1.push(num));
    let sorted = nums1.sort((a, b) => {
        return a - b;
    });
    let median = 0;
    let length = sorted.length;
    if (length % 2 == 0) {
        console.log(sorted[length / 2] + sorted[length / 2 - 1]);
        median = (sorted[length / 2] + sorted[length / 2 - 1]) / 2;
    } else median = sorted[Math.floor(length / 2)];
    return median;
};
