package ru.tretyakov.demoserver.Client;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface GifClient {
    ResponseEntity<Map> getRandomGif(String apiKey, String tag);
}
