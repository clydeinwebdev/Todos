package com.example.clyde.todos;

/**
 * Created by Clyde on 11/27/2017.
 *
 * Shortcut Keys
 *
 * Alt + Insert : Add Constructor
 * Ctrl + I : Implement Interfaces
 * Ctrl + O : Implement Override methods
 */

public class Tasks {
    private int _id;
    private String _taskName;

    public Tasks(String _taskName) {
        this._taskName = _taskName;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_taskName(String _taskName) {
        this._taskName = _taskName;
    }

    public int get_id() {
        return _id;
    }

    public String get_taskName() {
        return _taskName;
    }
}
