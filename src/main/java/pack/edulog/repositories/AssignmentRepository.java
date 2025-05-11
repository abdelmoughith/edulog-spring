package pack.edulog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.edulog.models.UML.Assignment;

import java.util.List;
import java.util.Optional;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    Optional<List<Assignment>> findByClassroomId(Long classroomId);
}