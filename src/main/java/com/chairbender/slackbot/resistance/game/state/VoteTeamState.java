package com.chairbender.slackbot.resistance.game.state;

import com.chairbender.slackbot.resistance.game.model.Situation;

/**
 * State in which all players must vote on the selected team.
 *
 * Created by chairbender on 11/19/2015.
 */
public class VoteTeamState {
    private Situation situation;

    /**
     *
     * @param situation the current situation. Requires that the current team for the mission has been set.
     */
    public VoteTeamState(Situation situation) {
        this.situation = situation;
    }

    public Situation getSituation() {
        return situation;
    }
}
