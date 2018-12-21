package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.domain.ProjectTask;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {
    ProjectTask getById(Long id);
}
