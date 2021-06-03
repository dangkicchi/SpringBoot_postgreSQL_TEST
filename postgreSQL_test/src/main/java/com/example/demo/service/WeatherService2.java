package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.model.Weather2;
import com.example.demo.repository.WeatherRepository2;
@Service
@Transactional
public class WeatherService2{
  
  @Autowired
  WeatherRepository2 weatherRepository2;
  
  /**
   * レコードを全件取得する。
   * @return
   *
   */
  public List<Weather2> findAllWeatherData(){
    
    return weatherRepository2.findAll();
  }
  
  /**
   * 指定した都市のレコードを取得する。
   * @param name
   * @return
   */
  public List<Weather2> findWetherDataListByName(String name){
        
    return weatherRepository2.findByName(name);
  }
}
