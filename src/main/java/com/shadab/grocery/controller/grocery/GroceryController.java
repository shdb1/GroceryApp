package com.shadab.grocery.controller.grocery;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shadab.grocery.api.GroceryApi;
import com.shadab.grocery.service.GroceryOperationService;
import com.shadab.grocery.service.GroceryOperationServiceImpl;


@RestController
public class GroceryController implements GroceryApi {
@Autowired
GroceryOperationService groceryOperationService;

private static final Logger logger = LoggerFactory.getLogger(GroceryController.class);
    
    
    @Override
	public String home(Map<String, Object> model) {
		
		logger.info("Going To Initialize the Items For grocery Store");
		groceryOperationService.loadItemsInStore();
		logger.info("Item loaded Successfuly");
		return "App Initialized SuccessFully";
	}
	
}