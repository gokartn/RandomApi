
package com.random.RandomApi;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class Server {
    private static Server instance = null;

    public static Server getInstance() {
        if (instance == null) {
            instance = new Server();
        }
        return instance;
    }
    
    
    public Data generateData() {
        Data data = new Data();
        return data;
    }
    
    @CrossOrigin
    @RequestMapping("/updateData")
    public Data updateData() {
        Random r = new Random();
        Data data = generateData();
        data.setLogger_id(r.nextInt(100));
        data.setChannels(r.nextInt(100));
        data.setOrg_id(r.nextInt(100));
        data.setPosition(r.nextInt(100));
        data.setProviderSetup(r.nextInt(100));
        data.setProviderView(r.nextInt(100));
        data.setMax4(0 + (4 - 0) * r.nextDouble());
        return data;
    }
}
