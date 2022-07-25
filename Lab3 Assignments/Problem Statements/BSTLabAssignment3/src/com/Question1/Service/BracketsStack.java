package com.Question1.Service;

//import java.nio.BufferUnderflowException;
import java.util.*;

public class BracketsStack {
   public boolean Bracketbalancecheck(String expression) {
	   Stack<Character> stack = new Stack<>();
		for(int i=0; i<expression.length();i++) {
			char c = expression.charAt(i);
			if(c=='(' || c=='{' || c=='[') {
			stack.push(c);
			continue;
		}
		    if(stack.isEmpty()) { 
              return  false;
		    }
		    char x;
		    switch(c) {
		    case ')': 
		    	x = stack.pop();
		    	if(x=='{' || x=='[' ) 
		    		return false;
		    	break;
		    case '}':
		    	x = stack.pop();
		    	    if( x=='(' || x=='[' ) 
		    		return false;
		    	    break;
		    case ']':
		    	x = stack.pop();
		    	    if(x=='{' || x=='(') 
		    		return false;
		    	    break;
		    	}
		   }
		return(stack.isEmpty());	   
	}
   }
