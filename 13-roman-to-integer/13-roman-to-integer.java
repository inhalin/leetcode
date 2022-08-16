class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        String[] split = s.split("");
        int sum = roman.get(split[split.length - 1]);
        for (int i = split.length - 1; i > 0; i--) {
            if (roman.get(split[i]) <= roman.get(split[i - 1])) {
                sum += roman.get(split[i - 1]);
            } else {
                sum -= roman.get(split[i - 1]);
            }
        }
        return sum;
    }
}