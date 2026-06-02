import java.util.*;

class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Chiranjeevi", 700);
        hm.put("Bala", 100);
        hm.put("Shyam", 200);
        hm.put("Radha", 500);
        System.out.println(hm);
        System.out.println(hm.put("Chiranjeevi", 1000)); 
        System.out.println(hm);
        Set<String> s = hm.keySet();
        System.out.println(s);
        Collection<Integer> c = hm.values();
        System.out.println(c);
        Set<Map.Entry<String, Integer>> s1 = hm.entrySet();
        System.out.println(s1);
        Iterator<Map.Entry<String, Integer>> it = s1.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> m1 = it.next();
            System.out.println(m1.getKey() + " " + m1.getValue());
            if (m1.getKey().equals("Radha")) {
                m1.setValue(10000);
            }
        }
        System.out.println(hm); 
    }
}
