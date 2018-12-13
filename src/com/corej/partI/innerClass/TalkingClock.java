package com.corej.partI.innerClass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {
	private int interval;
	private boolean beep;
	
	public TalkingClock(int interval, boolean beep) {
		super();
		this.interval = interval;
		this.beep = beep;
	}
	
	//内部类
	public class TimePrinter implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("At the tone, the time is " + new Date());
			if (TalkingClock.this.beep) {
				Toolkit.getDefaultToolkit().beep();
			}
		} 
	}
	
	//局部内部类
	public void startLocal(int interval, boolean beep) {
		class LocalTimePrinter implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("At the tone, the time is " + new Date());
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		ActionListener listener = new LocalTimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	//匿名内部类
	public void startAnonymous(int interval, boolean beep) {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("At the tone, the time is " + new Date());
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	//lambda实现
	public void startLambda(int interval, boolean beep) {
		Timer t = new Timer(interval, e -> {
			System.out.println("At the tone, the time is " + new Date());
			if (beep) {
				Toolkit.getDefaultToolkit().beep();
			}
		});
		t.start();
	}
 }
