import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Map Basic
public class Map {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("cat","miaoMiao");
        hm.put("dog","wangWang");
        hm.put("bird","zhazha");

        System.out.println(hm);
//        System.out.println(hm.remove("cat"));   //返回 value
//        System.out.println(hm);

        System.out.println(hm.get("dog"));
        System.out.println(hm.values());
        System.out.println(hm.keySet());

        //遍历-先键后值
        Set<String> animal = hm.keySet();
        for(String i : animal){
            String value = hm.get(i);
            System.out.println(i+","+value);
        }

        //遍历-键值对
        Set<HashMap.Entry<String,String>> entrySet = hm.entrySet();
        System.out.println(entrySet);
        for(HashMap.Entry<String,String> entry:entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ',' +value);
        }

    }


}
