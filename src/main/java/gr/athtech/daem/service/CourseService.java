package gr.athtech.daem.service;

import gr.athtech.daem.domain.AreaOfStudy;
import gr.athtech.daem.domain.Course;
import gr.athtech.daem.domain.User;

import java.util.List;
import java.util.Optional;

public interface CourseService extends BaseService<Course> {

	List<Course> findByName(String name);

	Optional<Course> findById(Long id);

	List<Course> findByTypeId(Long id);

	List<Course> findByUsersPending(List<User> usersPending);

	List<Course> findByUsersCompletedIn(List<User> usersCompleted);

	List<Course> findByAreasOfStudyIn(Long[] AreasOfStudyIds);

	Course findByCertificationId(Long id);
}
