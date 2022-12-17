package org.pjatk;

public class Hamming {
    static public int distance(String gen_a, String gen_b) throws Exception {
        int dist = 0;
        if (gen_a.length() == gen_b.length()) {
            for (int i = 0; i < gen_a.length(); i++) {
                if (gen_a.charAt(i) != gen_b.charAt(i)) {
                    dist++;
                }
            }
            return dist;
        }
        throw new Exception("Not correct input");
    }
}
