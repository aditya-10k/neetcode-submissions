class TimeMap {

    Map<String , TreeMap<Integer , String>> times ; 

    public TimeMap() {
        
        times = new HashMap<>(); 
    }
    
    public void set(String key, String value, int timestamp) {
        
        times.computeIfAbsent(key , k -> new TreeMap<>()).put(timestamp , value);
    }
    
    public String get(String key, int timestamp) {

        if(!times.containsKey(key)) return "";

        TreeMap<Integer , String> map = times.get(key);

        Map.Entry<Integer , String> entry = map.floorEntry(timestamp);

        return entry == null ? "" : entry.getValue();
        
    }
}
