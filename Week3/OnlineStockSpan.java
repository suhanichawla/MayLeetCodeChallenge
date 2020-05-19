package mayLeetCode;

import java.util.Stack;

public class OnlineStockSpan {
	class StockSpanner {

	    Stack<Integer> prices, weights;

	    public StockSpanner() {
	        prices = new Stack();
	        weights = new Stack();
	    }
	    
	    public int next(int price) {
	         int wgt = 1;
	        while (!prices.isEmpty() && prices.peek() <= price) {
	            prices.pop();
	            wgt += weights.pop();
	        }

	        prices.push(price);
	        weights.push(wgt);
	        return wgt;
	        
	    }
	}

}
