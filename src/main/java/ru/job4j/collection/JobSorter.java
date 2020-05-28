package ru.job4j.collection;

import java.util.Comparator;

public class JobSorter {
    static class JobDescByName implements Comparator<Job> {
        @Override
        public int compare(Job o1, Job o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }
    static class JobAscByName implements Comparator<Job> {
        @Override
        public int compare(Job o1, Job o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    static class JobDescByPriority implements Comparator<Job> {
        @Override
        public int compare(Job o1, Job o2) {
            return Integer.compare(o2.getPriority(), o1.getPriority());
        }
    }
    static class JobAscByPriority implements Comparator<Job> {
        @Override
        public int compare(Job o1, Job o2) {
            return Integer.compare(o1.getPriority(), o2.getPriority());
        }
    }

    public static final JobDescByName sortByNameDesc(){
        return new JobDescByName();
    }

    public static final JobAscByName sortByNameAsc(){
        return new JobAscByName();
    }

    public static final JobDescByPriority sortByPriorityDesc(){
        return new JobDescByPriority();
    }

    public static final JobAscByPriority sortByPriorityAsc(){
        return new JobAscByPriority();
    }
}
