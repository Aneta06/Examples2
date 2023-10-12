package oopgeneralsfight;

import java.util.ArrayList;
import java.util.List;

public class Fight {

    private List<General> generalList;

    public Fight(List<General> generalList) {
        this.generalList = generalList;
    }

    public List<General> forTheEmpire() {
        List<General> motivatedRomeGenerals = new ArrayList<>();
        for (General g : generalList) {
            if (g.getMotivationLevel() == 2 && g instanceof RomeEmpireGeneral) {
                motivatedRomeGenerals.add(g);
            }
        }
        return motivatedRomeGenerals;
    }
    public void startFight(){
        List<General> motivatedRomeGenerals = forTheEmpire();
        for (General attacker:motivatedRomeGenerals) {
            for (General attactedG:this.generalList) {
                attacker.punch(attactedG);
                attactedG.punch(attacker);
            }
        }
        int motivationGreek = 0;
        int motivationRome = 0;
        for (General g:this.generalList) {
            if(g instanceof GreekGeneral){
                motivationGreek += g.getMotivation();
            } else if(g instanceof RomeEmpireGeneral){
                motivationRome += g.getMotivation();
            }
        }
        if (motivationGreek >= motivationRome){
            for (General g:this.generalList) {
                if(g instanceof GreekGeneral){
                    g.toString();
                }
            }
        } else {
            for (General g:this.generalList) {
                if(g instanceof RomeEmpireGeneral){
                    g.toString();
                }
            }
        }
    }
}
