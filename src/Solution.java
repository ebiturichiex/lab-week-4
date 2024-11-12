//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public static void main(String[] args) {
                int[] nums = {5, 7, 7, 8, 8, 10}; // Example input
                int target = 8; // Example target
        int[] result = searchRange(nums, target); // Call searchRange method directly
        System.out.println("Start: " + result[0] + ", End: " + result[1]); // Output the result
    }

            public static int[] searchRange(int[] nums, int target) {
                int[] result = {-1, -1}; // Initialize result with -1 for both start and end positions
                result[0] = findFirstPosition(nums, target); // Find the first occurrence of target
                result[1] = findLastPosition(nums, target); // Find the last occurrence of target
                return result; // Return the start and end indices of target
            }

            private static int findFirstPosition(int[] nums, int target) {
                int left = 0, right = nums.length - 1;
                int index = -1; // Default index if target not found
                while (left <= right) {
                    int mid = left + (right - left) / 2; // Calculate mid-point to avoid overflow
                    if (nums[mid] == target) {
                        index = mid; // Target found, record index
                        right = mid - 1; // Continue searching on the left side for first occurrence
                    } else if (nums[mid] < target) {
                        left = mid + 1; // Search on the right side
                    } else {
                        right = mid - 1; // Search on the left side
                    }
                }
                return index;
            }

            private static int findLastPosition(int[] nums, int target) {
                int left = 0, right = nums.length - 1;
                int index = -1; // Default index if target not found
                while (left <= right) {
                    int mid = left + (right - left) / 2; // Calculate mid-point to avoid overflow
                    if (nums[mid] == target) {
                        index = mid; // Target found, record index
                        left = mid + 1; // Continue searching on the right side for last occurrence
                    } else if (nums[mid] < target) {
                        left = mid + 1; // Search on the right side
                    } else {
                        right = mid - 1; // Search on the left side
                    }
                }
                return index;
            }
        }

