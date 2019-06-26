package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
	
	private String mentorName;
	private int updateCount;
	
	public Mentor(String mentorName) {
		this.mentorName = mentorName;
	}
	
	
	@Override
	public void update(TaskQueue taskQueue) {
		if (taskQueue.getTasks().size() == 1){
			System.out.println("Mentor: " + mentorName  + " has new task in list " +
				taskQueue.getUserName() + "\n" + "total: " + taskQueue.getTasks().size() + "task");
			updateCount++;}
		else{
			System.out.println("Mentor: " + mentorName  + " has new task in list " +
				taskQueue.getUserName() + "\n" + "total: " + taskQueue.getTasks().size() + "tasks");
			updateCount++;}
		
	}
	
	public String getMentorName() {
		return mentorName;
	}
	
	public int getUpdateCount() {
		return updateCount;
	}
}
