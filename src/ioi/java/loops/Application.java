/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package ioi.java.loops;

import ioi.java.support.Example;

/**

 @author Conchraidh
 */
public class Application implements Example
{
	@Override
	public void example()
	{
		ForLoopExample forLoopExample = new ForLoopExample();
		DoWhileLoopExample doWhileLoopExample = new DoWhileLoopExample();
		ForeachExample foreachExample = new ForeachExample();
		WhileLoopExample whileLoopExample = new WhileLoopExample();
		//
		//	Run Examples
		//
		forLoopExample.example();
		doWhileLoopExample.example();
		foreachExample.example();
		whileLoopExample.example();
	}
}
