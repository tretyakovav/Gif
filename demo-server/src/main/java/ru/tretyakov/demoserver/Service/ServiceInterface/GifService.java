package ru.tretyakov.demoserver.Service.ServiceInterface;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface GifService {
    ResponseEntity<Map> getGif(String tag);
}
