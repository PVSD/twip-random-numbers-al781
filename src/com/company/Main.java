package com.company;

import java.util.ArrayList;

public class Main
    {
        public static void main(String[] args)
            {
                ArrayList<Number> counts = new ArrayList<>();
                int iterations = 999999;
                for(int i=0; i<iterations;i++)
                    {
                        ArrayList<Number> checklist = new ArrayList<>();
                        for(int j = 1;j<101;j++)
                            checklist.add(new Number(j));
                        int counter = 0;
                        while(checklist.size() != 0)
                            {
                                counter++;
                                int random = ((int)(100 * Math.random()))+1;
                                for(int j = 0; j<checklist.size();j++)
                                    {
                                        if (checklist.get(j).number == random)
                                            checklist.remove(j);
                                    }
                            }
                        counts.add(new Number(counter));
                    }
                double average = 0;
                for(int i = 0; i <counts.size();i++)
                    {
                        average += counts.get(i).number;
                    }
                average /= counts.size();
                System.out.println(average);
            }
    }
