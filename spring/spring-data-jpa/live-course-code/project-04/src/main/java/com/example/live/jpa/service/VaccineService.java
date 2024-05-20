package com.example.live.jpa.service;

import com.example.live.jpa.view.View;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface VaccineService {
    <T extends View> List<T> getByVaccinePrice(Integer price, Class<T> cls);

}
