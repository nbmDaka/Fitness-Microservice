package com.example.activityservice.controller;

import com.example.activityservice.dto.ActivityRequest;
import com.example.activityservice.dto.ActivityResponse;
import com.example.activityservice.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request) {
        return ResponseEntity.ok(activityService.trackActivity(request));
    }
}
