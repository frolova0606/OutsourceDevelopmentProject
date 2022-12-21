package org.frolova.outsource.example.service;

import lombok.RequiredArgsConstructor;
import org.frolova.outsource.example.model.Team;
import org.frolova.outsource.example.repository.TeamRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public Team getTeamById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
