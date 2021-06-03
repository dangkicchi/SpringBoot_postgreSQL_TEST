package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.Weather;
import com.example.demo.service.WeatherService;
@Controller
public class HelloController {
  @Autowired
  WeatherService weatherService;
  
  @RequestMapping("/1")
  public String hello(Model model) {
    
    model.addAttribute("hello", "Hello World First!?");
    
    List<Weather> weatherDataList = weatherService.findAllWeatherData();
    model.addAttribute("weatherDataList", weatherDataList);
        
    List<Weather> weatherDataTokyo = weatherService.findWetherDataListByName("東京");
    model.addAttribute("weatherDataTokyo", weatherDataTokyo);
        
    List<Weather> weatherDataNaha = weatherService.findWetherDataListByName("那覇");
    model.addAttribute("weatherDataNaha", weatherDataNaha);
     
    return "hello";
  }
}
