class Solution {
    public int firstUniqChar(String s) {
        HashMap<String , Integer> possible = new HashMap<String , Integer>();
        HashMap<String , Integer> bad = new HashMap<String , Integer>();
        for (int i =0; i< s.length() ; i++){
            if (bad.containsKey(String.valueOf(s.charAt(i))) == true){
                continue;
            }else if ( false ==possible.containsKey(String.valueOf(s.charAt(i)))){
                possible.put(String.valueOf(s.charAt(i)),i);
            }else if ( false != possible.containsKey(String.valueOf(s.charAt(i)))){
                possible.remove(String.valueOf(s.charAt(i)));
                bad.put(String.valueOf(s.charAt(i)),i);
            }
        }
        
        List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String, Integer>>(possible.entrySet()); 
        Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {  
            public int compare(Map.Entry<String, Integer> o1,  Map.Entry<String, Integer> o2) {  
                return (o1.getValue().intValue() - o2.getValue().intValue());  
            }  
        });
        
        if(infoIds.size() > 0){
            return infoIds.get(0).getValue();
        }
        
        return -1;
    }
}
