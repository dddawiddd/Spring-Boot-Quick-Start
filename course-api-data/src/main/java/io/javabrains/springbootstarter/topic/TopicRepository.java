package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> { // @entity,@Id

	// it comes with data jpa CrudRepository so i don't need to prepare this VV methods
	// getAllTopics()
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(String id)

	// CrudRepository has crud in generic type

}
