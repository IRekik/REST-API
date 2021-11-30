package REST_API;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import java.io.IOException;

public class PersonServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String requestUrl = request.getRequestURI();
        String id = requestUrl.substring(0, "/jukebox/".length());
        Jukebox jk = DataStore.getInstance().getJukeBox(id);

        if (jk != null) {
            String json = "{\n";
            json += "\"id\": " + JSONObject.quote(jk.getId()) + ",\n";
            json += "\"model\": " + jk.getModel() + "\n";
            json += "\"components\": " + jk.getComponents() + "\n";
            json += "}";
            response.getOutputStream().println(json);
        }
        else {
            response.getOutputStream().println("{}\n");
        }
    }

}
