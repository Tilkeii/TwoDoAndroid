package twodo.twodo.dto.mapper;

import java.util.ArrayList;

import twodo.twodo.dto.model.EMatch;
import twodo.twodo.dto.model.Match;

public class MatchMapper {

    public Match map(EMatch eMatch) {
        Match match = new Match();

        match.setId(eMatch.getId());
        match.setStatusUser1(eMatch.getStatusUser1());
        match.setStatusUser2(eMatch.getStatusUser2());
        match.setDate(eMatch.getDate());
        match.setUserId1(eMatch.getUserId1());
        match.setUserId2(eMatch.getUserId2());
        match.setCategoryId(eMatch.getCategoryId());
        match.setFirstname(eMatch.getFirstname());
        match.setLastname(eMatch.getLastname());
        match.setPhone(eMatch.getPhone());
        match.setEmail(eMatch.getEmail());
        match.setAddress(eMatch.getAddress());

        return match;
    }

    public ArrayList<Match> map(ArrayList<EMatch> eMatchList) {
        ArrayList<Match> matchList = new ArrayList<>();

        for (EMatch eMatch: eMatchList) {
            matchList.add(this.map(eMatch));
        }

        return matchList;
    }
}
