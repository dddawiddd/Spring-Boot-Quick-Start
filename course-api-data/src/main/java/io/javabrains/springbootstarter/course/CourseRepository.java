package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> { //@entity,@Id
	
	public List<Course> findByTopicId (String topicId);

	
	
	
	//it comes with data jpa CrudRepository so i don't need to prepare this VV methods
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
	// CrudRepository has crud in generic type
	
}