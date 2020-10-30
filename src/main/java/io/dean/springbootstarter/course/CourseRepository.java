package io.dean.springbootstarter.course;

import io.dean.springbootstarter.topic.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
//    public List<Course> findByName(String name);
//    public List<Course> findByDescription(String description);

    List<Course> findByTopicId(String topicId);

}
