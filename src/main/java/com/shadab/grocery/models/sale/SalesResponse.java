package com.shadab.grocery.models.sale;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shadab.grocery.models.Item;

/**
 * @author mshadab
 *
 */

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SalesResponse {
	
	public List<Transaction> getTransactionsPerformed() {
		return transactionsPerformed;
	}

	public void setTransactionsPerformed(List<Transaction> transactionsPerformed) {
		this.transactionsPerformed = transactionsPerformed;
	}

	List<Transaction>transactionsPerformed;

}
