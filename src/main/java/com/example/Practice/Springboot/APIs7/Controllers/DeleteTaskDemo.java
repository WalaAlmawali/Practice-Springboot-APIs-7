package com.example.Practice.Springboot.APIs7.Controllers;

import java.util.ArrayList;

public class DeleteTaskDemo {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");

        System.out.println("Initial Task List : ");
        for(String task: tasks){
            System.out.println("* " + task);
        }

        String targetTask = "Finish report";
        System.out.println("Target Task: " +targetTask );

        boolean found = false;

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equalsIgnoreCase(targetTask)) {
                tasks.remove(i);
                System.out.println("Task "+targetTask+ " deleted successfully.");
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Task not found, no deletion performed ");

        }
        System.out.println("Final task list : " + tasks);

    }
}
