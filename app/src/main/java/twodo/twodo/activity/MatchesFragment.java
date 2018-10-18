package twodo.twodo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

import twodo.twodo.R;
import twodo.twodo.adapter.RecyclerViewAdapter;
import twodo.twodo.dto.model.User;

public class MatchesFragment extends Fragment {

    RecyclerViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_matches, container, false);

        ArrayList<User> matches = new ArrayList<>();
        matches.add(new User(1, "Pierre", "Dupont", "0175394758", "pierredupont@sfr.fr", "4 av. de la mairie, 75002 Paris", "blabla", "Ménage", null, "Je fais le ménage tous les jours !", null, "Informatique", null, null, "01/08/2018", 56));
        matches.add(new User(1, "Paul", "Dubois", "0639463649", "pdubois@free.fr", "13 av. de l'opéra, 75003 Paris", "blabla", "Informatique", null, "Technicien hardware répare tout type de machine.", null, "Ménage", null, null, "11/02/2018", 65));
        matches.add(new User(1, "Jacques", "Dupond", "0184930575", "dupont.pierre@hotmail.fr", "22 rue Anatole France, 75010 Paris", "blabla", "Travaux", null, "Je suis un bricoleur du dimanche", null, "Soins", null, null, "19/12/2018", 34));
        matches.add(new User(1, "Jean", "Lefevre", "0759495825", "jeanjean@sfr.fr", "14 av. des Arbres, 75008 Paris", "blabla", "Soins", null, "Je suis médecin, je peux aider régulièrement hors heures de travail.", null, "Informatique", null, null, "08/11/2018", 23));
        matches.add(new User(1, "Robert", "Durand", "0846298838", "robdurand@free.fr", "5 impasse des graviers, 75005 Paris", "blabla", "Ménage", null, "Homme au foyer, s'y connait bien en nettoyage.", null, "Travaux", null, null, "25/06/2018", 44));

        RecyclerView recyclerView = view.findViewById(R.id.matches);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        adapter = new RecyclerViewAdapter(view.getContext(),matches);
        recyclerView.setAdapter(adapter);

        return view;
    }
}