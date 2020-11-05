package com.cros.vue.service;

import com.cros.vue.common.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author MaLei
 * @description: Redis的服务类
 * @create 2020/6/30
 */
@Service
public class RedisService {
    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * 设置值
     * @param key
     * @param value
     * @return
     */
    public boolean set(final String key, Object value) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
        } catch (Exception e) {
            LogUtils.error("set error: key {"+key+"}, value {"+value+"}",e);
        }
        return result;
    }

    /**
     * 设置带有有效期的值
     * @param key
     * @param value
     * @param expireTime 过期秒数
     * @return
     */
    public boolean set(final String key, Object value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            LogUtils.error("set error: key {"+key+"}, value {"+value+"},expireTime {"+expireTime+"}",e);
        }
        return result;
    }

    /**
     * 检查当前key是否存在
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 获取指定key对应的值
     * @param key
     * @return
     */
    public Object get(final String key) {
        Object result = null;
        ValueOperations<Serializable, Object> operations = redisTemplate.opsForValue();
        result = operations.get(key);
        return result;
    }

    /**
     * 移除指定 key对应的对象值
     * @param key
     */
    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
        }
    }

    /**
     * 批量删除 delete
     * @param keys
     */
    public void remove(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
    }

    /**
     * batch delete with pattern
     * @param pattern
     */
    public void removePattern(final String pattern) {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0)
            redisTemplate.delete(keys);
    }

    /**
     * hash set。hash存储对象比较合适
     * @param key 一般情况下key代表一个hash名称，每个 hash 可以存储 2^32 - 1 键值对（40多亿）
     * @param hashKey 指定hash中存储的 一条记录的key
     * @param value 值
     */
    public void hashSet(String key, Object hashKey, Object value){
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        hash.put(key,hashKey,value);
    }

    /**
     * hash get
     * @param key
     * @param hashKey
     * @return
     */
    public Object hashGet(String key, Object hashKey){
        HashOperations<String, Object, Object>  hash = redisTemplate.opsForHash();
        return hash.get(key,hashKey);
    }

    /**
     * 查看hash表中指定字段是否存在
     * @param key
     * @param hashKey
     * @return
     */
    public boolean hashExists(String key, String hashKey) {
        return redisTemplate.opsForHash().hasKey(key, hashKey);
    }

    /**
     * 删除一个或者多个hash表字段
     * @param key
     * @param hashKey
     * @return
     */
    public Long hashDelete(String key, Object... hashKey) {
        return redisTemplate.opsForHash().delete(key, hashKey);
    }


    /**
     *  list push
     * @param k
     * @param v
     */
    public void push(String k,Object v){
        ListOperations<String, Object> list = redisTemplate.opsForList();
        list.rightPush(k,v);
    }

    /**
     *  list range
     * @param k
     * @param l
     * @param l1
     * @return
     */
    public List<Object> range(String k, long l, long l1){
        ListOperations<String, Object> list = redisTemplate.opsForList();
        return list.range(k,l,l1);
    }

    /**
     *  set add
     * @param key
     * @param value
     */
    public void setAdd(String key,Object value){
        SetOperations<String, Object> set = redisTemplate.opsForSet();
        set.add(key,value);
    }

    /**
     * set get
     * @param key
     * @return
     */
    public Set<Object> setMembers(String key){
        SetOperations<String, Object> set = redisTemplate.opsForSet();
        return set.members(key);
    }

    /**
     * ordered set add
     * @param key
     * @param value
     * @param scoure
     */
    public void zAdd(String key,Object value,double scoure){
        ZSetOperations<String, Object> zset = redisTemplate.opsForZSet();
        zset.add(key,value,scoure);
    }

    /**
     * rangeByScore
     * @param key
     * @param scoure
     * @param scoure1
     * @return
     */
    public Set<Object> rangeByScore(String key, double scoure, double scoure1){
        ZSetOperations<String, Object> zset = redisTemplate.opsForZSet();
        return zset.rangeByScore(key, scoure, scoure1);
    }
}
