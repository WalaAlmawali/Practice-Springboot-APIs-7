package com.example.Practice.Springboot.APIs7.Services;

import com.example.Practice.Springboot.APIs7.Entities.EventRegistration;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RegistrationService {

    private Map<Integer, EventRegistration> registrations = new HashMap<>();

    @PostConstruct
    public void InitializeData() {
        registrations.put(101, new EventRegistration(101, "Ahmed"));
        registrations.put(102, new EventRegistration(102, "Sara"));
        registrations.put(103, new EventRegistration(103, "Ali"));
        registrations.put(104, new EventRegistration(104, "Salim"));
        registrations.put(105, new EventRegistration(105, "Fatima"));
    }

    public String deleteMultipleByIds(List<Integer> ids) {

        List<Integer> deletedIds = new ArrayList<>();
        List<Integer> notFoundIds = new ArrayList<>();

        for (Integer id : ids) {
            if (registrations.containsKey(id)) {
                registrations.remove(id);
                deletedIds.add(id);
            } else {
                notFoundIds.add(id);
            }
        }
        return """
                 Bulk Deletion Completed
                 Total Requested: %d
                 Deleted Successfully: %d
                 Deleted IDs: %s
                 Not Found IDs: %s
                """
                .formatted(
                        ids.size(),
                        deletedIds.size(),
                        deletedIds,
                        notFoundIds
                );
    }
}
