package mongodb;

import java.util.*;
import org.bson.Document;


import com.mongodb.MongoClient;
import com.mongodb.util.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.*;
import com.mongodb.*;
public class MongodbHelper {
	public static void main(String args[])
	{
		try{
			
			// 连接Mongodb服务
			MongoClient mongoClient =new MongoClient("localhost",27017);
			
			//连接到数据库
			MongoDatabase mongoDatabase =mongoClient.getDatabase("dingdian");
			
			MongoDatabase recordDatabase =mongoClient.getDatabase("recordDatabase");
			
			MongoCollection record= recordDatabase.getCollection("record");
			//System.out.println(mongoDatabase.getCollectionnames());
			for(String name : mongoDatabase.listCollectionNames())
			{
				if(!name.equals("section_url_collection"))
				{
					System.out.println(name);
					/*
					System.out.println(name);
					Document document=new Document("novel_name",name);
					record.insertOne(document);
					*/
					
				}
				
			}
			
		    
			
		}catch(Exception e)
		{
			System.err.println(e.getClass().getName()+":"+e.getMessage());
		}
	}

}

