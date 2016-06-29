package org.gregm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Example {

    static final Logger LOGGER = LoggerFactory.getLogger(Example.class);

    public static void main(String[] args) throws UnknownHostException {
        LOGGER.info("log - mongo main class begins");

        MongoClient mongoClient = new MongoClient();
        DB db = mongoClient.getDB("test");
        DBCollection collection = db.getCollection("hello");
        DBObject document = collection.findOne();
        System.out.println(document);
    }
}
