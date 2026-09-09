class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = min; i <= max; i++) {

            boolean found = false;

            for (int num : nums) {

                if (num == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                list.add(i);
            }
        }

        return list;
    }
}