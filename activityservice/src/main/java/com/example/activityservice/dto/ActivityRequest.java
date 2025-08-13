package com.example.activityservice.dto;

import com.example.activityservice.model.ActivityType;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ActivityRequest {
    private String userId;
    private ActivityType type; // ActivityType as String
    private Integer duration; // in minutes
    private Integer caloriesBurned; // in kcal
    private LocalDateTime startTime; // ISO-8601 format string
    private Map<String, Object> additionalMetrics; // JSON string for additional metrics

}
