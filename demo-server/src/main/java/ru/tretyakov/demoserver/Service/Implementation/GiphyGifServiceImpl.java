package ru.tretyakov.demoserver.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.tretyakov.demoserver.Client.GifClient;
import ru.tretyakov.demoserver.Service.ServiceInterface.GifService;

import java.util.Map;

@Service
public class GiphyGifServiceImpl implements GifService {
    private GifClient gifClient;
    @Value("${giphy.api.key}")
    private String apiKey;
    @Autowired
    public GiphyGifServiceImpl(GifClient gifClient){
        this.gifClient = gifClient;
    }

}
