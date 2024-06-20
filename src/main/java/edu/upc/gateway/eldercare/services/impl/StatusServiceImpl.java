package edu.upc.gateway.eldercare.services.impl;

import edu.upc.gateway.eldercare.model.Status;
import edu.upc.gateway.eldercare.repositories.StatusRepository;
import edu.upc.gateway.eldercare.services.StatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    private final StatusRepository statusRepository;

    public StatusServiceImpl(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    public List<Status> getAllStatus() {
        return statusRepository.findAll();
    }

    @Override
    public Status createStatus(Status status) {
        return statusRepository.save(status);
    }
}
