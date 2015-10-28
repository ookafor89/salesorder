package com.c2g.product_service.product.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Consume;
import org.apache.camel.Handler;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;



public class SplitterBean {



@Handler
public List<String> split(String jsonArray) throws Exception {
	   List<String> splittedJsonElements = new ArrayList<String>();
	    ObjectMapper jsonMapper = new ObjectMapper();
	    JsonNode jsonNode = jsonMapper.readTree(jsonArray);

	    if (jsonNode.isArray()) {
	        ArrayNode arrayNode = (ArrayNode) jsonNode;
	        for (int i = 0; i < arrayNode.size(); i++) {
	            JsonNode individualElement = arrayNode.get(i);
	            splittedJsonElements.add(individualElement.toString());
	        }
	    }
	    return splittedJsonElements;
}
}
 