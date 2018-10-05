package com.singahnd.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.singahnd.entity.Student;
/**
 ************************************************* 
 * @ClassName: StudentDB 
 * @Description: TODO(学生数据类) 
 * @author mjy
 * @date 2018年5月24日 下午2:34:43 
 ************************************************
 */
@Component
public class StudentDB {
	
	@Autowired  
    private MongoTemplate mongoTemplate; 
	
	/**
	 ********************************************************* 
	 * @method: inserStudentOne 
	 * @Description: TODO(插入学生) 
	 * @Param  table
	 * @return void 
	 * @author mjy
	 *********************************************************
	 */
	public void inserStudentOne(String table, Student student){
		DBCollection collection = mongoTemplate.getCollection(table);
		DBObject doc = new BasicDBObject();
		doc.put("studentId", student.getStudentId());
		doc.put("studentName", student.getStudentName());
		doc.put("age", student.getAge());
		collection.insert(doc);
	}
	
	/**
	 ********************************************************* 
	 * @method: queryStudentById 
	 * @Description: TODO(根据id查询student) 
	 * @Param  studentId
	 * @return DBObject 
	 * @author mjy
	 *********************************************************
	 */
	public DBObject queryStudentById(String table, String studentId){
		DBCollection collection = mongoTemplate.getCollection(table);
		DBObject query = new BasicDBObject();
		query.put("studentId", studentId);
		DBObject result = collection.findOne(query);
		return result;
	}

}
