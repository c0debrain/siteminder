package com.mjiang.email.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class JsonUtil {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    private static final ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.registerModule(new JodaModule());
    }

    public static String convertToString(Object object) {
        String result = null;

        try {
            result = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            logger.warn("Failed to convert object to json string");
        }

        return result;
    }

    /**
     * Convert a json string with Class type
     *
     * @param json
     *
     * @param <T> clazz
     *
     * @return
     */
    @SuppressWarnings("all")
    public static <T> T convertToObject(String json, Class<T> clazz) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

        T result = null;

        try {
            result = objectMapper.readValue(json, clazz);
        } catch (IOException e) {
            logger.error("Failed to convert object to json string", e);
        }

        return result;
    }

    /**
     * Convert a json string with TypeReference like <code>new TypeReference<>(){}</code>
     *
     * @param json
     *
     * @param type
     *
     * @param <T>
     *
     * @return
     */
    public static <T> T convertToObject(String json, TypeReference<T> type) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

        T result = null;

        try {
            result = objectMapper.readValue(json, type);
        } catch (IOException e) {
            logger.warn("Failed to convert object to json string {}", json);
        }

        return result;
    }

    public static Map<String, Object> convertToMap(String json) {
        Map<String, Object> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();

        try {
            map = mapper.readValue(json, new TypeReference<HashMap<String, Object>>() {});
        } catch (IOException e) {
            logger.warn("Failed to convert Map<String, String> to json string {}", json);
        }

        return map;
    }
}
