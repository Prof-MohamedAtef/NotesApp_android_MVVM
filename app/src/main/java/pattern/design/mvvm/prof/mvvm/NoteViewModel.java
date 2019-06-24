package pattern.design.mvvm.prof.mvvm;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Prof-Mohamed Atef on 24/06/2019.
 */

public class NoteViewModel extends AndroidViewModel {

    private NoteRepository repository;
    private LiveData<List<Note>> allNotes;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        repository=new NoteRepository(application);
        allNotes=repository.getAllNotes();
    }

    public void insert(Note note){
        repository.Insert(note);
    }

    public void update(Note note){
        repository.Update(note);
    }

    public void delete(Note note){
        repository.Delete(note);
    }

    public void deleteAllNotes(Note note){
        repository.deleteAllNotes();
    }

    public LiveData<List<Note>> getAllNotes(){
        return  allNotes;
    }


}
