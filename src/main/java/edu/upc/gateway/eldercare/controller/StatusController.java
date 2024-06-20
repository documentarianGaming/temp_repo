package edu.upc.gateway.eldercare.controller;

import edu.upc.gateway.eldercare.model.Status;
import edu.upc.gateway.eldercare.services.StatusService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Status", description = "the Status API")
@RestController
@RequestMapping("/api/Eldercare/v1") //@RequestMapping("/api/Eldercare/v1")
@CrossOrigin(origins = "http://localhost:8080")
public class StatusController {
    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @PostMapping("/status")
    public Status createStatus(@RequestBody Status status) {
        return statusService.createStatus(status);
    }

    @GetMapping("/status")
    public List<Status> getAllStatus() {
        return statusService.getAllStatus();
    }
}
