package REST_API;

import java.util.ArrayList;

public class Jukebox {
    private String id;
    private String model;
    private ArrayList<Component> components;

    public Jukebox(String i, String m, Component [] c) {
        id = i;
        model = m;
        components = new ArrayList<>();
    }

    public void setId (String i) {
        id = i;
    }
    public void setModel (String m) {
        model = m;
    }
    public void setComponents (ArrayList <Component> c) {
        for (int i = 0; i < c.size(); i++) {
            components.add(c.get(i));
        }
    }

    public String getId() {
        return id;
    }
    public String getModel() {
        return model;
    }
    public ArrayList<Component> getComponents() {
        return components;
    }
}
