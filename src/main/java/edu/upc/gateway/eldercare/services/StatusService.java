package edu.upc.gateway.eldercare.services;

import edu.upc.gateway.eldercare.model.Status;

import java.util.List;

public interface StatusService {
    List<Status> getAllStatus();
    Status createStatus(Status status);
}
