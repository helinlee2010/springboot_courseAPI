package com.helinjava.courseapidata.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    //public List<Course> findByName(String name);
    //public List<Course> findByDescription(String desc);

    public List<Course> findByTopicId(String topicId);
}
