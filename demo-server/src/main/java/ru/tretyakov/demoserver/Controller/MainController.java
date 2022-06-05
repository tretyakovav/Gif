package ru.tretyakov.demoserver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tretyakov.demoserver.Service.ServiceInterface.ExchangeRatesService;
import ru.tretyakov.demoserver.Service.ServiceInterface.GifService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/gg")
public class MainController<gifKey> {
    private ExchangeRatesService exchangeRatesService;
    private GifService gifService;
    @Value("${giphy.rich}")
    private String richTag;
    @Value("${giphy.broke}")
    private String brokeTag;
    @Value("${giphy.zero}")
    private String whatTag;
    @Value("${giphy.error}")
    private String errorTag;

    @Autowired
    public MainController(
            ExchangeRatesService exchangeRatesService,
            GifService gifService
    ) {
        this.exchangeRatesService = exchangeRatesService;
        this.gifService = gifService;
    }

    @GetMapping("/getcodes")
    public List<String> getCharCodes() {
        return exchangeRatesService.getCharCodes();
    }

    @GetMapping("/getgif/{code}")
    public ResponseEntity<Map> getGif(@PathVariable String code) {
        ResponseEntity<Map> result = null;
        int gifKey = -101;
        String gifTag = this.errorTag;
        if (code != null) {
            gifKey = exchangeRatesService.getKeyForTag(code);
        }
        switch (gifKey) {
            case 1:
                gifTag = this.richTag;
                break;
            case -1:
                gifTag = this.brokeTag;
                break;
            case 0:
                gifTag = this.whatTag;
        }
        result = gifService.getGif(gifTag);
        return result;
    }


}

