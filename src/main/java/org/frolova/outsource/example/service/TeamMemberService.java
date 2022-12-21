package org.frolova.outsource.example.service;

import lombok.RequiredArgsConstructor;
import org.frolova.outsource.example.model.TeamMember;
import org.frolova.outsource.example.repository.TeamMemberRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class TeamMemberService {
    private TeamMemberRepository repository;

    public TeamMember getTeamMemberById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
