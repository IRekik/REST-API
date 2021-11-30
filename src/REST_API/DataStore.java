package REST_API;

import java.util.Map;
import java.util.HashMap;

public class DataStore {
    private Map<String, Jukebox> jukeboxMap = new HashMap<>();
    private DataStore() {
        // data to test
        ArrayList <Component> dummy = new ArrayList<>();
        dummy.add(new Component("led_panel"));
        dummy.add(new Component("amplifier"));
        dummy.add(new Component("pcb"));
        jukeboxMap.put("5ca94a8ac470d3e47cd4713c", new Jukebox("5ca94a8ac470d3e47cd4713c", "fusion", dummy));
    }
    private static DataStore instance = new DataStore();
    public static DataStore getInstance() {
        return instance;
    }
    public Jukebox getJukeBox (String id) {
        return jukeboxMap.get(id);
    }
    public void addJukebox (Jukebox j) {
        jukeboxMap.put(j.getId(), j);
    }
}
