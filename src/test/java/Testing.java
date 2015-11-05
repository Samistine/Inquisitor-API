/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.samistine.inquisitorapi.rest.objects.Response;
import com.google.gson.Gson;
import com.samistine.inquisitorapi.rest.HTTPClient;
import com.samistine.inquisitorapi.rest.RestPlayerStats;
import org.json.JSONObject;

/**
 *
 * @author Samuel
 */
public class Testing {

    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        JSONObject result = new JSONObject(new HTTPClient().get("http://localhost:8080/api/stats/Samistine"));

        Response response = gson.fromJson(result.toString(), Response.class);
        RestPlayerStats playerstats = new RestPlayerStats(response.getResult().getStats());
        System.out.println(playerstats.getCoords());

    }
    
    

}
