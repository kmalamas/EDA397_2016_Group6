package group6.eda397_2016.chalmers.se.pinder;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import group6.eda397_2016.chalmers.se.pinder.listhelpers.ProfileAdapter;
import group6.eda397_2016.chalmers.se.pinder.listhelpers.TaskAdapter;
import group6.eda397_2016.chalmers.se.pinder.model.Profile;
import group6.eda397_2016.chalmers.se.pinder.model.Task;

/**
 * Created by fredrikholmdahl on 16-04-21.
 */
public class TasksFragment extends Fragment{

    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for login
        view = inflater.inflate(R.layout.fragment_tasks, container, false);
        ListView listView = (ListView)view.findViewById(R.id.taskList);
        List<Task> tasks = ((PinderApplication)getActivity().getApplication()).getDatabase().getAllTasks();
        final ArrayAdapter adapter = new TaskAdapter(getActivity(),
                R.layout.listelement, tasks);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Task item = (Task) parent.getItemAtPosition(position);
                Log.i(getClass().getName(),item.toString());
            }
        });


        return view;
    }




}
