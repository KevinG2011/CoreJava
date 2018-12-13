package com.corej.partI.proxy;

import static java.lang.System.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class TraceHandler implements InvocationHandler {
	
	private Object target;
	

	public TraceHandler(Object target) {
		super();
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		out.print(this.target);
		out.printf(".%s(",method.getName());
		if (args != null) {
			for (int i = 0; i < args.length; i++) {
				out.print(args[i]);
				if (i < args.length - 1) {
					out.print(", ");
				}
			}
		}
		out.println(")");
		
		return method.invoke(this.target, args);
	}

}
