package ru.on8off.compose.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CounterService {
    @Autowired
    private RedisTemplate<String, Long> redisTemplate;

    public Long incrementAndGet(){
        return redisTemplate.boundValueOps("counter").increment();
    }
}
