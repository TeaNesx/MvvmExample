package com.codingwithmitch.mvvmrecyclerview.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.AsyncTask;

import com.codingwithmitch.mvvmrecyclerview.models.NicePlace;
import com.codingwithmitch.mvvmrecyclerview.repositories.NicePlaceRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<List<NicePlace>> mNicePlaces;

    public LiveData<List<NicePlace>> getNicePlaces() {
        return  mNicePlaces;
    }

}
