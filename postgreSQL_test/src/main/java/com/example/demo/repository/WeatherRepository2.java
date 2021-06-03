package com.example.demo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Weather2;
@Repository
public interface WeatherRepository2 extends JpaRepository<Weather2, Integer> {
  
  List<Weather2> findByName(String name);
}
