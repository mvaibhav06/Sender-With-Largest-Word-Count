import java.util.HashMap;

public class MessageSender {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> temp = new HashMap<>();
        for(int i=0; i<messages.length; i++){
            String a = messages[i];
            String[] b = a.split(" ");

            if(temp.containsKey(senders[i])){
                temp.put(senders[i], temp.get(senders[i])+b.length);
            }else{
                temp.put(senders[i], b.length);
            }
        }

        String out = "";
        int max = Integer.MIN_VALUE;

        for(String key: temp.keySet()){
            if(temp.get(key) > max){
                max = temp.get(key);
                out = key;
            }else if(temp.get(key) == max){
                if(out.compareTo(key) < 0){
                    out = key;
                }
            }
        }
        return out;
    }
}
