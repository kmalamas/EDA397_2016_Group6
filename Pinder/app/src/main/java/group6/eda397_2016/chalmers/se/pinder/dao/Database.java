package group6.eda397_2016.chalmers.se.pinder.dao;


import java.util.List;

import group6.eda397_2016.chalmers.se.pinder.model.Profile;
import group6.eda397_2016.chalmers.se.pinder.model.Task;

public interface Database {
    public List<Task> getAllTasks();
    public List<Profile> getAllProfiles();
    public void createProfile(Profile profile);
    public void createTask(Task task);
    public void assignProfilesToTask(List<Profile> profiles, Task task);
    public Task getTaskById(int id);
    public Profile getProfileById(int id);
}