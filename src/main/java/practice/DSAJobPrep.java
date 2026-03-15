package practice;

import java.util.List;
public interface DSAJobPrep {

    // Arrays & Strings
    int findKthLargest(int[] arr, int k);
    int[] slidingWindowMaximum(int[] arr, int k);
    int longestConsecutiveSubsequence(int[] arr);
    boolean checkAnagram(String s1, String s2);
    String longestPalindrome(String s);

    // Hashing
    int subarraySumEqualsK(int[] arr, int k);
    int longestSubarrayWithSumK(int[] arr, int k);
    int firstRepeatingElement(int[] arr);
    boolean containsDuplicate(int[] arr);

    // Stack & Queues
    int[] nextGreaterElement(int[] arr);
    boolean isValidParentheses(String s);
    int largestRectangleArea(int[] heights);
    int[] stockSpan(int[] prices);

    // Linked List
    ListNode reverseList(ListNode head);
    ListNode detectCycle(ListNode head);
    ListNode mergeKSortedLists(ListNode[] lists);
    boolean isPalindromeList(ListNode head);

    // Trees
    int maxDepth(TreeNode root);
    boolean isBalanced(TreeNode root);
    boolean isSymmetric(TreeNode root);
    List<Integer> levelOrder(TreeNode root);
    int diameterOfBinaryTree(TreeNode root);

    // Binary Search
    int binarySearch(int[] arr, int target);
    int findPeakElement(int[] arr);
    int searchInRotatedSortedArray(int[] arr, int target);
    int findSqrt(int x);

    // Recursion & Backtracking
    List<List<Integer>> generateSubsets(int[] nums);
    List<List<Integer>> permute(int[] nums);
    boolean wordSearch(char[][] board, String word);

    // Graphs
    boolean detectCycleUndirected(int V, List<List<Integer>> adj);
    boolean detectCycleDirected(int V, List<List<Integer>> adj);
    List<Integer> bfsTraversal(int V, List<List<Integer>> adj);
    List<Integer> dfsTraversal(int V, List<List<Integer>> adj);
    int numberOfProvinces(int[][] isConnected);

    // Dynamic Programming
    int longestIncreasingSubsequence(int[] nums);
    int editDistance(String s1, String s2);
    int knapsack(int W, int[] wt, int[] val, int n);
    int coinChange(int[] coins, int amount);
}
