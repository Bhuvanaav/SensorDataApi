package com.company.sensor.service;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditAwareImpl implements AuditorAware {
    @Override
    public Optional getCurrentAuditor() {
        return Optional.empty();
    }
}
