package group6.eda397_2016.chalmers.se.pinder.temp;

import java.util.ArrayList;
import java.util.List;

import group6.eda397_2016.chalmers.se.pinder.dao.Database;
import group6.eda397_2016.chalmers.se.pinder.model.Profile;
import group6.eda397_2016.chalmers.se.pinder.model.Skill;
import group6.eda397_2016.chalmers.se.pinder.model.Task;


/**
 * An implementation of the Database interface. Provides a runtime storage for the entities of the
 * application. This class is actually a singleton, which means only one instance will exist while
 * the application is opened.
 */
public class DatabaseLocal implements Database{
    private static volatile DatabaseLocal instance;
    private volatile List<Profile> profiles;
    private volatile List<Task> tasks;

    private DatabaseLocal(){
        profiles = new ArrayList<>();
        tasks = new ArrayList<>();
        List<Skill> skills1 = new ArrayList<>();
        skills1.add(Skill.CPlusPlus);
        skills1.add(Skill.Java);
        profiles.add(new Profile(0,"John Doe",skills1));
        profiles.add(new Profile(1,"Jane Doe",new ArrayList<Skill>()));
        tasks.add(new Task(0,"Task 1","The first task",5));
        tasks.add(new Task(1,"Task 2","The second task",3));
    }

    public synchronized static DatabaseLocal getInstance(){
        if(instance == null){
            instance = new DatabaseLocal();
        }
        return instance;
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public List<Profile> getAllProfiles() {
        return profiles;
    }

    @Override
    public void createProfile(Profile profile) {
        profiles.add(profile);
    }

    @Override
    public void createTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void assignProfilesToTask(List<Profile> profiles, Task task) {
        //TODO
    }

    @Override
    public Task getTaskById(int id) {
        return null;
    }

    @Override
    public Profile getProfileById(int id) {
        return null;
    }
}
