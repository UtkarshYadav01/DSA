package on;

import practice.ArrayPractice;

import java.util.*;

public class July4_2025ArrayPractice implements ArrayPractice {

    public static void main(String[] args) {
        July4_2025ArrayPractice practice = new July4_2025ArrayPractice();

        int[] array = {5, 3, 8, 6, 3, 2, 7, 4, 5, 6};

        // Sample method calls
        System.out.println("Smallest: " + practice.findSmallest(array));
        System.out.println("Largest: " + practice.findLargest(array));
        System.out.println("Second Smallest and Largest: " + Arrays.toString(practice.findSecondSmallestAndLargest(array)));
        System.out.println("Reversed: " + Arrays.toString(practice.reverseArray(array)));

        System.out.print("Frequencies: ");
        practice.countFrequency(array);

        System.out.println("Increasing-Decreasing: " + Arrays.toString(practice.rearrangeIncreasingDecreasing(array)));
        System.out.println("Sum: " + practice.calculateSum(array));

        practice.rotateByKBlockSwap(array.clone(), 3);  // No output — in-place

        System.out.println("Average: " + practice.findAverage(array));
        System.out.println("Median: " + practice.findMedian(array));

        System.out.println("Remove Duplicates (Sorted): " + Arrays.toString(practice.removeDuplicatesSorted(array.clone())));
        System.out.println("Remove Duplicates (Unsorted): " + Arrays.toString(practice.removeDuplicatesUnsorted(array.clone())));
        System.out.println("Add Element (9): " + Arrays.toString(practice.addElement(array, 9)));

        System.out.println("Repeating Elements: " + Arrays.toString(practice.findRepeatingElements(array)));
        System.out.println("Non-Repeating Elements: " + Arrays.toString(practice.findNonRepeatingElements(array)));

        int[][] pairs = {{1, 2}, {3, 4}, {2, 1}, {4, 3}};
        System.out.print("Symmetric Pairs: ");
        practice.findSymmetricPairs(pairs);

        System.out.println("Max Product Subarray: " + practice.findMaxProductSubarray(array));
        System.out.println("Ranks: " + Arrays.toString(practice.replaceWithRanks(array)));
        System.out.println("Sorted by Frequency: " + Arrays.toString(practice.sortByFrequency(array)));

        System.out.println("Rotate Left by 2: " + Arrays.toString(practice.rotateLeft(array, 2)));
        System.out.println("Rotate Right by 2: " + Arrays.toString(practice.rotateRight(array, 2)));
        System.out.println("Equilibrium Index: " + practice.findEquilibriumIndex(array));
        System.out.println("Circular Rotate by 2: " + Arrays.toString(practice.circularRotate(array, 2)));

        int[] sortOrder = {3, 5, 6, 2, 4};
        System.out.println("Sorted by Another Array: " + Arrays.toString(practice.sortByAnotherArray(array, sortOrder)));

        System.out.println("Search 6: Index " + practice.searchElement(array, 6));
        int[] subArray = {3, 5};
        System.out.println("Is Subset: " + practice.isSubset(array, subArray));
    }

    @Override
    public int findSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    @Override
    public int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    @Override
    public int[] findSecondSmallestAndLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > max) {
                sMax = max;
                max = i;
            } else if (i > sMax && i != max) {
                sMax = i;
            }
            if (i < min) {
                sMin = min;
                min = i;
            } else if (i < sMin && i != min) {
                sMin = i;
            }
        }

        if (sMin == Integer.MAX_VALUE || sMax == Integer.MIN_VALUE) {
            return null; // Or throw new IllegalArgumentException("No second smallest/largest found");
        }

        return new int[]{sMin, sMax};
    }

    @Override
    public int[] reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    @Override
    public void countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
    }

    @Override
    public int[] rearrangeIncreasingDecreasing(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxInd = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxInd]) {
                    maxInd = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxInd];
            arr[maxInd] = temp;
        }
        return arr;
    }

    @Override
    public int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    @Override
    public void rotateByKBlockSwap(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        System.out.println("rotateByKBlockSwap: " + Arrays.toString(arr));
    }

    public void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    @Override
    public double findAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    @Override
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    @Override
    public int[] removeDuplicatesSorted(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }
        return result;
    }

    @Override
    public int[] removeDuplicatesUnsorted(int[] arr) {

        return removeDuplicatesSorted(arr);
    }

    @Override
    public int[] addElement(int[] arr, int element) {
        int n = arr.length;
        int[] result = new int[n + 1];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        result[result.length - 1] = element;
        return result;
    }

    @Override
    public int[] findRepeatingElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                resultList.add(entry.getKey());
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    @Override
    public int[] findNonRepeatingElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                resultList.add(entry.getKey());
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    @Override
    public void findSymmetricPairs(int[][] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] ints : arr) {
            int one = ints[0];
            int two = ints[1];
            if (map.containsKey(two) && map.get(two) == one) {
                System.out.print("(" + two + ", " + one + ") and (" + one + ", " + two + ")");
            } else {
                map.put(one, two);
            }
        }
        System.out.println();
    }

    @Override
    public int findMaxProductSubarray(int[] arr) {
        //5, 3, 8, 6, 3, 2, 7, 4, 5, 6
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

            }
        }
        return 0;
    }

    @Override
    public int[] replaceWithRanks(int[] arr) {
        // TODO: Implement logic
        return new int[0];
    }

    @Override
    public int[] sortByFrequency(int[] arr) {
        // TODO: Implement logic
        return new int[0];
    }

    @Override
    public int[] rotateLeft(int[] arr, int k) {
        // TODO: Implement logic
        return new int[0];
    }

    @Override
    public int[] rotateRight(int[] arr, int k) {
        // TODO: Implement logic
        return new int[0];
    }

    @Override
    public int findEquilibriumIndex(int[] arr) {
        // TODO: Implement logic
        return -1;
    }

    @Override
    public int[] circularRotate(int[] arr, int k) {
        // TODO: Implement logic
        return new int[0];
    }

    @Override
    public int[] sortByAnotherArray(int[] arr, int[] order) {
        // TODO: Implement logic
        return new int[0];
    }

    @Override
    public int searchElement(int[] arr, int target) {
        // TODO: Implement logic
        return -1;
    }

    @Override
    public boolean isSubset(int[] arr1, int[] arr2) {
        // TODO: Implement logic
        return false;
    }
}
