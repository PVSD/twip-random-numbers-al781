package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main
    {
        public static void main(String[] args)
            {
                System.out.println("Average for 100 Runs : " + Run(100));
                System.out.println("Average for 1000 Runs : " + Run(1000));
                System.out.println("Average for 10000 Runs : " + Run(10000));
            }
        private static double Run(int iteration)
            {
                List<Integer> counts = new ArrayList<>();
                for(int i=0; i<iteration;i++)
                {
                    List<Integer> checklist = new ArrayList<>();
                    for(int j = 1;j<=100;j++)
                        checklist.add(j);
                    int counter = 0;
                    while(checklist.size() != 0)
                    {
                        counter++;
                        int random = ((int)(100 * Math.random()))+1;
                        for(int j = 0; j<checklist.size();j++)
                        {
                            if (checklist.get(j) == random)
                                checklist.remove(j);
                        }
                    }
                    counts.add(counter);
                }
                double average = 0;
                for(int i = 0; i <counts.size();i++)
                {
                    average += counts.get(i);
                }
                average /= counts.size();
                return average;
            }
    }
